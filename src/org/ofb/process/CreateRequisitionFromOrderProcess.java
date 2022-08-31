package org.ofb.process;

import java.sql.Timestamp;
import java.util.logging.Level;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MRequisition;
import org.compiere.model.MRequisitionLine;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.AdempiereSystemError;
import org.compiere.util.DB;

/**
 *	author: jleyton
 *	
 */
public class CreateRequisitionFromOrderProcess extends SvrProcess
{	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	private int p_C_Order_ID = 0;
	private Timestamp p_Date = null;
	private String req_Doc_No = null;
	
	protected void prepare()
	{	
		p_C_Order_ID = getRecord_ID();
		
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("DocumentNo"))
				req_Doc_No = para[i].getParameterAsString();
			
			else if (name.equals("Date"))
				p_Date = para[i].getParameterAsTimestamp();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
		
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{	MOrder order = new MOrder(getCtx(), p_C_Order_ID, get_TrxName());
			// obtenemos el order_id desde una req si existiera alguna
		if(order.getDocStatus().equals("CO")) {
			String sql = "select max(documentno) from m_requisition where c_order_id="+p_C_Order_ID;
			String result = DB.getSQLValueString(null,sql);
			if(result==null) {
			// validamos si es compra
				if(order.isSOTrx() == false) {
					MRequisition req = new MRequisition(order.getCtx(),0,order.get_TrxName());
					// llenamos la cabecera de la requisicion	
					req.setAD_Org_ID(order.getAD_Org_ID());
					req.setC_DocType_ID(1000418);
					req.setDateRequired(p_Date);
					req.setAD_User_ID(order.getSalesRep_ID());
					req.setDescription("Generado Desde OC "+order.getDocumentNo()+" /// "+order.getDescription());
					req.setM_Warehouse_ID(order.getM_Warehouse_ID());
					req.setM_PriceList_ID(order.getM_PriceList_ID());
					req.setDateDoc(p_Date);
					req.setPriorityRule(order.getPriorityRule());
					req.set_ValueOfColumn("C_Order_ID", order.getC_Order_ID());
					req.setDocumentNo(req_Doc_No);
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
				return "Se crea Requisición N°"+req_Doc_No;
			}
			else
			{
				throw new AdempiereSystemError("ERROR: OC N°"+order.getDocumentNo()+" ya generó la Requisicion N°"+result);
				//return "ERROR: OC N°"+order.getDocumentNo()+" ya generó la Requisicion N°"+result;
			}
			
		}
		else
			throw new AdempiereSystemError("La OC no está completa");
			//return "ERROR: La OC no está completa.";
				
			
		
	}
	
	
}	

