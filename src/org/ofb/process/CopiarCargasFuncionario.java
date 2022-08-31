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
 * Contributor(s): Chris Farley - northernbrewer                              *
 *****************************************************************************/
package org.ofb.process;

import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MInvoice;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MRequisition;
import org.compiere.model.MRequisitionLine;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
/**
 *	author: ininoles
 *	
 */
public class CopiarCargasFuncionario extends SvrProcess
{	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	private int p_C_Order_ID = 0;
	
	protected void prepare()
	{	
		p_C_Order_ID = getRecord_ID();
		
		/*ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_Order_ID"))
				p_C_Order_ID = para[i].getParameterAsInt();
			
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}*/
		
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{	
		MOrder order = new MOrder(null, p_C_Order_ID, null);
			// validamos si es compra
		if(order.isSOTrx() == false) {
			MRequisition req = new MRequisition(order.getCtx(),0,order.get_TrxName());
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
				
		return null;	
		
	}
	
	
}	

