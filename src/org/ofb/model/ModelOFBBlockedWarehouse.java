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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
import org.compiere.model.MMovement;
import org.compiere.model.MInOut;
import org.adempiere.exceptions.AdempiereException;
import org.adempiere.exceptions.DBException;



/**
 *	Validator default OFB
 *
 *  @author mfrojas
 */
public class ModelOFBBlockedWarehouse implements ModelValidator
{
	/**
	 *	Constructor.
	 *	The class is instantiated when logging in and client is selected/known
	 */
	public ModelOFBBlockedWarehouse ()
	{
		super ();
	}	//	MyValidator

	/**	Logger			*/
	private static CLogger log = CLogger.getCLogger(ModelOFBBlockedWarehouse.class);
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
	
		engine.addModelChange(MMovement.Table_Name, this);
		engine.addModelChange(MInventory.Table_Name, this);
		engine.addModelChange(MInOut.Table_Name, this);
		
		/*engine.addDocValidate(MInventory.Table_Name, this);
		engine.addDocValidate(MInOut.Table_Name, this);
		engine.addDocValidate(MMovement.Table_Name, this);
*/
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
		
		if(( type == TYPE_BEFORE_CHANGE )&& po.get_Table_ID() == MInventory.Table_ID 
				&& po.is_ValueChanged("DocStatus"))
		{
			MInventory inv = (MInventory) po;
			//Obtener el almacen. 
		    log.config("ENTRE A INVENTARIO");
			MWarehouse wh = new MWarehouse(po.getCtx(), inv.getM_Warehouse_ID(), po.get_TrxName());
			log.config(" LOCK "+wh.get_ValueAsBoolean("IsLocked"));
			if(wh.get_ValueAsBoolean("IsLocked"))
				throw new AdempiereException("El almacen utilizado se encuentra bloqueado. Favor, validar.");

			
		}		
		
		if((type == TYPE_BEFORE_CHANGE )&& po.get_Table_ID() == MInOut.Table_ID 
				&& po.is_ValueChanged("DocStatus"))
		{
			MInOut inv = (MInOut) po;
			//Obtener el almacen. 
		
			MWarehouse wh = new MWarehouse(po.getCtx(), inv.getM_Warehouse_ID(), po.get_TrxName());
			if(wh.get_ValueAsBoolean("IsLocked"))
				throw new AdempiereException("El almacen utilizado se encuentra bloqueado. Favor, validar.");

		}
		
		if(( type == TYPE_BEFORE_CHANGE )&& po.get_Table_ID() == MMovement.Table_ID 
				&& po.is_ValueChanged("DocStatus"))
		{
			MMovement inv = (MMovement) po;
			//Como se trata de movimiento de materiales, el almacen se encuentra en las lineas.
			
			String sqlcountloc = "SELECT count(1) FROM m_warehouse where islocked='Y' and m_warehouse_id in ("
					+ " SELECT m_Warehouse_id from m_locator where m_locator_id in ("
					+ " SELECT m_locator_id from m_movementline where m_movement_id = "+inv.getM_Movement_ID()+" ))";

			int counter = 0;
			counter = DB.getSQLValue(inv.get_TrxName(), sqlcountloc);
			if(counter > 0)
				throw new AdempiereException("Uno de los almacenes de origen se encuentra bloqueado. Favor, validar.");

			sqlcountloc = "SELECT count(1) FROM m_warehouse where islocked='Y' and m_warehouse_id in ("
					+ " SELECT m_Warehouse_id from m_locator where m_locator_id in ("
					+ " SELECT m_locatorto_id from m_movementline where m_movement_id = "+inv.getM_Movement_ID()+" ))";
			
			counter = 0;
			counter = DB.getSQLValue(inv.get_TrxName(), sqlcountloc);
			if(counter > 0)
				throw new AdempiereException("Uno de los almacenes de destino se encuentra bloqueado. Favor, validar.");

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
	

	
	//Se debe validar, antes de completar un documento, que el almacen no este bloqueado.
	public String docValidate (PO po, int timing)
	{
		log.info(po.get_TableName() + " Timing: "+timing);
		if(timing == TIMING_BEFORE_COMPLETE && po.get_Table_ID()==MInventory.Table_ID)
		{
			MInventory inv = (MInventory) po;
			//Obtener el almacen. 
		    log.config("ENTRE A INVENTARIO");
			MWarehouse wh = new MWarehouse(po.getCtx(), inv.getM_Warehouse_ID(), po.get_TrxName());
			log.config(" LOCK "+wh.get_ValueAsBoolean("IsLocked"));
			if(wh.get_ValueAsBoolean("IsLocked"))
				throw new AdempiereException("El almacen utilizado se encuentra bloqueado. Favor, validar.");

		}
		
		log.info(po.get_TableName() + " Timing: "+timing);
		if(timing == TIMING_BEFORE_COMPLETE && po.get_Table_ID()==MInOut.Table_ID)
		{
			MInOut inv = (MInOut) po;
			//Obtener el almacen. 
		
			MWarehouse wh = new MWarehouse(po.getCtx(), inv.getM_Warehouse_ID(), po.get_TrxName());
			if(wh.get_ValueAsBoolean("IsLocked"))
				throw new AdempiereException("El almacen utilizado se encuentra bloqueado. Favor, validar.");

		}
		
		log.info(po.get_TableName() + " Timing: "+timing);
		if(timing == TIMING_BEFORE_COMPLETE && po.get_Table_ID()==MMovement.Table_ID)
		{
			MMovement inv = (MMovement) po;
			//Como se trata de movimiento de materiales, el almacen se encuentra en las lineas.
			
			String sqlcountloc = "SELECT count(1) FROM m_warehouse where islocked='Y' and m_warehouse_id in ("
					+ " SELECT m_Warehouse_id from m_locator where m_locator_id in ("
					+ " SELECT m_locator_id from m_movementline where m_movement_id = "+inv.getM_Movement_ID()+" ))";

			int counter = 0;
			counter = DB.getSQLValue(inv.get_TrxName(), sqlcountloc);
			if(counter > 0)
				throw new AdempiereException("Uno de los almacenes de origen se encuentra bloqueado. Favor, validar.");

			sqlcountloc = "SELECT count(1) FROM m_warehouse where islocked='Y' and m_warehouse_id in ("
					+ " SELECT m_Warehouse_id from m_locator where m_locator_id in ("
					+ " SELECT m_locatorto_id from m_movementline where m_movement_id = "+inv.getM_Movement_ID()+" ))";
			
			counter = 0;
			counter = DB.getSQLValue(inv.get_TrxName(), sqlcountloc);
			if(counter > 0)
				throw new AdempiereException("Uno de los almacenes de destino se encuentra bloqueado. Favor, validar.");

			



		}
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