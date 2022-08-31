package org.ofb.process;

import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;

/**
 *	author: jleyton
 *	
 */
public class ChangeReviewedBP extends SvrProcess
{	
	/**
	 *  Prepare - e.g., get Parameters.
	 */	
	protected void prepare()
	{	
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message 
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{	
		int bp_qty = DB.executeUpdate("update c_bpartner set IsReValidate='Y' where IsReValidate='N'"+" and ad_client_id="+Env.getAD_Client_ID(getCtx()),get_TrxName());		
		return "Se actualizaron "+bp_qty+" Socios.";	
	}
	
	
}	

