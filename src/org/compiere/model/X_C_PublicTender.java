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
import org.compiere.model.*;

/** Generated Model for C_PublicTender
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_C_PublicTender extends PO implements I_C_PublicTender, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191227L;

    /** Standard Constructor */
    public X_C_PublicTender (Properties ctx, int C_PublicTender_ID, String trxName)
    {
      super (ctx, C_PublicTender_ID, trxName);
      /** if (C_PublicTender_ID == 0)
        {
			setC_PublicTender_ID (0);
        } */
    }

    /** Load Constructor */
    public X_C_PublicTender (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_C_PublicTender[")
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

	public org.compiere.model.I_C_Order getC_Order() throws RuntimeException
    {
		return (org.compiere.model.I_C_Order)MTable.get(getCtx(), org.compiere.model.I_C_Order.Table_Name)
			.getPO(getC_Order_ID(), get_TrxName());	}

	/** Set Order.
		@param C_Order_ID 
		Order
	  */
	public void setC_Order_ID (int C_Order_ID)
	{
		if (C_Order_ID < 1) 
			set_Value (COLUMNNAME_C_Order_ID, null);
		else 
			set_Value (COLUMNNAME_C_Order_ID, Integer.valueOf(C_Order_ID));
	}

	/** Get Order.
		@return Order
	  */
	public int getC_Order_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Order_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_PublicTender ID.
		@param C_PublicTender_ID C_PublicTender ID	  */
	public void setC_PublicTender_ID (int C_PublicTender_ID)
	{
		if (C_PublicTender_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_C_PublicTender_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_C_PublicTender_ID, Integer.valueOf(C_PublicTender_ID));
	}

	/** Get C_PublicTender ID.
		@return C_PublicTender ID	  */
	public int getC_PublicTender_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_PublicTender_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Date.
		@param Date1 
		Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Date2.
		@param Date2 Date2	  */
	public void setDate2 (Timestamp Date2)
	{
		set_Value (COLUMNNAME_Date2, Date2);
	}

	/** Get Date2.
		@return Date2	  */
	public Timestamp getDate2 () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Date2);
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

	/** DocStatus AD_Reference_ID=131 */
	public static final int DOCSTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String DOCSTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String DOCSTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String DOCSTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String DOCSTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String DOCSTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String DOCSTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String DOCSTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String DOCSTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String DOCSTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String DOCSTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String DOCSTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String DOCSTATUS_WaitingConfirmation = "WC";
	/** 110 Revisión por Abogado = AR */
	public static final String DOCSTATUS_110RevisionPorAbogado = "AR";
	/** 55 Completar Antecedentes = CA */
	public static final String DOCSTATUS_55CompletarAntecedentes = "CA";
	/** 60 En Contabilidad por CDP = CC */
	public static final String DOCSTATUS_60EnContabilidadPorCDP = "CC";
	/** 173 Clasificación de Licitación = CD */
	public static final String DOCSTATUS_173ClasificacionDeLicitacion = "CD";
	/** 175 En Convenio = CN */
	public static final String DOCSTATUS_175EnConvenio = "CN";
	/** 50 En Ejecutivo Abastecimiento = EA */
	public static final String DOCSTATUS_50EnEjecutivoAbastecimiento = "EA";
	/** 140 Elaboración Bases Licitación = EB */
	public static final String DOCSTATUS_140ElaboracionBasesLicitacion = "EB";
	/** 125 En Convenio = EC */
	public static final String DOCSTATUS_125EnConvenio = "EC";
	/** 176 En Espera = EE */
	public static final String DOCSTATUS_176EnEspera = "EE";
	/** 120 En Firmas = EF */
	public static final String DOCSTATUS_120EnFirmas = "EF";
	/** 127 En Juridica = EJ */
	public static final String DOCSTATUS_127EnJuridica = "EJ";
	/** 177 En Juridica = EN */
	public static final String DOCSTATUS_177EnJuridica = "EN";
	/** 170 En Firmas = FI */
	public static final String DOCSTATUS_170EnFirmas = "FI";
	/** 40 Jefe Abastecimiento = JA */
	public static final String DOCSTATUS_40JefeAbastecimiento = "JA";
	/** 90 Jefe Abastecimiento = JB */
	public static final String DOCSTATUS_90JefeAbastecimiento = "JB";
	/** 20 Jefe Directo = JD */
	public static final String DOCSTATUS_20JefeDirecto = "JD";
	/** 70 Jefe Finanzas = JF */
	public static final String DOCSTATUS_70JefeFinanzas = "JF";
	/** 100 Jefe de Juridica = JJ */
	public static final String DOCSTATUS_100JefeDeJuridica = "JJ";
	/** 160 Jefe de Juridica = JU */
	public static final String DOCSTATUS_160JefeDeJuridica = "JU";
	/** 172 Licitación Publicada = LP */
	public static final String DOCSTATUS_172LicitacionPublicada = "LP";
	/** 122 Oficina de Partes = OF */
	public static final String DOCSTATUS_122OficinaDePartes = "OF";
	/** 126 Jefe Juridica = JR */
	public static final String DOCSTATUS_126JefeJuridica = "JR";
	/** 150 Revisión de Bases = RB */
	public static final String DOCSTATUS_150RevisionDeBases = "RB";
	/** 80 Jefe Abastecimiento = SA */
	public static final String DOCSTATUS_80JefeAbastecimiento = "SA";
	/** 75 Solicitud CDP Complementario = SC */
	public static final String DOCSTATUS_75SolicitudCDPComplementario = "SC";
	/** 115 Solicitud de Modificaciones = SM */
	public static final String DOCSTATUS_115SolicitudDeModificaciones = "SM";
	/** 30 Subdirector RRFF y Adm. = SR */
	public static final String DOCSTATUS_30SubdirectorRRFFYAdm = "SR";
	/** 165 En Toma de Razón = TR */
	public static final String DOCSTATUS_165EnTomaDeRazon = "TR";
	/** 20 Enviado a Proveedor = EP */
	public static final String DOCSTATUS_20EnviadoAProveedor = "EP";
	/** 30 En Validación MP = EM */
	public static final String DOCSTATUS_30EnValidacionMP = "EM";
	/** 20 En Validación = EV */
	public static final String DOCSTATUS_20EnValidacion = "EV";
	/** 95 Ejecutivo Abastecimiento = ET */
	public static final String DOCSTATUS_95EjecutivoAbastecimiento = "ET";
	/** 97 Jefe Abastecimiento = JT */
	public static final String DOCSTATUS_97JefeAbastecimiento = "JT";
	/** 127 Revision por Abogado = RP */
	public static final String DOCSTATUS_127RevisionPorAbogado = "RP";
	/** 128 En Convenio = CV */
	public static final String DOCSTATUS_128EnConvenio = "CV";
	/** 129 Oficina de Partes = OP */
	public static final String DOCSTATUS_129OficinaDePartes = "OP";
	/** 130 Secretaria Convenio = SE */
	public static final String DOCSTATUS_130SecretariaConvenio = "SE";
	/** 135 Secretaria Abastecimiento = ST */
	public static final String DOCSTATUS_135SecretariaAbastecimiento = "ST";
	/** 140 Jefe Abastecimiento = JE */
	public static final String DOCSTATUS_140JefeAbastecimiento = "JE";
	/** Set Document Status.
		@param DocStatus 
		The current status of the document
	  */
	public void setDocStatus (String DocStatus)
	{

		set_Value (COLUMNNAME_DocStatus, DocStatus);
	}

	/** Get Document Status.
		@return The current status of the document
	  */
	public String getDocStatus () 
	{
		return (String)get_Value(COLUMNNAME_DocStatus);
	}

	/** Set ofbbutton.
		@param ofbbutton ofbbutton	  */
	public void setofbbutton (String ofbbutton)
	{
		set_Value (COLUMNNAME_ofbbutton, ofbbutton);
	}

	/** Get ofbbutton.
		@return ofbbutton	  */
	public String getofbbutton () 
	{
		return (String)get_Value(COLUMNNAME_ofbbutton);
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