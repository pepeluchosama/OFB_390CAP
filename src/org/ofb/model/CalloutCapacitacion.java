package org.ofb.model;
import java.math.BigDecimal;
import java.util.*;
import org.compiere.model.*;
import org.compiere.util.Env;


public class CalloutCapacitacion extends CalloutEngine{
	
	public String sumaTotal(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		
		
		BigDecimal Amt1 =(BigDecimal) mTab.getValue("Amount1");
		BigDecimal Amt2 =(BigDecimal) mTab.getValue("Amount2");
		
		if(Amt1==null) {
			mTab.fireDataStatusEEvent ("Valor NULO", "Ingrese un numero en campo Amount1", true);
			return "";
		}
		
		if(Amt2==null) {
			mTab.fireDataStatusEEvent ("Valor NULO", "Ingrese un numero en campo Amount2", true);
			return "";
		}
		
		mTab.setValue("AmountTotal", Amt1.floatValue()+Amt2.floatValue());
		return "";
		
	}
	
	public String largoCadena(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		
		String cadena = (String) mTab.getValue("Name");
		if(cadena.length()<11) {
			mTab.fireDataStatusEEvent ("Largo Nombre Inválido ("+cadena.length()+" Caracteres)", "Debe tener mas de 10 caracteres", true);
			mTab.setValue("Name", null);
			return "";
		}
		
		return "";
	}
	
	public String aprobacion(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		
		CalloutDMDocument apro = new CalloutDMDocument();
		apro.Signature1(ctx, WindowNo, mTab, mField, value);
		
		
		return "";
	}
	
	public String ShowFuncionario(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if(value==null)
			return "";
		X_OFB_Funcionario func = new X_OFB_Funcionario(Env.getCtx(),Integer.parseInt(value.toString()),null);
		String nombre =func.getName().toString();
		return nombre;
	}
	
	
	public String CopyCargo(Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value) {
		if(value==null) {
			mTab.setValue("FuncionarioPosition", "");
			return "";
		}
		X_OFB_Funcionario func = new X_OFB_Funcionario(Env.getCtx(),Integer.parseInt(value.toString()),null);
		mTab.setValue("FuncionarioPosition", func.getPosition());
		
		return "";
	}
	

}
