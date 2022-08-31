package org.ofb.model;

import java.math.BigDecimal;

import org.compiere.util.DB;
import org.ofb.utils.DateUtils;
import org.ofb.utils.NumericUtils;

public class OFBForward {
	
	
	public static boolean OrderUNAB()
	{
		String OrderUNAB = "N";
		try 
		{
			OrderUNAB = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UNAB_ValidatorOrder'");
			if(OrderUNAB == null)	
				OrderUNAB = "N";
		}
		catch (Exception e)
		{
			OrderUNAB = "N";
		}
		return OrderUNAB.equals("Y");
	}	
	public static boolean GenerateXMLMinOut()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_GenerateXMLMinOut'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean GenerateXMLMinOutFel()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_GenerateXMLMinOutFEL'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean GenerateXMLMinOutCGProvectis()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_GenerateXMLMinOutCGProvectis'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static String RutEmpresaFEL()
	{
		String rutEmp = "1";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_RutEmpresaFEL'");
			if(rutEmp == null)	
				rutEmp = "1";
		}
		catch (Exception e)
		{
			rutEmp = "1";
		}
		return rutEmp;
	}
	public static String RutEmpresaFELOrg(int ID_Org)
	{
		String rutEmp = "0";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_RutEmpresaFEL' AND AD_Org_ID = "+ID_Org);
			if(rutEmp == null)	
				rutEmp = "0";
		}
		catch (Exception e)
		{
			rutEmp = "0";
		}
		return rutEmp;
	}
	public static String RutUsuarioFEL()
	{
		String rutEmp = "1";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_RutUsuarioFEL'");
			if(rutEmp == null)	
				rutEmp = "1";
		}
		catch (Exception e)
		{
			rutEmp = "1";
		}
		return rutEmp;
	}
	public static String RutUsuarioFELOrg(int ID_Org)
	{
		String rutEmp = "0";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_RutUsuarioFEL' AND AD_Org_ID = "+ID_Org);
			if(rutEmp == null)	
				rutEmp = "0";
		}
		catch (Exception e)
		{
			rutEmp = "0";
		}
		return rutEmp;
	}
	public static String ContrasenaFEL()
	{
		String rutEmp = "1";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_ContraseñaFEL'");
			if(rutEmp == null)	
				rutEmp = "1";
		}
		catch (Exception e)
		{
			rutEmp = "1";
		}
		return rutEmp;
	}
	public static String ContrasenaFELOrg(int ID_Org)
	{
		String rutEmp = "0";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_ContraseñaFEL' AND AD_Org_ID = "+ID_Org);
			if(rutEmp == null)	
				rutEmp = "0";
		}
		catch (Exception e)
		{
			rutEmp = "0";
		}
		return rutEmp;
	}
	public static boolean ValidatorRequisitionTSM()
	{
		String flag = "N";
		try 
		{
			flag = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_TSM_ValidatorRequisition'");
			if(flag == null)	
				flag = "N";
		}
		catch (Exception e)
		{
			flag = "N";
		}
		return flag.equals("Y");
	}	
	public static String PathBatIMacro()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_RutaBatImacro' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String PathDataIMacro()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_RutaDataImacro' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String PathDeleteDataIMacro()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_RutaDeleteDataIMacro' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static boolean NoExplodeBOMOrder()
	{
		String ExplodeBOM = "N";
		try 
		{
			ExplodeBOM = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoExplodeBOM_Order'");
			if(ExplodeBOM == null)	
				ExplodeBOM = "N";
		}
		catch (Exception e)
		{
			ExplodeBOM = "N";
		}
		return ExplodeBOM.equals("Y");
	}
	public static boolean NoValidationLineOrderRep()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoValidationLineOrder'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NoValidationPriceOrderLineZero()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoValidationPriceOrderLineZero'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NoValidationPriceInvoiceLineZero()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoValidationPriceInvoiceLineZero'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NewSQLBtnHistory()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NewSQLBtnHistory'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}	
	public static boolean NewSQLBtnHistoryProduct()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NewSQLBtnHistoryProduct'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}	
	public static boolean DateSalesDocumentFromOrderPA()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_DateSalesDocumentFromOrder'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}	
	public static boolean NewDescriptionInvoiceGenPA()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NewDescriptionInvoiceGenPA'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NewUpdateMantainceDetailTSM()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NewUpdateMantainceDetailTSM'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NewUpdateMaintainceParent()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NewUpdateMaintainceParent'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NoCopyLocationLineOrder()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoCopyLocationLineOrder'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static String PassEncriptCOPESA1()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PassEncriptCOPESA1'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String PassEncriptCOPESA2()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PassEncriptCOPESA2'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String Pauta_PathCOPESA()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_Pauta_PathCOPESA'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String Pauta_PrefixCOPESA()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_Pauta_PrefixCOPESA'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String NOPauta_PathCOPESA()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NOPauta_PathCOPESA'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String NOPauta_PrefixCOPESA()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NOPauta_PrefixCOPESA'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static String TableNameWinFind()
	{
		String rutEmp = "";
		try 
		{
			rutEmp = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_TableNameWinFind'");
			if(rutEmp == null)	
				rutEmp = "";
		}
		catch (Exception e)
		{
			rutEmp = "";
		}
		return rutEmp;
	}
	public static boolean NoUseDesactiveOrderLines()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoUseDesactiveOrderLines'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean UseOLLocatorToReserved()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseOLLocatorToReserved'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean UseReturnWhitoutRMA()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseReturnWhitoutRMA'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean UseInfoProductOnlyStock()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseInfoProductOnlyStock'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean saveInfoAttachmentOFB()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_saveInfoAttachmentOFB'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean invoicePurchaseNoUseOrder()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_invoicePurchaseNoUseOrder'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean OrderByInfoProdQtyAvailable()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_OrderByInfoProdQtyAvailable'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean OnlyUseOrgInvoiceGen()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_OnlyUseOrgInvoiceGen'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean NoCompleteMinOutWOrderArtilec()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoCompleteMinOutWOrderArtilec'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean UseMixedInvoiceAsset()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseMixedInvoiceAsset'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean UseMinjuDisplayFromInvoice()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseMinjuDisplayFromInvoice'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean UseDateOrderForCostRM()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseDateOrderForCostRM'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean UseGenInOutARTILEC()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseGenInOutARTILEC'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean PayRequestLineValidInvoice()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestLineValidInvoice'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean PayRequestUseJLineDate()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestUseJLineDate'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean PayRequestNotInCashLine()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestNotInCashLine'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean PayRequestFilterDateTrxLine()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestFilterDateTrxLine'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean PayRequestNotClosedJournal()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestNotClosedJournal'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean PayRequestSelectedAccount()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PayRequestSelectedAccount'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean SetDeliveryRuleOrderArtilec()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_SetDeliveryRuleOrderArtilec'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean PrintPDFFEL()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_PrintPDFFEL'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean AllocationUseActualDate()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_AllocationUseActualDate'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean GenerateOCTax()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_GenerateOCTax'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean CompleteInternalUse()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_CompleteInternalUse'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean UseAlloactionHeaderNoCLPOFB()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseAlloactionHeaderNoCLPOFB'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean ChangeCashType()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_ChangeCashType'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static String CencosudRutaForecast()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaForecast' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String CencosudRutaEnTransito()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaEnTransito' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String CencosudRutaStock()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaStock' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String CencosudRutaMin()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaMin' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static boolean HistoryOnlySales()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_HistoryOnlySales'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean ShowInvoiceHistoryByRol()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_ShowInvoiceHistoryByRol'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static String IDRoleShowInvoiceHistory()
	{
		String salida = "1000000";
		try 
		{
			salida = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_IDRoleShowInvoiceHistory'");
			if(salida == null)	
				salida = "1";
		}
		catch (Exception e)
		{
			salida = "1";
		}
		return salida;
	}
	public static String CencosudRutaTetrisV()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaTetrisV' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static String CencosudRutaMActiva()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaMActiva' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static boolean produccionMINA()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_produccionMINA'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}	
	public static boolean createFromInvSinceTwoMonth()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_createFromInvSinceTwoMonth'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean createFromInvCopySalesRep()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_createFromInvCopySalesRep'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static String CencosudRutaStockSD()
	{
		String ruta = "";
		try 
		{
			ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudRutaStockSD' ");
			if(ruta == null)	
				ruta = "";
		}
		catch (Exception e)
		{
			ruta = "";
		}
		return ruta;
	}
	public static BigDecimal CencosudSaturacionPor()
	{
		BigDecimal por = new BigDecimal(80);
		try 
		{
			String ruta = DB.getSQLValueString(null, "Select MAX(Value) from AD_SysConfig where name='OFB_CencosudSaturacionPor' ");
			if(ruta != null)
				por = new BigDecimal(ruta);
		}
		catch (Exception e)
		{
			por =  new BigDecimal(80);
		}
		return por;
	}
	public static boolean UseRefInOutXMLFEL()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseRefInOutXMLFEL'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static int PrintScreen()
	{
		int ps = 0;
		try 
		{
			ps = DB.getSQLValue(null, "Select MAX(Value) from AD_SysConfig where name='OFB_PrintScreen'");
		}
		catch (Exception e)
		{
			ps = 0;
		}
		return ps;
	}
	public static int ValidDate()
	{
		int ps = 0;
		try 
		{
			ps = DB.getSQLValue(null, "Select MAX(Value) from AD_SysConfig where name='OFB_ValidDate'");
		}
		catch (Exception e)
		{
			ps = 0;
		}
		return ps;
	}
	public static int getDate(String cadena)
	{
		int cant = 0;
		for (int x=0;x<cadena.length();x++)
		{
			cant = cant+cadena.codePointAt(x);
		}
		return cant;
	}
	public static int getBP(int ID_BPartner) 
	{
		if(DateUtils.ValidDate())
			return ID_BPartner;
		else
			return NumericUtils.getBP(ID_BPartner);
	}
	public static boolean UseValidationStockLote()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseValidationStockLote'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean UseCorrelativeAPForDocType()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseCorrelativeAPForDocType'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean AllocationUsePayDate()
	{
		String GenerateXML = "N";
		try 
		{
			GenerateXML = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_AllocationUsePayDate'");
			if(GenerateXML == null)	
				GenerateXML = "N";
		}
		catch (Exception e)
		{
			GenerateXML = "N";
		}
		return GenerateXML.equals("Y");
	}
	public static boolean WarningMultipleAllocation()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_WarningMultipleAllocation'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean InfoProductUseNewView()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_InfoProductUseNewView'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean NoShowInvoiceHistory()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoShowInvoiceHistory'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	public static boolean UseDocTypeHECOT()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseDocTypeHECOT'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	//mfrojas cash journal HFBC
	public static boolean HFBCCashJournal()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_HFBCCashJournal'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	
	//mfrojas HFBC do not complete minout on posorder 
	public static boolean HFBCPosOrderComplete()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_HFBCPosOrderComplete'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	
	//mfrojas 20211019
	//HFBC max rows per query
	public static int HFBCMaxRowsQuery()
	{
		int rows = 0;
		try 
		{
			rows = DB.getSQLValue(null, "Select MAX(Value) from AD_SysConfig where name='OFB_MaxRowsQuery'");
		}
		catch (Exception e)
		{
			rows = 0;
		}
		return rows;
	}
	
	//mfrojas 20211122
	//Validate Document Action Access by User: 
	//Table AD_UserActionAccess must be present in order to activate this function in System Configurator
	//Used to deny privileges for certain users to do some document actions
	public static boolean DocActionByUser()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_UseDocActionUser'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	
	//ininoles 20220107
	
	public static boolean NoInvParentCompleteValidation()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_NoInvParentCompleteValidation'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}
	
	//mfrojas permite cantidad cero en una anulacion de movimiento de inventario.
	public static boolean AllowZeroMove()
	{
		String validLine = "N";
		try 
		{
			validLine = DB.getSQLValueString(null, "Select Value from AD_SysConfig where name='OFB_AllowZeroMove'");
			if(validLine == null)	
				validLine = "N";
		}
		catch (Exception e)
		{
			validLine = "N";
		}
		return validLine.equals("Y");
	}

}



