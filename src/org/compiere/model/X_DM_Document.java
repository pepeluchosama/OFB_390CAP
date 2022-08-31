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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for DM_Document
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_DM_Document extends PO implements I_DM_Document, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200318L;

    /** Standard Constructor */
    public X_DM_Document (Properties ctx, int DM_Document_ID, String trxName)
    {
      super (ctx, DM_Document_ID, trxName);
      /** if (DM_Document_ID == 0)
        {
			setDM_Document_ID (0);
        } */
    }

    /** Load Constructor */
    public X_DM_Document (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_DM_Document[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amt 
		Amount
	  */
	public void setAmt (BigDecimal Amt)
	{
		set_Value (COLUMNNAME_Amt, Amt);
	}

	/** Get Amount.
		@return Amount
	  */
	public BigDecimal getAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	public org.compiere.model.I_C_BPartner getC_BPartner_Ref() throws RuntimeException
    {
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_Ref_ID(), get_TrxName());	}

	/** Set C_BPartner_Ref_ID.
		@param C_BPartner_Ref_ID C_BPartner_Ref_ID	  */
	public void setC_BPartner_Ref_ID (int C_BPartner_Ref_ID)
	{
		if (C_BPartner_Ref_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_Ref_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_Ref_ID, Integer.valueOf(C_BPartner_Ref_ID));
	}

	/** Get C_BPartner_Ref_ID.
		@return C_BPartner_Ref_ID	  */
	public int getC_BPartner_Ref_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Ref_ID);
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

	/** Set DM_Document ID.
		@param DM_Document_ID DM_Document ID	  */
	public void setDM_Document_ID (int DM_Document_ID)
	{
		if (DM_Document_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_DM_Document_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_DM_Document_ID, Integer.valueOf(DM_Document_ID));
	}

	/** Get DM_Document ID.
		@return DM_Document ID	  */
	public int getDM_Document_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DM_Document_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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
	/** 176 Oficina de Partes = EE */
	public static final String DOCSTATUS_176OficinaDePartes = "EE";
	/** 120 En Firmas = EF */
	public static final String DOCSTATUS_120EnFirmas = "EF";
	/** 127 En Juridica = EJ */
	public static final String DOCSTATUS_127EnJuridica = "EJ";
	/** 177 Jefe Juridica = EN */
	public static final String DOCSTATUS_177JefeJuridica = "EN";
	/** 170 En Firmas = FI */
	public static final String DOCSTATUS_170EnFirmas = "FI";
	/** 40 Jefe Abastecimiento = JA */
	public static final String DOCSTATUS_40JefeAbastecimiento = "JA";
	/** 90 Jefe Abastecimiento = JB */
	public static final String DOCSTATUS_90JefeAbastecimiento = "JB";
	/** 20 Jefe Referente Tecnico = JD */
	public static final String DOCSTATUS_20JefeReferenteTecnico = "JD";
	/** 70 Jefe Finanzas = JF */
	public static final String DOCSTATUS_70JefeFinanzas = "JF";
	/** 100 Jefe de Juridica = JJ */
	public static final String DOCSTATUS_100JefeDeJuridica = "JJ";
	/** 160 Jefe de Juridica = JU */
	public static final String DOCSTATUS_160JefeDeJuridica = "JU";
	/** 172 Licitación Publicada = LP */
	public static final String DOCSTATUS_172LicitacionPublicada = "LP";
	/** 122 Jefe Abastecimiento = AJ */
	public static final String DOCSTATUS_122JefeAbastecimiento = "AJ";
	/** 126 Jefe Juridica (contrato) = JR */
	public static final String DOCSTATUS_126JefeJuridicaContrato = "JR";
	/** 150 Revisión de Bases = RB */
	public static final String DOCSTATUS_150RevisionDeBases = "RB";
	/** 80 Ejecutivo Abastecimiento = SA */
	public static final String DOCSTATUS_80EjecutivoAbastecimiento = "SA";
	/** 75 Solicitud CDP Complementario = SC */
	public static final String DOCSTATUS_75SolicitudCDPComplementario = "SC";
	/** 115 Solicitud de Modificaciones = SM */
	public static final String DOCSTATUS_115SolicitudDeModificaciones = "SM";
	/** 30 Subdirector RRFF y Adm. = SR */
	public static final String DOCSTATUS_30SubdirectorRRFFYAdm = "SR";
	/** 165 En Toma de Razón = TR */
	public static final String DOCSTATUS_165EnTomaDeRazon = "TR";
	/** 20 Jefe Abastecimiento = EP */
	public static final String DOCSTATUS_20JefeAbastecimiento = "EP";
	/** 30 Enviado a Proveedor = EM */
	public static final String DOCSTATUS_30EnviadoAProveedor = "EM";
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
	/** 132 Oficina de Partes = OP */
	public static final String DOCSTATUS_132OficinaDePartes = "OP";
	/** 133 Secretaria Convenio = SE */
	public static final String DOCSTATUS_133SecretariaConvenio = "SE";
	/** 135 Secretaria Abastecimiento = ST */
	public static final String DOCSTATUS_135SecretariaAbastecimiento = "ST";
	/** 140 Ejecutivo Abastecimiento = JE */
	//public static final String DOCSTATUS_140EjecutivoAbastecimiento = "JE";
	/** L1 Publicada = L1 */
	public static final String DOCSTATUS_L1Publicada = "L1";
	/** L2 Preguntas y Respuestas = L2 */
	public static final String DOCSTATUS_L2PreguntasYRespuestas = "L2";
	/** L3 Cierre Preguntas y Respuestas = L3 */
	public static final String DOCSTATUS_L3CierrePreguntasYRespuestas = "L3";
	/** L7 Adjudicacion = L4 */
	public static final String DOCSTATUS_L7Adjudicacion = "L4";
	/** L5 Proceso Cierre = L5 */
	public static final String DOCSTATUS_L5ProcesoCierre = "L5";
	/** L6 Periodo Evaluacion = L6 */
	public static final String DOCSTATUS_L6PeriodoEvaluacion = "L6";
	/** L4 Visita Terreno = L7 */
	public static final String DOCSTATUS_L4VisitaTerreno = "L7";
	/** 128 Ejecutivo Abastecimiento = AE */
	public static final String DOCSTATUS_128EjecutivoAbastecimiento = "AE";
	/** 178 Ejecutivo Abastecimiento = ES */
	public static final String DOCSTATUS_178EjecutivoAbastecimiento = "ES";
	/** 30 Referente Tecnico = RC */
	public static final String DOCSTATUS_30ReferenteTecnico = "RC";
	/** 40 Jefe Referente Tecnico = RR */
	public static final String DOCSTATUS_40JefeReferenteTecnico = "RR";
	/** 50 En Convenio - Validacion Doc. Final = VD */
	public static final String DOCSTATUS_50EnConvenio_ValidacionDocFinal = "VD";
	/** 55 En Contabilidad = CE */
	public static final String DOCSTATUS_55EnContabilidad = "CE";
	/** 117 Jefe Juridica = UR */
	public static final String DOCSTATUS_117JefeJuridica = "UR";
	/** 129 Jefe Juridica (resolucion aproba.) = UD */
	public static final String DOCSTATUS_129JefeJuridicaResolucionAproba = "UD";
	/** 130 Revision por Abogado = BG */
	public static final String DOCSTATUS_130RevisionPorAbogado = "BG";
	/** 131 Jefe Juridica = ID */
	public static final String DOCSTATUS_131JefeJuridica = "ID";
	/** 140 Ejecutivo Abastecimiento = MN */
	public static final String DOCSTATUS_140EjecutivoAbastecimiento = "MN";
	/** 40 En Validacion MP = MP */
	public static final String DOCSTATUS_40EnValidacionMP = "MP";
	/** 15 Especialista Referente Tecnico = ER */
	public static final String DOCSTATUS_15EspecialistaReferenteTecnico = "ER";
	/** 27 Subdirector APS = SP */
	public static final String DOCSTATUS_27SubdirectorAPS = "SP";
	/** 28 Subdirector Coordinacion Adm. = AD */
	public static final String DOCSTATUS_28SubdirectorCoordinacionAdm = "AD";
	/** 29 Subdirector RR.HH = RH */
	public static final String DOCSTATUS_29SubdirectorRRHH = "RH";
	/** 25 Subdirector Medico = ME */
	public static final String DOCSTATUS_25SubdirectorMedico = "ME";
	/** 121 Secretaria Abastecimiento = AS */
	public static final String DOCSTATUS_121SecretariaAbastecimiento = "AS";
	/** 125.A Oficina de Partes = OF */
	public static final String DOCSTATUS_125AOficinaDePartes = "OF";
	/** 176.A Revision por Abogado = GA */
	public static final String DOCSTATUS_176ARevisionPorAbogado = "GA";
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

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set End Date.
		@param EndDate 
		Last effective date (inclusive)
	  */
	public void setEndDate (Timestamp EndDate)
	{
		set_Value (COLUMNNAME_EndDate, EndDate);
	}

	/** Get End Date.
		@return Last effective date (inclusive)
	  */
	public Timestamp getEndDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_EndDate);
	}

	/** Set Expected Close Date.
		@param ExpectedCloseDate 
		Expected Close Date
	  */
	public void setExpectedCloseDate (Timestamp ExpectedCloseDate)
	{
		set_Value (COLUMNNAME_ExpectedCloseDate, ExpectedCloseDate);
	}

	/** Get Expected Close Date.
		@return Expected Close Date
	  */
	public Timestamp getExpectedCloseDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ExpectedCloseDate);
	}

	/** Set ExpirationDate.
		@param ExpirationDate ExpirationDate	  */
	public void setExpirationDate (Timestamp ExpirationDate)
	{
		set_Value (COLUMNNAME_ExpirationDate, ExpirationDate);
	}

	/** Get ExpirationDate.
		@return ExpirationDate	  */
	public Timestamp getExpirationDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_ExpirationDate);
	}

	public org.compiere.model.I_M_Requisition getM_Requisition() throws RuntimeException
    {
		return (org.compiere.model.I_M_Requisition)MTable.get(getCtx(), org.compiere.model.I_M_Requisition.Table_Name)
			.getPO(getM_Requisition_ID(), get_TrxName());	}

	/** Set Requisition.
		@param M_Requisition_ID 
		Material Requisition
	  */
	public void setM_Requisition_ID (int M_Requisition_ID)
	{
		if (M_Requisition_ID < 1) 
			set_Value (COLUMNNAME_M_Requisition_ID, null);
		else 
			set_Value (COLUMNNAME_M_Requisition_ID, Integer.valueOf(M_Requisition_ID));
	}

	/** Get Requisition.
		@return Material Requisition
	  */
	public int getM_Requisition_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Requisition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Percent.
		@param Percent 
		Percentage
	  */
	public void setPercent (BigDecimal Percent)
	{
		set_Value (COLUMNNAME_Percent, Percent);
	}

	/** Get Percent.
		@return Percentage
	  */
	public BigDecimal getPercent () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Percent);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set Start Date.
		@param StartDate 
		First effective day (inclusive)
	  */
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
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