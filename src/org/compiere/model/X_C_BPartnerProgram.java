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

/** Generated Model for C_BPartnerProgram
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_C_BPartnerProgram extends PO implements I_C_BPartnerProgram, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220113L;

    /** Standard Constructor */
    public X_C_BPartnerProgram (Properties ctx, int C_BPartnerProgram_ID, String trxName)
    {
      super (ctx, C_BPartnerProgram_ID, trxName);
      /** if (C_BPartnerProgram_ID == 0)
        {
			setC_BPartnerProgram_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_BPartnerProgram (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_BPartnerProgram[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Business Partner .
		@param C_BPartner_ID 
		Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner .
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_BPartnerProgram ID.
		@param C_BPartnerProgram_ID C_BPartnerProgram ID	  */
	public void setC_BPartnerProgram_ID (int C_BPartnerProgram_ID)
	{
		if (C_BPartnerProgram_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_BPartnerProgram_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_BPartnerProgram_ID, Integer.valueOf(C_BPartnerProgram_ID));
	}

	/** Get C_BPartnerProgram ID.
		@return C_BPartnerProgram ID	  */
	public int getC_BPartnerProgram_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerProgram_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set EpisodeNo.
		@param EpisodeNo EpisodeNo	  */
	public void setEpisodeNo (String EpisodeNo)
	{
		set_Value (COLUMNNAME_EpisodeNo, EpisodeNo);
	}

	/** Get EpisodeNo.
		@return EpisodeNo	  */
	public String getEpisodeNo () 
	{
		return (String)get_Value(COLUMNNAME_EpisodeNo);
	}

	/** Set ProgramCode.
		@param ProgramCode ProgramCode	  */
	public void setProgramCode (String ProgramCode)
	{
		set_Value (COLUMNNAME_ProgramCode, ProgramCode);
	}

	/** Get ProgramCode.
		@return ProgramCode	  */
	public String getProgramCode () 
	{
		return (String)get_Value(COLUMNNAME_ProgramCode);
	}

	/** Set ProgramDesc.
		@param ProgramDesc ProgramDesc	  */
	public void setProgramDesc (String ProgramDesc)
	{
		set_Value (COLUMNNAME_ProgramDesc, ProgramDesc);
	}

	/** Get ProgramDesc.
		@return ProgramDesc	  */
	public String getProgramDesc () 
	{
		return (String)get_Value(COLUMNNAME_ProgramDesc);
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