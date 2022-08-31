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

import org.compiere.model.MClient;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MRequisition;
import org.compiere.model.MRequisitionLine;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;

import org.compiere.util.CLogger;

/**
 *	Validator default OFB
 *
 *  @author Italo Ni�oles
 */
public class ModelOFBCreateRequisitonFromOrder implements ModelValidator
{
	/**
	 *	Constructor.
	 *	The class is instantiated when logging in and client is selected/known
	 */
	public ModelOFBCreateRequisitonFromOrder ()
	{
		super ();
	}	//	MyValidator

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(ModelOFBCreateRequisitonFromOrder.class);
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
		engine.addDocValidate(MOrder.Table_Name, this);
			

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
		if(timing == TIMING_AFTER_COMPLETE && po.get_Table_ID()==MOrder.Table_ID)
		{
			MOrder order = (MOrder) po;
			// validamos si es compra
			if(order.isSOTrx() == false) {
				MRequisition req = new MRequisition(po.getCtx(),0,po.get_TrxName());
				// llenamos la cabecera de la requisicion	
				req.setAD_Org_ID(order.getAD_Org_ID());
				req.setC_DocType_ID(1000418);
				req.setDateRequired(order.getDatePromised());
				req.setAD_User_ID(order.getSalesRep_ID());
				req.setDescription("Generado Desde OC "+order.getDocumentNo()+" /// "+order.getDescription());
				req.setM_Warehouse_ID(order.getM_Warehouse_ID());
				req.setM_PriceList_ID(order.getM_PriceList_ID());
				req.setDateDoc(order.getDateOrdered());
				req.setPriorityRule(order.getPriorityRule());
				req.set_ValueOfColumn("C_Order_ID", order.getC_Order_ID());
				req.save();
				// creamos el arreglo para almacenar las lineas de la OC
				MOrderLine[] lines = order.getLines();
				// recorremos el arreglo para crear las lineas de la requisicion
				for (int i = 0; i < lines.length; i++)
				{
					MOrderLine line = lines[i];
					// Aqui valido que solo las lineas con productos sean creadas
					if (line.getM_Product_ID() >0){
						MRequisitionLine rl = new MRequisitionLine(req);
						rl.setQty(line.getQtyEntered());
						rl.setAD_Org_ID(line.getAD_Org_ID());
						rl.setM_Product_ID(line.getM_Product_ID());
						rl.setPriceActual(line.getPriceEntered());
						rl.setC_UOM_ID(line.getC_UOM_ID());
						rl.setDescription(line.getDescription());
						rl.setC_OrderLine_ID(line.getC_OrderLine_ID());
						rl.save();
					}
						
				}
				
			}
		}
		
		
		return null;
	
	}
	
	
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

	@Override
	public String login(int AD_Org_ID, int AD_Role_ID, int AD_User_ID) {
		// TODO Auto-generated method stub
		return null;
	}

		

}	