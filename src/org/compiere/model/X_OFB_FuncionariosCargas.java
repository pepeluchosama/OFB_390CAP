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
import java.sql.Timestamp;
import java.util.Properties;

/** Generated Model for OFB_FuncionariosCargas
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_OFB_FuncionariosCargas extends PO implements I_OFB_FuncionariosCargas, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20220824L;

    /** Standard Constructor */
    public X_OFB_FuncionariosCargas (Properties ctx, int OFB_FuncionariosCargas_ID, String trxName)
    {
      super (ctx, OFB_FuncionariosCargas_ID, trxName);
      /** if (OFB_FuncionariosCargas_ID == 0)
        {
			setOFB_FuncionariosCargas_ID (0);
        } */
    }

    /** Load Constructor */
    public X_OFB_FuncionariosCargas (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_OFB_FuncionariosCargas[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Birthday.
		@param Birthday 
		Birthday or Anniversary day
	  */
	public void setBirthday (Timestamp Birthday)
	{
		set_Value (COLUMNNAME_Birthday, Birthday);
	}

	/** Get Birthday.
		@return Birthday or Anniversary day
	  */
	public Timestamp getBirthday () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Birthday);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	public I_OFB_Funcionario getOFB_Funcionario() throws RuntimeException
    {
		return (I_OFB_Funcionario)MTable.get(getCtx(), I_OFB_Funcionario.Table_Name)
			.getPO(getOFB_Funcionario_ID(), get_TrxName());	}

	/** Set OFB_Funcionario ID.
		@param OFB_Funcionario_ID OFB_Funcionario ID	  */
	public void setOFB_Funcionario_ID (int OFB_Funcionario_ID)
	{
		if (OFB_Funcionario_ID < 1) 
			set_Value (COLUMNNAME_OFB_Funcionario_ID, null);
		else 
			set_Value (COLUMNNAME_OFB_Funcionario_ID, Integer.valueOf(OFB_Funcionario_ID));
	}

	/** Get OFB_Funcionario ID.
		@return OFB_Funcionario ID	  */
	public int getOFB_Funcionario_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_OFB_Funcionario_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set OFB_FuncionariosCargas ID.
		@param OFB_FuncionariosCargas_ID OFB_FuncionariosCargas ID	  */
	public void setOFB_FuncionariosCargas_ID (int OFB_FuncionariosCargas_ID)
	{
		if (OFB_FuncionariosCargas_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_OFB_FuncionariosCargas_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_OFB_FuncionariosCargas_ID, Integer.valueOf(OFB_FuncionariosCargas_ID));
	}

	/** Get OFB_FuncionariosCargas ID.
		@return OFB_FuncionariosCargas ID	  */
	public int getOFB_FuncionariosCargas_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_OFB_FuncionariosCargas_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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