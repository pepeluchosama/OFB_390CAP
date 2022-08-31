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
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for GL_BudgetControlLine
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2
 */
public interface I_GL_BudgetControlLine 
{

    /** TableName=GL_BudgetControlLine */
    public static final String Table_Name = "GL_BudgetControlLine";

    /** AD_Table_ID=1000001 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AllocatedAmt */
    public static final String COLUMNNAME_AllocatedAmt = "AllocatedAmt";

	/** Set Allocated Amountt.
	  * Amount allocated to this document
	  */
	public void setAllocatedAmt (BigDecimal AllocatedAmt);

	/** Get Allocated Amountt.
	  * Amount allocated to this document
	  */
	public BigDecimal getAllocatedAmt();

    /** Column name Amount */
    public static final String COLUMNNAME_Amount = "Amount";

	/** Set Amount.
	  * Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount);

	/** Get Amount.
	  * Amount in a defined currency
	  */
	public BigDecimal getAmount();

    /** Column name amount2 */
    public static final String COLUMNNAME_amount2 = "amount2";

	/** Set amount2	  */
	public void setamount2 (BigDecimal amount2);

	/** Get amount2	  */
	public BigDecimal getamount2();

    /** Column name amount3 */
    public static final String COLUMNNAME_amount3 = "amount3";

	/** Set amount3	  */
	public void setamount3 (BigDecimal amount3);

	/** Get amount3	  */
	public BigDecimal getamount3();

    /** Column name amount4 */
    public static final String COLUMNNAME_amount4 = "amount4";

	/** Set amount4	  */
	public void setamount4 (BigDecimal amount4);

	/** Get amount4	  */
	public BigDecimal getamount4();

    /** Column name amount5 */
    public static final String COLUMNNAME_amount5 = "amount5";

	/** Set amount5	  */
	public void setamount5 (BigDecimal amount5);

	/** Get amount5	  */
	public BigDecimal getamount5();

    /** Column name amount6 */
    public static final String COLUMNNAME_amount6 = "amount6";

	/** Set amount6	  */
	public void setamount6 (BigDecimal amount6);

	/** Get amount6	  */
	public BigDecimal getamount6();

    /** Column name amount8 */
    public static final String COLUMNNAME_amount8 = "amount8";

	/** Set amount8	  */
	public void setamount8 (BigDecimal amount8);

	/** Get amount8	  */
	public BigDecimal getamount8();

    /** Column name amountnew */
    public static final String COLUMNNAME_amountnew = "amountnew";

	/** Set amountnew	  */
	public void setamountnew (BigDecimal amountnew);

	/** Get amountnew	  */
	public BigDecimal getamountnew();

    /** Column name amountref */
    public static final String COLUMNNAME_amountref = "amountref";

	/** Set amountref	  */
	public void setamountref (BigDecimal amountref);

	/** Get amountref	  */
	public BigDecimal getamountref();

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name C_Period_ID */
    public static final String COLUMNNAME_C_Period_ID = "C_Period_ID";

	/** Set Period.
	  * Period of the Calendar
	  */
	public void setC_Period_ID (int C_Period_ID);

	/** Get Period.
	  * Period of the Calendar
	  */
	public int getC_Period_ID();

	public org.compiere.model.I_C_Period getC_Period() throws RuntimeException;

    /** Column name C_ValidCombination_ID */
    public static final String COLUMNNAME_C_ValidCombination_ID = "C_ValidCombination_ID";

	/** Set Combination.
	  * Valid Account Combination
	  */
	public void setC_ValidCombination_ID (int C_ValidCombination_ID);

	/** Get Combination.
	  * Valid Account Combination
	  */
	public int getC_ValidCombination_ID();

	public org.compiere.model.I_C_ValidCombination getC_ValidCombination() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name docstatus2 */
    public static final String COLUMNNAME_docstatus2 = "docstatus2";

	/** Set docstatus2	  */
	public void setdocstatus2 (String docstatus2);

	/** Get docstatus2	  */
	public String getdocstatus2();

    /** Column name GL_BudgetControl_ID */
    public static final String COLUMNNAME_GL_BudgetControl_ID = "GL_BudgetControl_ID";

	/** Set Budget Control.
	  * Budget Control
	  */
	public void setGL_BudgetControl_ID (int GL_BudgetControl_ID);

	/** Get Budget Control.
	  * Budget Control
	  */
	public int getGL_BudgetControl_ID();

	public org.compiere.model.I_GL_BudgetControl getGL_BudgetControl() throws RuntimeException;

    /** Column name GL_BudgetControlHeaderRef_ID */
    public static final String COLUMNNAME_GL_BudgetControlHeaderRef_ID = "GL_BudgetControlHeaderRef_ID";

	/** Set GL_BudgetControlHeaderRef_ID	  */
	public void setGL_BudgetControlHeaderRef_ID (int GL_BudgetControlHeaderRef_ID);

	/** Get GL_BudgetControlHeaderRef_ID	  */
	public int getGL_BudgetControlHeaderRef_ID();

	public I_GL_BudgetControlHeader getGL_BudgetControlHeaderRef() throws RuntimeException;

    /** Column name GL_BudgetControlLine_ID */
    public static final String COLUMNNAME_GL_BudgetControlLine_ID = "GL_BudgetControlLine_ID";

	/** Set Budget Control Line ID	  */
	public void setGL_BudgetControlLine_ID (int GL_BudgetControlLine_ID);

	/** Get Budget Control Line ID	  */
	public int getGL_BudgetControlLine_ID();

    /** Column name GL_BudgetControlLineRef_ID */
    public static final String COLUMNNAME_GL_BudgetControlLineRef_ID = "GL_BudgetControlLineRef_ID";

	/** Set GL_BudgetControlLineRef_ID	  */
	public void setGL_BudgetControlLineRef_ID (int GL_BudgetControlLineRef_ID);

	/** Get GL_BudgetControlLineRef_ID	  */
	public int getGL_BudgetControlLineRef_ID();

	public I_GL_BudgetControlLine getGL_BudgetControlLineRef() throws RuntimeException;

    /** Column name GL_BudgetControlLineRef2_ID */
    public static final String COLUMNNAME_GL_BudgetControlLineRef2_ID = "GL_BudgetControlLineRef2_ID";

	/** Set GL_BudgetControlLineRef2_ID	  */
	public void setGL_BudgetControlLineRef2_ID (int GL_BudgetControlLineRef2_ID);

	/** Get GL_BudgetControlLineRef2_ID	  */
	public int getGL_BudgetControlLineRef2_ID();

	public I_GL_BudgetControlLine getGL_BudgetControlLineRef2() throws RuntimeException;

    /** Column name GL_BudgetControlRef_ID */
    public static final String COLUMNNAME_GL_BudgetControlRef_ID = "GL_BudgetControlRef_ID";

	/** Set GL_BudgetControlRef_ID	  */
	public void setGL_BudgetControlRef_ID (int GL_BudgetControlRef_ID);

	/** Get GL_BudgetControlRef_ID	  */
	public int getGL_BudgetControlRef_ID();

	public org.compiere.model.I_GL_BudgetControl getGL_BudgetControlRef() throws RuntimeException;

    /** Column name GL_BudgetDetail_ID */
    public static final String COLUMNNAME_GL_BudgetDetail_ID = "GL_BudgetDetail_ID";

	/** Set GL_BudgetDetail_ID	  */
	public void setGL_BudgetDetail_ID (int GL_BudgetDetail_ID);

	/** Get GL_BudgetDetail_ID	  */
	public int getGL_BudgetDetail_ID();

	public I_GL_BudgetDetail getGL_BudgetDetail() throws RuntimeException;

    /** Column name GL_BudgetDetailRef_ID */
    public static final String COLUMNNAME_GL_BudgetDetailRef_ID = "GL_BudgetDetailRef_ID";

	/** Set GL_BudgetDetailRef_ID	  */
	public void setGL_BudgetDetailRef_ID (int GL_BudgetDetailRef_ID);

	/** Get GL_BudgetDetailRef_ID	  */
	public int getGL_BudgetDetailRef_ID();

	public I_GL_BudgetDetail getGL_BudgetDetailRef() throws RuntimeException;

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name IsAdFlag */
    public static final String COLUMNNAME_IsAdFlag = "IsAdFlag";

	/** Set Special AD Flag.
	  * Do we need to specially mention this ad?
	  */
	public void setIsAdFlag (boolean IsAdFlag);

	/** Get Special AD Flag.
	  * Do we need to specially mention this ad?
	  */
	public boolean isAdFlag();

    /** Column name IsHeading */
    public static final String COLUMNNAME_IsHeading = "IsHeading";

	/** Set Heading only.
	  * Field without Column - Only label is displayed
	  */
	public void setIsHeading (boolean IsHeading);

	/** Get Heading only.
	  * Field without Column - Only label is displayed
	  */
	public boolean isHeading();

    /** Column name isrequired */
    public static final String COLUMNNAME_isrequired = "isrequired";

	/** Set isrequired	  */
	public void setisrequired (boolean isrequired);

	/** Get isrequired	  */
	public boolean isrequired();

    /** Column name M_Product_Category_ID */
    public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";

	/** Set Product Category.
	  * Category of a Product
	  */
	public void setM_Product_Category_ID (int M_Product_Category_ID);

	/** Get Product Category.
	  * Category of a Product
	  */
	public int getM_Product_Category_ID();

	public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name mode */
    public static final String COLUMNNAME_mode = "mode";

	/** Set mode	  */
	public void setmode (String mode);

	/** Get mode	  */
	public String getmode();

    /** Column name ofbbutton */
    public static final String COLUMNNAME_ofbbutton = "ofbbutton";

	/** Set ofbbutton	  */
	public void setofbbutton (boolean ofbbutton);

	/** Get ofbbutton	  */
	public boolean isofbbutton();

    /** Column name pagodirecto */
    public static final String COLUMNNAME_pagodirecto = "pagodirecto";

	/** Set pagodirecto	  */
	public void setpagodirecto (boolean pagodirecto);

	/** Get pagodirecto	  */
	public boolean ispagodirecto();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name program */
    public static final String COLUMNNAME_program = "program";

	/** Set program	  */
	public void setprogram (String program);

	/** Get program	  */
	public String getprogram();

    /** Column name Qty */
    public static final String COLUMNNAME_Qty = "Qty";

	/** Set Quantity.
	  * Quantity
	  */
	public void setQty (BigDecimal Qty);

	/** Get Quantity.
	  * Quantity
	  */
	public BigDecimal getQty();

    /** Column name SQLAmountDiff */
    public static final String COLUMNNAME_SQLAmountDiff = "SQLAmountDiff";

	/** Set SQLAmountDiff	  */
	public void setSQLAmountDiff (BigDecimal SQLAmountDiff);

	/** Get SQLAmountDiff	  */
	public BigDecimal getSQLAmountDiff();

    /** Column name SQLAmountDiff2 */
    public static final String COLUMNNAME_SQLAmountDiff2 = "SQLAmountDiff2";

	/** Set SQLAmountDiff2	  */
	public void setSQLAmountDiff2 (BigDecimal SQLAmountDiff2);

	/** Get SQLAmountDiff2	  */
	public BigDecimal getSQLAmountDiff2();

    /** Column name SQLProductNameOrg */
    public static final String COLUMNNAME_SQLProductNameOrg = "SQLProductNameOrg";

	/** Set SQLProductNameOrg	  */
	public void setSQLProductNameOrg (String SQLProductNameOrg);

	/** Get SQLProductNameOrg	  */
	public String getSQLProductNameOrg();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name usedescription */
    public static final String COLUMNNAME_usedescription = "usedescription";

	/** Set usedescription	  */
	public void setusedescription (boolean usedescription);

	/** Get usedescription	  */
	public boolean isusedescription();

    /** Column name UUID */
    public static final String COLUMNNAME_UUID = "UUID";

	/** Set Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID);

	/** Get Immutable Universally Unique Identifier.
	  * Immutable Universally Unique Identifier
	  */
	public String getUUID();
}
