/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for C_DocType_Workflow
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_C_DocType_Workflow extends PO implements I_C_DocType_Workflow, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191107L;

    /** Standard Constructor */
    public X_C_DocType_Workflow (Properties ctx, int C_DocType_Workflow_ID, String trxName)
    {
      super (ctx, C_DocType_Workflow_ID, trxName);
      /** if (C_DocType_Workflow_ID == 0)
        {
			setC_DocType_Workflow_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_DocType_Workflow (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_C_DocType_Workflow[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** ActualState AD_Reference_ID=131 */
	public static final int ACTUALSTATE_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String ACTUALSTATE_Drafted = "DR";
	/** Completed = CO */
	public static final String ACTUALSTATE_Completed = "CO";
	/** Approved = AP */
	public static final String ACTUALSTATE_Approved = "AP";
	/** Not Approved = NA */
	public static final String ACTUALSTATE_NotApproved = "NA";
	/** Voided = VO */
	public static final String ACTUALSTATE_Voided = "VO";
	/** Invalid = IN */
	public static final String ACTUALSTATE_Invalid = "IN";
	/** Reversed = RE */
	public static final String ACTUALSTATE_Reversed = "RE";
	/** Closed = CL */
	public static final String ACTUALSTATE_Closed = "CL";
	/** Unknown = ?? */
	public static final String ACTUALSTATE_Unknown = "??";
	/** In Progress = IP */
	public static final String ACTUALSTATE_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String ACTUALSTATE_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String ACTUALSTATE_WaitingConfirmation = "WC";
	/** Set ActualState.
		@param ActualState ActualState	  */
	public void setActualState (String ActualState)
	{

		set_Value (COLUMNNAME_ActualState, ActualState);
	}

	/** Get ActualState.
		@return ActualState	  */
	public String getActualState () 
	{
		return (String)get_Value(COLUMNNAME_ActualState);
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
    {
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_Name)
			.getPO(getC_DocType_ID(), get_TrxName());	}

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0) 
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else 
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_DocType_Workflow ID.
		@param C_DocType_Workflow_ID C_DocType_Workflow ID	  */
	public void setC_DocType_Workflow_ID (int C_DocType_Workflow_ID)
	{
		if (C_DocType_Workflow_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_DocType_Workflow_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_DocType_Workflow_ID, Integer.valueOf(C_DocType_Workflow_ID));
	}

	/** Get C_DocType_Workflow ID.
		@return C_DocType_Workflow ID	  */
	public int getC_DocType_Workflow_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_Workflow_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** NextState AD_Reference_ID=131 */
	public static final int NEXTSTATE_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String NEXTSTATE_Drafted = "DR";
	/** Completed = CO */
	public static final String NEXTSTATE_Completed = "CO";
	/** Approved = AP */
	public static final String NEXTSTATE_Approved = "AP";
	/** Not Approved = NA */
	public static final String NEXTSTATE_NotApproved = "NA";
	/** Voided = VO */
	public static final String NEXTSTATE_Voided = "VO";
	/** Invalid = IN */
	public static final String NEXTSTATE_Invalid = "IN";
	/** Reversed = RE */
	public static final String NEXTSTATE_Reversed = "RE";
	/** Closed = CL */
	public static final String NEXTSTATE_Closed = "CL";
	/** Unknown = ?? */
	public static final String NEXTSTATE_Unknown = "??";
	/** In Progress = IP */
	public static final String NEXTSTATE_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String NEXTSTATE_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String NEXTSTATE_WaitingConfirmation = "WC";
	/** Set NextState.
		@param NextState NextState	  */
	public void setNextState (String NextState)
	{

		set_Value (COLUMNNAME_NextState, NextState);
	}

	/** Get NextState.
		@return NextState	  */
	public String getNextState () 
	{
		return (String)get_Value(COLUMNNAME_NextState);
	}

	/** PrevState AD_Reference_ID=131 */
	public static final int PREVSTATE_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String PREVSTATE_Drafted = "DR";
	/** Completed = CO */
	public static final String PREVSTATE_Completed = "CO";
	/** Approved = AP */
	public static final String PREVSTATE_Approved = "AP";
	/** Not Approved = NA */
	public static final String PREVSTATE_NotApproved = "NA";
	/** Voided = VO */
	public static final String PREVSTATE_Voided = "VO";
	/** Invalid = IN */
	public static final String PREVSTATE_Invalid = "IN";
	/** Reversed = RE */
	public static final String PREVSTATE_Reversed = "RE";
	/** Closed = CL */
	public static final String PREVSTATE_Closed = "CL";
	/** Unknown = ?? */
	public static final String PREVSTATE_Unknown = "??";
	/** In Progress = IP */
	public static final String PREVSTATE_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String PREVSTATE_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String PREVSTATE_WaitingConfirmation = "WC";
	/** Set PrevState.
		@param PrevState PrevState	  */
	public void setPrevState (String PrevState)
	{

		set_Value (COLUMNNAME_PrevState, PrevState);
	}

	/** Get PrevState.
		@return PrevState	  */
	public String getPrevState () 
	{
		return (String)get_Value(COLUMNNAME_PrevState);
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}