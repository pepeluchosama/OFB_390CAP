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
import org.compiere.util.KeyNamePair;

/** Generated Model for GL_BudgetControlHeader
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_GL_BudgetControlHeader extends PO implements I_GL_BudgetControlHeader, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20200323L;

    /** Standard Constructor */
    public X_GL_BudgetControlHeader (Properties ctx, int GL_BudgetControlHeader_ID, String trxName)
    {
      super (ctx, GL_BudgetControlHeader_ID, trxName);
      /** if (GL_BudgetControlHeader_ID == 0)
        {
			setGL_BudgetControlHeader_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_GL_BudgetControlHeader (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_GL_BudgetControlHeader[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
    {
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_Name)
			.getPO(getAD_User_ID(), get_TrxName());	}

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_Value (COLUMNNAME_AD_User_ID, null);
		else 
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set BudgetType.
		@param BudgetType BudgetType	  */
	public void setBudgetType (String BudgetType)
	{
		set_Value (COLUMNNAME_BudgetType, BudgetType);
	}

	/** Get BudgetType.
		@return BudgetType	  */
	public String getBudgetType () 
	{
		return (String)get_Value(COLUMNNAME_BudgetType);
	}

	public org.compiere.model.I_C_Year getC_Year() throws RuntimeException
    {
		return (org.compiere.model.I_C_Year)MTable.get(getCtx(), org.compiere.model.I_C_Year.Table_Name)
			.getPO(getC_Year_ID(), get_TrxName());	}

	/** Set Year.
		@param C_Year_ID 
		Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1) 
			set_Value (COLUMNNAME_C_Year_ID, null);
		else 
			set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
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

	/** DocAction AD_Reference_ID=135 */
	public static final int DOCACTION_AD_Reference_ID=135;
	/** Complete = CO */
	public static final String DOCACTION_Complete = "CO";
	/** Approve = AP */
	public static final String DOCACTION_Approve = "AP";
	/** Reject = RJ */
	public static final String DOCACTION_Reject = "RJ";
	/** Post = PO */
	public static final String DOCACTION_Post = "PO";
	/** Void = VO */
	public static final String DOCACTION_Void = "VO";
	/** Close = CL */
	public static final String DOCACTION_Close = "CL";
	/** Reverse - Correct = R */
	public static final String DOCACTION_Reverse_Correct = "R";
	/** Reverse - Accrual = RA */
	public static final String DOCACTION_Reverse_Accrual = "RA";
	/** Invalidate = IN */
	public static final String DOCACTION_Invalidate = "IN";
	/** Re-activate = RE */
	public static final String DOCACTION_Re_Activate = "RE";
	/** <None> = -- */
	public static final String DOCACTION_None = "--";
	/** Prepare = PR */
	public static final String DOCACTION_Prepare = "PR";
	/** Unlock = XL */
	public static final String DOCACTION_Unlock = "XL";
	/** Wait Complete = WC */
	public static final String DOCACTION_WaitComplete = "WC";
	/** In Progress = IP */
	public static final String DOCACTION_InProgress = "IP";
	/** Draft = DR */
	public static final String DOCACTION_Draft = "DR";
	/** 20 Jefe Referente Tecnico = JD */
	public static final String DOCACTION_20JefeReferenteTecnico = "JD";
	/** 30 Subdirector RRFF y Adm = SR */
	public static final String DOCACTION_30SubdirectorRRFFYAdm = "SR";
	/** 40 Jefe Abastecimiento = JA */
	public static final String DOCACTION_40JefeAbastecimiento = "JA";
	/** 50 En Ejecutivo Abastecimiento = EA */
	public static final String DOCACTION_50EnEjecutivoAbastecimiento = "EA";
	/** 55 Completar Antecedentes = CA */
	public static final String DOCACTION_55CompletarAntecedentes = "CA";
	/** 60 En Contabilidad por CDP = CC */
	public static final String DOCACTION_60EnContabilidadPorCDP = "CC";
	/** 70 Jefe Finanzas = JF */
	public static final String DOCACTION_70JefeFinanzas = "JF";
	/** 75 Solicitud CDP Complementario = SC */
	public static final String DOCACTION_75SolicitudCDPComplementario = "SC";
	/** 80 Ejecutivo Abastecimiento = SA */
	public static final String DOCACTION_80EjecutivoAbastecimiento = "SA";
	/** 90 Jefe Abastecimiento = JB */
	public static final String DOCACTION_90JefeAbastecimiento = "JB";
	/** 100 Jefe de Juridica = JJ */
	public static final String DOCACTION_100JefeDeJuridica = "JJ";
	/** 110 Revisión por Abogado = AR */
	public static final String DOCACTION_110RevisionPorAbogado = "AR";
	/** 115 Solicitud de Modificaciones = SM */
	public static final String DOCACTION_115SolicitudDeModificaciones = "SM";
	/** 120 En Firmas = EF */
	public static final String DOCACTION_120EnFirmas = "EF";
	/** 125 En Convenio = EC */
	public static final String DOCACTION_125EnConvenio = "EC";
	/** 126 Jefe Juridica (contrato) = JR */
	public static final String DOCACTION_126JefeJuridicaContrato = "JR";
	/** 127 En Juridica = EJ */
	public static final String DOCACTION_127EnJuridica = "EJ";
	/** 122 Jefe Abastecimiento = AJ */
	public static final String DOCACTION_122JefeAbastecimiento = "AJ";
	/** 140 Elaboración Bases Licitación = EB */
	public static final String DOCACTION_140ElaboracionBasesLicitacion = "EB";
	/** 150 Revisión de Bases = RB */
	public static final String DOCACTION_150RevisionDeBases = "RB";
	/** 160 Jefe de Juridica = JU */
	public static final String DOCACTION_160JefeDeJuridica = "JU";
	/** 165 En Toma de Razon = TR */
	public static final String DOCACTION_165EnTomaDeRazon = "TR";
	/** 170 En Firmas = FI */
	public static final String DOCACTION_170EnFirmas = "FI";
	/** 172 Licitación Publicada = LP */
	public static final String DOCACTION_172LicitacionPublicada = "LP";
	/** 173 Clasificación de Licitación = CD */
	public static final String DOCACTION_173ClasificacionDeLicitacion = "CD";
	/** 175 En Convenio = CN */
	public static final String DOCACTION_175EnConvenio = "CN";
	/** 176 Oficina de Partes = EE */
	public static final String DOCACTION_176OficinaDePartes = "EE";
	/** 177 Jefe Juridica = EN */
	public static final String DOCACTION_177JefeJuridica = "EN";
	/** 20 Jefe Abastecimiento = EP */
	public static final String DOCACTION_20JefeAbastecimiento = "EP";
	/** 30 Enviado a Proveedor = EM */
	public static final String DOCACTION_30EnviadoAProveedor = "EM";
	/** 20 En Validación = EV */
	public static final String DOCACTION_20EnValidacion = "EV";
	/** 95 Ejecutivo Abastecimiento = ET */
	public static final String DOCACTION_95EjecutivoAbastecimiento = "ET";
	/** 97 Jefe Abastecimiento = JT */
	public static final String DOCACTION_97JefeAbastecimiento = "JT";
	/** 127 Revision por Abogado = RP */
	public static final String DOCACTION_127RevisionPorAbogado = "RP";
	/** 128 En Convenio = CV */
	public static final String DOCACTION_128EnConvenio = "CV";
	/** 132 Oficina de Partes = OP */
	public static final String DOCACTION_132OficinaDePartes = "OP";
	/** 133 Secretaria Convenio = SE */
	public static final String DOCACTION_133SecretariaConvenio = "SE";
	/** 135 Secretaria Abastecimiento = ST */
	public static final String DOCACTION_135SecretariaAbastecimiento = "ST";
	/** 140 Ejecutivo Abastecimiento = JE */
	//public static final String DOCACTION_140EjecutivoAbastecimiento = "JE";
	/** L1 Publicada = L1 */
	public static final String DOCACTION_L1Publicada = "L1";
	/** L2 Preguntas y Respuestas = L2 */
	public static final String DOCACTION_L2PreguntasYRespuestas = "L2";
	/** L3 Cierre Preguntas y Respuestas = L3 */
	public static final String DOCACTION_L3CierrePreguntasYRespuestas = "L3";
	/** L7 Adjudicacion = L4 */
	public static final String DOCACTION_L7Adjudicacion = "L4";
	/** L5 Proceso Cierre = L5 */
	public static final String DOCACTION_L5ProcesoCierre = "L5";
	/** L6 Periodo Evaluacion = L6 */
	public static final String DOCACTION_L6PeriodoEvaluacion = "L6";
	/** L4 Visita Terreno = L7 */
	public static final String DOCACTION_L4VisitaTerreno = "L7";
	/** 128 Ejecutivo Abastecimiento = AE */
	public static final String DOCACTION_128EjecutivoAbastecimiento = "AE";
	/** 178 Ejecutivo Abastecimiento = ES */
	public static final String DOCACTION_178EjecutivoAbastecimiento = "ES";
	/** 30 Referente Tecnico = RC */
	public static final String DOCACTION_30ReferenteTecnico = "RC";
	/** 40 Jefe Referente Tecnico = RR */
	public static final String DOCACTION_40JefeReferenteTecnico = "RR";
	/** 50 En Convenio - Validacion Doc. Final = VD */
	public static final String DOCACTION_50EnConvenio_ValidacionDocFinal = "VD";
	/** 55 En Contabilidad = CE */
	public static final String DOCACTION_55EnContabilidad = "CE";
	/** 117 Jefe Juridica = UR */
	public static final String DOCACTION_117JefeJuridica = "UR";
	/** 129 Jefe Juridica (resolucion aproba.) = UD */
	public static final String DOCACTION_129JefeJuridicaResolucionAproba = "UD";
	/** 130 Revision por Abogado = BG */
	public static final String DOCACTION_130RevisionPorAbogado = "BG";
	/** 131 Jefe Juridica = ID */
	public static final String DOCACTION_131JefeJuridica = "ID";
	/** 140 Ejecutivo Abastecimiento = MN */
	public static final String DOCACTION_140EjecutivoAbastecimiento = "MN";
	/** 40 En Validacion MP = MP */
	public static final String DOCACTION_40EnValidacionMP = "MP";
	/** 15 Especialista Referente Tecnico = ER */
	public static final String DOCACTION_15EspecialistaReferenteTecnico = "ER";
	/** 27 Subdirector APS = SP */
	public static final String DOCACTION_27SubdirectorAPS = "SP";
	/** 28 Subdirector Coordinacion Adm. = AD */
	public static final String DOCACTION_28SubdirectorCoordinacionAdm = "AD";
	/** 29 Subdirector RR.HH = RH */
	public static final String DOCACTION_29SubdirectorRRHH = "RH";
	/** 25 Subdirector Medico = ME */
	public static final String DOCACTION_25SubdirectorMedico = "ME";
	/** 121 Secretaria Abastecimiento = AS */
	public static final String DOCACTION_121SecretariaAbastecimiento = "AS";
	/** 125.A Oficina de Partes = OF */
	public static final String DOCACTION_125AOficinaDePartes = "OF";
	/** 176.A Revision por Abogado = GA */
	public static final String DOCACTION_176ARevisionPorAbogado = "GA";
	/** Set Document Action.
		@param DocAction 
		The targeted status of the document
	  */
	public void setDocAction (String DocAction)
	{

		set_Value (COLUMNNAME_DocAction, DocAction);
	}

	/** Get Document Action.
		@return The targeted status of the document
	  */
	public String getDocAction () 
	{
		return (String)get_Value(COLUMNNAME_DocAction);
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

	/** Set GL_BudgetControlHeader ID.
		@param GL_BudgetControlHeader_ID GL_BudgetControlHeader ID	  */
	public void setGL_BudgetControlHeader_ID (int GL_BudgetControlHeader_ID)
	{
		if (GL_BudgetControlHeader_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_GL_BudgetControlHeader_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_GL_BudgetControlHeader_ID, Integer.valueOf(GL_BudgetControlHeader_ID));
	}

	/** Get GL_BudgetControlHeader ID.
		@return GL_BudgetControlHeader ID	  */
	public int getGL_BudgetControlHeader_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_BudgetControlHeader_ID);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
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