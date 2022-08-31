/******************************************************************************
 * The contents of this file are subject to the   Compiere License  Version 1.1
 * ("License"); You may not use this file except in compliance with the License
 * You may obtain a copy of the License at http://www.compiere.org/license.html
 * Software distributed under the License is distributed on an  "AS IS"  basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 * The Original Code is Compiere ERP & CRM Smart Business Solution. The Initial
 * Developer of the Original Code is Jorg Janke. Portions created by Jorg Janke
 * are Copyright (C) 1999-2005 Jorg Janke.
 * All parts are Copyright (C) 1999-2005 ComPiere, Inc.  All Rights Reserved.
 * Contributor(s): ______________________________________.
 *****************************************************************************/
package org.ofb.model;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.*;
import java.util.logging.Level;

import org.compiere.model.CalloutEngine;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInvoice;
import org.compiere.model.MProject;
import org.compiere.model.X_DM_Document;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.TimeUtil;

import test.functional.DBTest;

/**
 *	DM Document Callouts.
 *	
 *  @author mfrojas
 *  @version $Id: CalloutGLReassignment.java,v 1.34 2006/11/25 21:57:24  Exp $
 */
public class CalloutGLReassignment extends CalloutEngine
{

	 
	public String Subt (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		if(value==null)
			return "";
		
		int Reassignment = (Integer)mTab.getValue("GL_ReassignmentRef_ID");
		String type = (String)mTab.getValue("DM_DocumentType");
		
		if(Reassignment > 0)
		{
			String sql = "SELECT coalesce(max(c_elementvalue_id),0) from gl_reassignment WHERE "
					+ " gl_Reassignment_id = "+Reassignment;
			int elem = DB.getSQLValue(null, sql);
			if(elem > 0)
			{
				mTab.setValue("C_ElementValue_ID", elem);
				mTab.setValue("GL_BudgetDetail_ID", null);
			}
			
		}
		
		return "";
	}	//	charge

		
}	//

