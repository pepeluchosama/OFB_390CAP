/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.ofb.model;

import java.util.logging.Level;

import org.compiere.model.MClient;
import org.compiere.model.MInventory;
import org.compiere.model.MInventoryLine;
import org.compiere.model.MRequisition;
import org.compiere.model.MRequisitionLine;
import org.compiere.model.MWarehouse;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.adempiere.exceptions.AdempiereException;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.compiere.model.MUOMConversion;


/**
 *	Validator DEMO POSTA
 *
 *  @author mfrojas
 */
public class ModelOFBRequisitionUOM implements ModelValidator
{
	/**
	 *	Constructor.
	 *	The class is instantiated when logging in and client is selected/known
	 */
	public ModelOFBRequisitionUOM ()
	{
		super ();
	}	//	MyValidator

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(ModelOFBRequisitionUOM.class);
	/** Client			*/
	private int		m_AD_Client_ID = -1;
	

	/**
	 *	Initialize Validation
	 *	@param engine validation engine
	 *	@param client client
	 */
	public void initialize (ModelValidationEngine engine, MClient client)
	{
		//client = null for global validator
		if (client != null) {
			m_AD_Client_ID = client.getAD_Client_ID();
			log.info(client.toString());
		}
		else  {
			log.info("Initializing global validator: "+this.toString());
		}

		//	Tables to be monitored	
		//	Documents to be monitored
		
		engine.addModelChange(MRequisitionLine.Table_Name, this);


	}	//	initialize

    /**
     *	Model Change of a monitored Table.
     *	
     */
	public static final String DOCSTATUS_Drafted = "DR";
	public static final String DOCSTATUS_Completed = "CO";
	public static final String DOCSTATUS_InProgress = "IP";
	public static final String DOCSTATUS_Voided = "VO";
	
	
	public String modelChange (PO po, int type) throws Exception
	{
		log.info(po.get_TableName() + " Type: "+type);
		if((type == TYPE_BEFORE_NEW || type == TYPE_BEFORE_CHANGE) && po.get_Table_ID() == MRequisitionLine.Table_ID)
		{
			MRequisitionLine reql = (MRequisitionLine)po;
			//Se debe obtener la unidad de medida del producto de la linea de solicitud.
			//Si no hay producto, return
			if(reql.get_Value("M_Product_ID") == null)
				return null;
			if(reql.getM_Product_ID() < 1)
				return null;
			
			//Se validara si los campos de cantidad deseada y uom deseada estan llenos
			if(reql.get_Value("QtyToOrder") == null || reql.get_Value("C_UOM_To_ID") == null)
				return null;
			
			int uom = reql.getM_Product().getC_UOM_ID();
			int uomdeseada = reql.get_ValueAsInt("C_UOM_To_ID");
			BigDecimal qtytoorder = (BigDecimal)reql.get_Value("QtyToOrder");
			
			String sql = "SELECT coalesce(max(c_uom_conversion_id),0) FROM c_uom_conversion"
					+ " WHERE c_uom_to_id = "+uomdeseada+" AND c_uom_id = "+uom+" AND "
					+ " M_Product_ID = "+reql.getM_Product_ID();
			
			int conversion = DB.getSQLValue(po.get_TrxName(), sql);
			if(conversion > 0)
			{
				MUOMConversion conv = new MUOMConversion(po.getCtx(), conversion, po.get_TrxName());
				//La nueva cantidad que debe ir en el campo qty de la solicitud es la 
				//multiplicacion de cantidad deseada por el factor de destino a base
				BigDecimal qtyconv = qtytoorder.multiply(conv.getDivideRate());
				reql.setQty(qtyconv);
			}
			
			
		}
		return null;
	}	//	modelChange

	/**
	 *	Validate Document.
	 *	Called as first step of DocAction.prepareIt
     *	when you called addDocValidate for the table.
     *	Note that totals, etc. may not be correct.
	 *	@param po persistent object
	 *	@param timing see TIMING_ constants
     *	@return error message or null
	 */
	public String docValidate (PO po, int timing)
	{
		log.info(po.get_TableName() + " Timing: "+timing);
		return null;
	}	//	docValidate

	/**
	 *	User Login.
	 *	Called when preferences are set
	 *	@param AD_Org_ID org
	 *	@param AD_Role_ID role
	 *	@param AD_User_ID user
	 *	@return error message or null
	 */
	public String login (int AD_Org_ID, int AD_Role_ID, int AD_User_ID)
	{
		log.info("AD_User_ID=" + AD_User_ID);

		return null;
	}	//	login

	/**
	 *	Get Client to be monitored
	 *	@return AD_Client_ID client
	 */
	public int getAD_Client_ID()
	{
		return m_AD_Client_ID;
	}	//	getAD_Client_ID

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString ()
	{
		StringBuffer sb = new StringBuffer ("QSS_Validator");
		return sb.toString ();
	}	//	toString
}	