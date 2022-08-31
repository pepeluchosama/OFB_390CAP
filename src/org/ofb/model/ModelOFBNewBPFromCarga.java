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

import org.compiere.model.MBPartner;
import org.compiere.model.MClient;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.model.X_OFB_Funcionario;
import org.compiere.model.X_OFB_FuncionariosCargas;
import org.compiere.util.CLogger;
import org.compiere.util.DB;

/**
 *	Validator default OFB
 *
 *  @author Italo Ni�oles
 */
public class ModelOFBNewBPFromCarga implements ModelValidator
{
	/**
	 *	Constructor.
	 *	The class is instantiated when logging in and client is selected/known
	 */
	public ModelOFBNewBPFromCarga ()
	{
		super ();
	}	//	MyValidator

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(ModelOFBNewBPFromCarga.class);
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
		engine.addModelChange(X_OFB_FuncionariosCargas.Table_Name, this);
	
		
		//	Documents to be monitored
			

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

		if ((type == TYPE_AFTER_NEW ||  type == TYPE_AFTER_CHANGE) && po.get_Table_ID()==X_OFB_FuncionariosCargas.Table_ID)
		{
			X_OFB_FuncionariosCargas carg = (X_OFB_FuncionariosCargas) po;
			X_OFB_Funcionario func = new X_OFB_Funcionario(po.getCtx(), carg.getOFB_Funcionario_ID(), po.get_TrxName());
			if(carg.get_Value("IsSelected")==null)
				return null;
			
			if(carg.get_Value("IsSelected").equals("Y")) {
				String sql = "select coalesce(max(c_bpartner_id),0) from "
						+ "c_bpartner where value like '"+carg.get_Value("Rut")+"'";
	
				int bp_id = DB.getSQLValue(null, sql);
				MBPartner bp = new MBPartner(po.getCtx(), bp_id, po.get_TrxName());
				if(bp_id == 0) {
					bp.set_ValueOfColumn("Value", carg.get_Value("Rut"));
					//bp.set_ValueOfColumn("OFB_Funcionario_ID", func.getOFB_Funcionario_ID());
					log.info("Se crea nuevo socio");
				}
				bp.set_ValueOfColumn("Name", carg.getName());
				bp.set_ValueOfColumn("FuncionarioPosition", func.getPosition());
				bp.setBirthday(carg.getBirthday());
				bp.set_ValueOfColumn("Type", func.getType());
				bp.save();
				bp_id = bp.get_ID();
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