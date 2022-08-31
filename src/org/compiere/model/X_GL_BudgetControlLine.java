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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for GL_BudgetControlLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_GL_BudgetControlLine extends PO implements I_GL_BudgetControlLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200323L;

    /** Standard Constructor */
    public X_GL_BudgetControlLine (Properties ctx, int GL_BudgetControlLine_ID, String trxName)
    {
      super (ctx, GL_BudgetControlLine_ID, trxName);
      /** if (GL_BudgetControlLine_ID == 0)
        {
			setGL_BudgetControl_ID (0);
			setGL_BudgetControlLine_ID (0);
        } */
    }

    /** Load Constructor */
    public X_GL_BudgetControlLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_GL_BudgetControlLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Allocated Amountt.
		@param AllocatedAmt 
		Amount allocated to this document
	  */
	public void setAllocatedAmt (BigDecimal AllocatedAmt)
	{
		set_Value (COLUMNNAME_AllocatedAmt, AllocatedAmt);
	}

	/** Get Allocated Amountt.
		@return Amount allocated to this document
	  */
	public BigDecimal getAllocatedAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AllocatedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount2.
		@param amount2 amount2	  */
	public void setamount2 (BigDecimal amount2)
	{
		set_Value (COLUMNNAME_amount2, amount2);
	}

	/** Get amount2.
		@return amount2	  */
	public BigDecimal getamount2 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount2);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount3.
		@param amount3 amount3	  */
	public void setamount3 (BigDecimal amount3)
	{
		set_Value (COLUMNNAME_amount3, amount3);
	}

	/** Get amount3.
		@return amount3	  */
	public BigDecimal getamount3 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount3);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount4.
		@param amount4 amount4	  */
	public void setamount4 (BigDecimal amount4)
	{
		set_Value (COLUMNNAME_amount4, amount4);
	}

	/** Get amount4.
		@return amount4	  */
	public BigDecimal getamount4 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount4);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount5.
		@param amount5 amount5	  */
	public void setamount5 (BigDecimal amount5)
	{
		set_Value (COLUMNNAME_amount5, amount5);
	}

	/** Get amount5.
		@return amount5	  */
	public BigDecimal getamount5 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount5);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount6.
		@param amount6 amount6	  */
	public void setamount6 (BigDecimal amount6)
	{
		set_Value (COLUMNNAME_amount6, amount6);
	}

	/** Get amount6.
		@return amount6	  */
	public BigDecimal getamount6 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount6);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amount8.
		@param amount8 amount8	  */
	public void setamount8 (BigDecimal amount8)
	{
		set_Value (COLUMNNAME_amount8, amount8);
	}

	/** Get amount8.
		@return amount8	  */
	public BigDecimal getamount8 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amount8);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amountnew.
		@param amountnew amountnew	  */
	public void setamountnew (BigDecimal amountnew)
	{
		set_Value (COLUMNNAME_amountnew, amountnew);
	}

	/** Get amountnew.
		@return amountnew	  */
	public BigDecimal getamountnew () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountnew);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set amountref.
		@param amountref amountref	  */
	public void setamountref (BigDecimal amountref)
	{
		set_Value (COLUMNNAME_amountref, amountref);
	}

	/** Get amountref.
		@return amountref	  */
	public BigDecimal getamountref () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_amountref);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException
    {
		return (org.compiere.model.I_C_Period)MTable.get(getCtx(), org.compiere.model.I_C_Period.Table_Name)
			.getPO(getC_Period_ID(), get_TrxName());	}

	/** Set Period.
		@param C_Period_ID 
		Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID)
	{
		if (C_Period_ID < 1) 
			set_Value (COLUMNNAME_C_Period_ID, null);
		else 
			set_Value (COLUMNNAME_C_Period_ID, Integer.valueOf(C_Period_ID));
	}

	/** Get Period.
		@return Period of the Calendar
	  */
	public int getC_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_ValidCombination getC_ValidCombination() throws RuntimeException
    {
		return (org.compiere.model.I_C_ValidCombination)MTable.get(getCtx(), org.compiere.model.I_C_ValidCombination.Table_Name)
			.getPO(getC_ValidCombination_ID(), get_TrxName());	}

	/** Set Combination.
		@param C_ValidCombination_ID 
		Valid Account Combination
	  */
	public void setC_ValidCombination_ID (int C_ValidCombination_ID)
	{
		if (C_ValidCombination_ID < 1) 
			set_Value (COLUMNNAME_C_ValidCombination_ID, null);
		else 
			set_Value (COLUMNNAME_C_ValidCombination_ID, Integer.valueOf(C_ValidCombination_ID));
	}

	/** Get Combination.
		@return Valid Account Combination
	  */
	public int getC_ValidCombination_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_ValidCombination_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set docstatus2.
		@param docstatus2 docstatus2	  */
	public void setdocstatus2 (String docstatus2)
	{
		set_Value (COLUMNNAME_docstatus2, docstatus2);
	}

	/** Get docstatus2.
		@return docstatus2	  */
	public String getdocstatus2 () 
	{
		return (String)get_Value(COLUMNNAME_docstatus2);
	}

	public org.compiere.model.I_GL_BudgetControl getGL_BudgetControl() throws RuntimeException
    {
		return (org.compiere.model.I_GL_BudgetControl)MTable.get(getCtx(), org.compiere.model.I_GL_BudgetControl.Table_Name)
			.getPO(getGL_BudgetControl_ID(), get_TrxName());	}

	/** Set Budget Control.
		@param GL_BudgetControl_ID 
		Budget Control
	  */
	public void setGL_BudgetControl_ID (int GL_BudgetControl_ID)
	{
		if (GL_BudgetControl_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetControl_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetControl_ID, Integer.valueOf(GL_BudgetControl_ID));
	}

	/** Get Budget Control.
		@return Budget Control
	  */
	public int getGL_BudgetControl_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControl_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_BudgetControlHeader getGL_BudgetControlHeaderRef() throws RuntimeException
    {
		return (I_GL_BudgetControlHeader)MTable.get(getCtx(), I_GL_BudgetControlHeader.Table_Name)
			.getPO(getGL_BudgetControlHeaderRef_ID(), get_TrxName());	}

	/** Set GL_BudgetControlHeaderRef_ID.
		@param GL_BudgetControlHeaderRef_ID GL_BudgetControlHeaderRef_ID	  */
	public void setGL_BudgetControlHeaderRef_ID (int GL_BudgetControlHeaderRef_ID)
	{
		if (GL_BudgetControlHeaderRef_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetControlHeaderRef_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetControlHeaderRef_ID, Integer.valueOf(GL_BudgetControlHeaderRef_ID));
	}

	/** Get GL_BudgetControlHeaderRef_ID.
		@return GL_BudgetControlHeaderRef_ID	  */
	public int getGL_BudgetControlHeaderRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlHeaderRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Budget Control Line ID.
		@param GL_BudgetControlLine_ID Budget Control Line ID	  */
	public void setGL_BudgetControlLine_ID (int GL_BudgetControlLine_ID)
	{
		if (GL_BudgetControlLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GL_BudgetControlLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GL_BudgetControlLine_ID, Integer.valueOf(GL_BudgetControlLine_ID));
	}

	/** Get Budget Control Line ID.
		@return Budget Control Line ID	  */
	public int getGL_BudgetControlLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_BudgetControlLine getGL_BudgetControlLineRef() throws RuntimeException
    {
		return (I_GL_BudgetControlLine)MTable.get(getCtx(), I_GL_BudgetControlLine.Table_Name)
			.getPO(getGL_BudgetControlLineRef_ID(), get_TrxName());	}

	/** Set GL_BudgetControlLineRef_ID.
		@param GL_BudgetControlLineRef_ID GL_BudgetControlLineRef_ID	  */
	public void setGL_BudgetControlLineRef_ID (int GL_BudgetControlLineRef_ID)
	{
		if (GL_BudgetControlLineRef_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetControlLineRef_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetControlLineRef_ID, Integer.valueOf(GL_BudgetControlLineRef_ID));
	}

	/** Get GL_BudgetControlLineRef_ID.
		@return GL_BudgetControlLineRef_ID	  */
	public int getGL_BudgetControlLineRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlLineRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_BudgetControlLine getGL_BudgetControlLineRef2() throws RuntimeException
    {
		return (I_GL_BudgetControlLine)MTable.get(getCtx(), I_GL_BudgetControlLine.Table_Name)
			.getPO(getGL_BudgetControlLineRef2_ID(), get_TrxName());	}

	/** Set GL_BudgetControlLineRef2_ID.
		@param GL_BudgetControlLineRef2_ID GL_BudgetControlLineRef2_ID	  */
	public void setGL_BudgetControlLineRef2_ID (int GL_BudgetControlLineRef2_ID)
	{
		if (GL_BudgetControlLineRef2_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetControlLineRef2_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetControlLineRef2_ID, Integer.valueOf(GL_BudgetControlLineRef2_ID));
	}

	/** Get GL_BudgetControlLineRef2_ID.
		@return GL_BudgetControlLineRef2_ID	  */
	public int getGL_BudgetControlLineRef2_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlLineRef2_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_GL_BudgetControl getGL_BudgetControlRef() throws RuntimeException
    {
		return (org.compiere.model.I_GL_BudgetControl)MTable.get(getCtx(), org.compiere.model.I_GL_BudgetControl.Table_Name)
			.getPO(getGL_BudgetControlRef_ID(), get_TrxName());	}

	/** Set GL_BudgetControlRef_ID.
		@param GL_BudgetControlRef_ID GL_BudgetControlRef_ID	  */
	public void setGL_BudgetControlRef_ID (int GL_BudgetControlRef_ID)
	{
		if (GL_BudgetControlRef_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetControlRef_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetControlRef_ID, Integer.valueOf(GL_BudgetControlRef_ID));
	}

	/** Get GL_BudgetControlRef_ID.
		@return GL_BudgetControlRef_ID	  */
	public int getGL_BudgetControlRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_BudgetDetail getGL_BudgetDetail() throws RuntimeException
    {
		return (I_GL_BudgetDetail)MTable.get(getCtx(), I_GL_BudgetDetail.Table_Name)
			.getPO(getGL_BudgetDetail_ID(), get_TrxName());	}

	/** Set GL_BudgetDetail_ID.
		@param GL_BudgetDetail_ID GL_BudgetDetail_ID	  */
	public void setGL_BudgetDetail_ID (int GL_BudgetDetail_ID)
	{
		if (GL_BudgetDetail_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetDetail_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetDetail_ID, Integer.valueOf(GL_BudgetDetail_ID));
	}

	/** Get GL_BudgetDetail_ID.
		@return GL_BudgetDetail_ID	  */
	public int getGL_BudgetDetail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetDetail_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_BudgetDetail getGL_BudgetDetailRef() throws RuntimeException
    {
		return (I_GL_BudgetDetail)MTable.get(getCtx(), I_GL_BudgetDetail.Table_Name)
			.getPO(getGL_BudgetDetailRef_ID(), get_TrxName());	}

	/** Set GL_BudgetDetailRef_ID.
		@param GL_BudgetDetailRef_ID GL_BudgetDetailRef_ID	  */
	public void setGL_BudgetDetailRef_ID (int GL_BudgetDetailRef_ID)
	{
		if (GL_BudgetDetailRef_ID < 1) 
			set_Value (COLUMNNAME_GL_BudgetDetailRef_ID, null);
		else 
			set_Value (COLUMNNAME_GL_BudgetDetailRef_ID, Integer.valueOf(GL_BudgetDetailRef_ID));
	}

	/** Get GL_BudgetDetailRef_ID.
		@return GL_BudgetDetailRef_ID	  */
	public int getGL_BudgetDetailRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetDetailRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Special AD Flag.
		@param IsAdFlag 
		Do we need to specially mention this ad?
	  */
	public void setIsAdFlag (boolean IsAdFlag)
	{
		set_Value (COLUMNNAME_IsAdFlag, Boolean.valueOf(IsAdFlag));
	}

	/** Get Special AD Flag.
		@return Do we need to specially mention this ad?
	  */
	public boolean isAdFlag () 
	{
		Object oo = get_Value(COLUMNNAME_IsAdFlag);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Heading only.
		@param IsHeading 
		Field without Column - Only label is displayed
	  */
	public void setIsHeading (boolean IsHeading)
	{
		set_Value (COLUMNNAME_IsHeading, Boolean.valueOf(IsHeading));
	}

	/** Get Heading only.
		@return Field without Column - Only label is displayed
	  */
	public boolean isHeading () 
	{
		Object oo = get_Value(COLUMNNAME_IsHeading);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set isrequired.
		@param isrequired isrequired	  */
	public void setisrequired (boolean isrequired)
	{
		set_Value (COLUMNNAME_isrequired, Boolean.valueOf(isrequired));
	}

	/** Get isrequired.
		@return isrequired	  */
	public boolean isrequired () 
	{
		Object oo = get_Value(COLUMNNAME_isrequired);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product_Category)MTable.get(getCtx(), org.compiere.model.I_M_Product_Category.Table_Name)
			.getPO(getM_Product_Category_ID(), get_TrxName());	}

	/** Set Product Category.
		@param M_Product_Category_ID 
		Category of a Product
	  */
	public void setM_Product_Category_ID (int M_Product_Category_ID)
	{
		if (M_Product_Category_ID < 1) 
			set_Value (COLUMNNAME_M_Product_Category_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
	}

	/** Get Product Category.
		@return Category of a Product
	  */
	public int getM_Product_Category_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
    {
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_Name)
			.getPO(getM_Product_ID(), get_TrxName());	}

	/** Set Product.
		@param M_Product_ID 
		Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1) 
			set_Value (COLUMNNAME_M_Product_ID, null);
		else 
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** mode AD_Reference_ID=1000007 */
	public static final int MODE_AD_Reference_ID=1000007;
	/** Compra menor a 3 UTM = 3ME */
	public static final String MODE_CompraMenorA3UTM = "3ME";
	/** Contrato Arrastre = CAR */
	public static final String MODE_ContratoArrastre = "CAR";
	/** Trato Directo = DIR */
	public static final String MODE_TratoDirecto = "DIR";
	/** Licitaciones Publicas = LIB */
	public static final String MODE_LicitacionesPublicas = "LIB";
	/** Licitaciones Privadas = LIC */
	public static final String MODE_LicitacionesPrivadas = "LIC";
	/** Convenio Marco = MAR */
	public static final String MODE_ConvenioMarco = "MAR";
	/** Set mode.
		@param mode mode	  */
	public void setmode (String mode)
	{

		set_Value (COLUMNNAME_mode, mode);
	}

	/** Get mode.
		@return mode	  */
	public String getmode () 
	{
		return (String)get_Value(COLUMNNAME_mode);
	}

	/** Set ofbbutton.
		@param ofbbutton ofbbutton	  */
	public void setofbbutton (boolean ofbbutton)
	{
		set_Value (COLUMNNAME_ofbbutton, Boolean.valueOf(ofbbutton));
	}

	/** Get ofbbutton.
		@return ofbbutton	  */
	public boolean isofbbutton () 
	{
		Object oo = get_Value(COLUMNNAME_ofbbutton);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set pagodirecto.
		@param pagodirecto pagodirecto	  */
	public void setpagodirecto (boolean pagodirecto)
	{
		set_Value (COLUMNNAME_pagodirecto, Boolean.valueOf(pagodirecto));
	}

	/** Get pagodirecto.
		@return pagodirecto	  */
	public boolean ispagodirecto () 
	{
		Object oo = get_Value(COLUMNNAME_pagodirecto);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set program.
		@param program program	  */
	public void setprogram (String program)
	{
		set_Value (COLUMNNAME_program, program);
	}

	/** Get program.
		@return program	  */
	public String getprogram () 
	{
		return (String)get_Value(COLUMNNAME_program);
	}

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SQLAmountDiff.
		@param SQLAmountDiff SQLAmountDiff	  */
	public void setSQLAmountDiff (BigDecimal SQLAmountDiff)
	{
		throw new IllegalArgumentException ("SQLAmountDiff is virtual column");	}

	/** Get SQLAmountDiff.
		@return SQLAmountDiff	  */
	public BigDecimal getSQLAmountDiff () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SQLAmountDiff);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SQLAmountDiff2.
		@param SQLAmountDiff2 SQLAmountDiff2	  */
	public void setSQLAmountDiff2 (BigDecimal SQLAmountDiff2)
	{
		throw new IllegalArgumentException ("SQLAmountDiff2 is virtual column");	}

	/** Get SQLAmountDiff2.
		@return SQLAmountDiff2	  */
	public BigDecimal getSQLAmountDiff2 () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_SQLAmountDiff2);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set SQLProductNameOrg.
		@param SQLProductNameOrg SQLProductNameOrg	  */
	public void setSQLProductNameOrg (String SQLProductNameOrg)
	{
		throw new IllegalArgumentException ("SQLProductNameOrg is virtual column");	}

	/** Get SQLProductNameOrg.
		@return SQLProductNameOrg	  */
	public String getSQLProductNameOrg () 
	{
		return (String)get_Value(COLUMNNAME_SQLProductNameOrg);
	}

	/** Set usedescription.
		@param usedescription usedescription	  */
	public void setusedescription (boolean usedescription)
	{
		set_Value (COLUMNNAME_usedescription, Boolean.valueOf(usedescription));
	}

	/** Get usedescription.
		@return usedescription	  */
	public boolean isusedescription () 
	{
		Object oo = get_Value(COLUMNNAME_usedescription);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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