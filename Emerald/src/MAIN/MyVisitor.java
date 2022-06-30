package MAIN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ANTLR.ParserTBaseVisitor;
import ANTLR.ParserTParser;
import ANTLR.ParserTParser.Var_declaracionContext;
import ANTLR.ParserTParser.Var_asignacionContext;
import ANTLR.ParserTParser.PrintlnContext;
import ANTLR.ParserTParser.ParaContext;
import ANTLR.ParserTParser.ControlContext;
import ANTLR.ParserTParser.SinContext;
import ANTLR.ParserTParser.CosContext;
import ANTLR.ParserTParser.SumaContext;
import ANTLR.ParserTParser.ScanContext;
import ANTLR.ParserTParser.StatementContext;
import ANTLR.ParserTParser.RepetirContext;
import ANTLR.ParserTParser.CondicionContext;
import ANTLR.ParserTParser.Cons_declarationContext;
import ANTLR.ParserTParser.ConsContext;
import ANTLR.ParserTParser.OperadoresContext;
import ANTLR.ParserTParser.PasoContext;
import ANTLR.ParserTParser.TypeContext;
import ANTLR.ParserTParser.VarContext;
 
public class MyVisitor extends ParserTBaseVisitor<Integer> {
	private Map<String, String>  variables = new HashMap<String, String>();
	private Map<String, String>  types = new HashMap<String, String>();
	
	
	public Integer visitVar_declaracion(Var_declaracionContext ctx){
		String type = ctx.type().getText();
		String nombre = ctx.NOMBRE().getText();
		
		//System.out.println(ctx.type().getText());
		//System.out.println(ctx.NOMBRE().getText());
		
		types.put(nombre, type);
		
		return 0;
	}
	
	public Integer visitVar_asignacion(Var_asignacionContext ctx){
		
		String nombre = ctx.NOMBRE().getText();
		String valor = ctx.var().getText();
		
		//System.out.println("nombre:"+ctx.NOMBRE().getText());
		//System.out.println("var:"+ctx.var().getText());
		//System.out.println(types.get(nombre));
		
		if ( types.get(nombre).equals("int") ) {
			try {
			    int numero = Integer.parseInt(valor);
			} catch (NumberFormatException e) {
			    System.out.println("Input cannot be parsed to Integer.");
			    System.exit(0);
			}
		} else {
			variables.remove(nombre);
		}
		
		variables.put(nombre,valor);

		return 0;
	}
	
	public Integer visitPrintln(PrintlnContext ctx){
		//String value = variables.values().toString();
		//System.out.println("variable print:"+ctx.var().getText());
		int valor = Integer.parseInt(variables.get(ctx.var().getText()));
		//System.out.println("valor"+value);
		//System.out.println(value.length());
		//String valuey = value.substring(1, value.length()-1);
		//int valor = Integer.parseInt(valuey);
		System.out.println(valor);
		return 0;
	}
	
	public Integer visitSuma(SumaContext ctx){
		
		String numero1 = ctx.NUMERO().get(0).toString();
		String numero2 = ctx.NUMERO().get(1).toString();
		
		int suma = Integer.parseInt(numero1)+Integer.parseInt(numero2);
		
		System.out.println(suma);
		
		return 0;
	}
	
public Integer visitSin(SinContext ctx){
		
		String valor = ctx.NUMERO().getText();
		
		float numero = Integer.parseInt(valor);
		
		System.out.println(Math.sin(numero) + "->using radian");
		
		return 0;
		
	}
	
public Integer visitCos(CosContext ctx){
	
	String valor = ctx.NUMERO().getText();
	
	float numero = Integer.parseInt(valor);
	
	System.out.println(Math.cos(numero) + "->using radian");
	
	return 0;
}
	

public Integer visitControl(ControlContext ctx){
	String variable_1 = ctx.condicion().getChild(0).getText();
	String condicion = ctx.condicion().getChild(1).getText();
	String variable_2 = ctx.condicion().getChild(2).getText();
	
	System.out.println("resultado-> " + ctx.statement().get(0).getText());
	
	//ctx.statement(0).println().PRINTLN();
	
	System.out.println(variables.get(variable_1));	
	System.out.println(variables.get(variable_2));
	
	System.out.println("typo definido:"+types.get(variable_1));
	System.out.println("typo definido:"+types.get(variable_2));
	
	/*
	 <Emerald>

	int x;
	x = 25;
	println(x);
	suma(2,5);
	cos(90);
	sin(90);	
	if ( x == 25 ){
		println(x);
		x = 2;
		println(x);
		cos(90);
	}

	 */
	// si esta declarado
	
	if(types.get(variable_1) == null) {
		System.out.println(variable_1 + "	->no definida");
		
		if(types.get(variable_2) == null) {
			if(Integer.parseInt(variable_1) == Integer.parseInt(variable_2)) {
				System.out.println(ctx.statement().size());
				int tamaño = ctx.statement().size();
				for (int x = 0 ;x < tamaño; x++) {
				//println(x);
				switch (ctx.statement().get(x).getText().split("\\(")[0]){
					case "println":
						visitPrintln(ctx.statement().get(x).println());
						continue;
					case "cos":
						visitCos(ctx.statement().get(x).cos());
						continue;
					case "sin":
						visitSin(ctx.statement().get(x).sin());
						continue;
					case "suma":
						visitSuma(ctx.statement().get(x).suma());
						continue;
				}
				switch (ctx.statement().get(x).getText().split(" ")[0]){
					case "int":
					case "bool":
					case "String":
						visitVar_declaracion(ctx.statement().get(x).var_declaracion());
						continue;
					}
				switch (ctx.statement().get(x).getText().split("=")[0]){
					default:
						visitVar_asignacion(ctx.statement().get(x).var_asignacion());
						continue;
					}
				}
				System.exit(0);
			} else {
				System.out.println("no son iguales");
			}
		} else {
			if(Integer.parseInt(variable_1) == Integer.parseInt(variables.get(variable_2))) {
				System.out.println(ctx.statement().size());
				int tamaño = ctx.statement().size();
				for (int x = 0 ;x < tamaño; x++) {
				//println(x);
				switch (ctx.statement().get(x).getText().split("\\(")[0]){
					case "println":
						visitPrintln(ctx.statement().get(x).println());
						continue;
					case "cos":
						visitCos(ctx.statement().get(x).cos());
						continue;
					case "sin":
						visitSin(ctx.statement().get(x).sin());
						continue;
					case "suma":
						visitSuma(ctx.statement().get(x).suma());
						continue;
				}
				switch (ctx.statement().get(x).getText().split(" ")[0]){
					case "int":
					case "bool":
					case "String":
						visitVar_declaracion(ctx.statement().get(x).var_declaracion());
						continue;
					}
				switch (ctx.statement().get(x).getText().split("=")[0]){
					default:
						visitVar_asignacion(ctx.statement().get(x).var_asignacion());
						continue;
					}
				}
				System.exit(0);
			} else {
				System.out.println("no son iguales");
			}
		}
		System.exit(0);
	} else {
		System.out.println("no esta vacia");
		if(types.get(variable_2) == null) {
			if(variables.get(variable_1) == null) {
				System.out.println("la variable" + variable_1 + "esta vacia");
			} else {
				System.out.println("no definida la variable 2");
				System.out.println("variable_1 "+Integer.parseInt(variables.get(variable_1)));
				System.out.println("variable_2 "+Integer.parseInt(variable_2));
				
				System.out.println("resultado-> " + ctx.statement().get(0).getText());
				
				if(Integer.parseInt(variables.get(variable_1)) == Integer.parseInt(variable_2) ) {
					System.out.println(ctx.statement().size());
					int tamaño = ctx.statement().size();
					for (int x = 0 ;x < tamaño; x++) {
					//println(x);
					switch (ctx.statement().get(x).getText().split("\\(")[0]){
						case "println":
							visitPrintln(ctx.statement().get(x).println());
							continue;
						case "cos":
							visitCos(ctx.statement().get(x).cos());
							continue;
						case "sin":
							visitSin(ctx.statement().get(x).sin());
							continue;
						case "suma":
							visitSuma(ctx.statement().get(x).suma());
							continue;
					}
					switch (ctx.statement().get(x).getText().split(" ")[0]){
						case "int":
						case "bool":
						case "String":
							visitVar_declaracion(ctx.statement().get(x).var_declaracion());
							continue;
						}
					switch (ctx.statement().get(x).getText().split("=")[0]){
						default:
							visitVar_asignacion(ctx.statement().get(x).var_asignacion());
							continue;
						}
					}
					System.exit(0);
				}
			}
		} else {
			//las dos son variables
			System.out.println("hola");
			
			if(types.get(variable_1) == null || types.get(variable_2) == null) {
				System.out.println("variable no definida");
			} else {
				if( Integer.parseInt(variables.get(variable_1)) == Integer.parseInt(variables.get(variable_2)) ) {
					System.out.println(ctx.statement().size());
					int tamaño = ctx.statement().size();
					for (int x = 0 ;x < tamaño; x++) {
					//println(x);
					switch (ctx.statement().get(x).getText().split("\\(")[0]){
						case "println":
							visitPrintln(ctx.statement().get(x).println());
							continue;
						case "cos":
							visitCos(ctx.statement().get(x).cos());
							continue;
						case "sin":
							visitSin(ctx.statement().get(x).sin());
							continue;
						case "suma":
							visitSuma(ctx.statement().get(x).suma());
							continue;
					}
					switch (ctx.statement().get(x).getText().split(" ")[0]){
						case "int":
						case "bool":
						case "String":
							visitVar_declaracion(ctx.statement().get(x).var_declaracion());
							continue;
						}
					switch (ctx.statement().get(x).getText().split("=")[0]){
						default:
							visitVar_asignacion(ctx.statement().get(x).var_asignacion());
							continue;
						}
					}
					System.exit(0);
				} else {
					System.out.println("no son iguales");
				}
				
			}
		}
	}
	return 0;
}
}
/*
public Integer visitStatement(StatementContext ctx) { 
	 Integer salida = 0;
	 
	 if(ctx.println() != null) {
		 salida = visitPrintln(ctx.println());
	 } /*else if(ctx.var_asignacion() != null) {
		 salida = visitVar_asignacion(ctx.var_asignacion());
	 }*/
	 /*0.
	 return salida; 
	 */
	 /*
	 if(ctx.assign()!=null) {
		 salida = visitAssign(ctx.assign());
	 }else if(ctx.add()!=null) {
		 salida = visitAdd(ctx.add());
	 }else if(ctx.print()!=null) {
		 salida = visitPrint(ctx.print());
	 }else if(ctx.if_block()!=null) {
		 salida = visitIf_block(ctx.if_block());
	 }else if(ctx.while_block()!=null){
		 salida = visitWhile_block(ctx.while_block());
	 }*/
	 /*
	 for(int indice = 0;indice<list.size();indice++)
	 {
		 if(list.get(indice).assign()!=null) {
			 salida = visitAssign(list.get(indice).assign());
		 }else if(list.get(indice).add()!=null) {
			 salida = visitAdd(list.get(indice).add());
		 }else if(list.get(indice).print()!=null) {
			 salida = visitPrint(list.get(indice).print());
		 }else if(list.get(indice).if_block()!=null) {
			 salida = visitIf_block(list.get(indice).if_block());
		 }
	 }*/
//	@Override
/*	public Integer visitAssign(AssignContext ctx){
        String id = ctx.ID().get(0).getText();        
        String value = "";        
        
        if (variables.containsKey(id))
            throw new IllegalArgumentException("Variable '" + id + "' ya fue declarada");
        else {
        	if (ctx.ID().size() > 1) {
        		value = ctx.ID(1).getText(); 
        	}else { 
            	//System.out.println(id+" en else ");//+ctx.BOOLEAN_().getText());    	   
            	if (ctx.BOOLEAN_()!=null) {
            		if(ctx.TRUE()!=null)
            			value = ctx.TRUE().getText();
            		else
            			value = ctx.FALSE().getText();            		
            	}else if(ctx.NUMBER()!=null){
            		value = ctx.NUMBER().getText();
            	}else{
            		value = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);          		
            	}
        	}
        	variables.put(id, value);
        }       
        
        return 0;
    }
	
	@Override
	public Integer visitPrint(PrintContext ctx){	        
	        String output = "";
	        if (ctx.ID() == null)
	        	output = ctx.NUMBER().getText(); 
	        else
	        	output = variables.get(ctx.ID().getText()).toString();
	        
	        System.out.println(output);
	        return 0;
	}
	 @Override
	 public Integer visitAdd(AddContext ctx) {
		 String variableName;
		 //variableName : variable a modificar en tabla de sim
		 //System.out.println(ctx.ID().size());
		if (ctx.ID().size() > 1) {
			variableName = ctx.ID(1).getText();
			//System.out.println(ctx.ID(1).getText());
		}else {
			variableName = ctx.ID(0).getText();
			//System.out.println(ctx.ID(0).getText());
		}		
		 
		 // value : variable con el valor a sumar a variable variableName    
	    int value=0;
	    if (ctx.ID().size() > 1) {
		    if (!variables.containsKey(ctx.ID(0).getText()))
	            throw new IllegalArgumentException("Variable '" + ctx.ID(0).getText() + "' has not ben declared");
			else {
				if (ctx.ID().size() > 1) {
					value = Integer.parseInt(variables.get(ctx.ID(0).getText()));
					//System.out.println(value);
				}else {
					value = Integer.parseInt(ctx.NUMBER().getText());
					//System.out.println(value);
				}   
			}
	    }
		if (!variables.containsKey(variableName))
            throw new IllegalArgumentException("Variable '" + variableName + "' has not ben declared");
		else
			variables.put(variableName, String.valueOf(Integer.parseInt(variables.get(variableName)) + value));	    	     
		return 0;
	 }
	 
	 @Override 
	 public Integer visitIf_block(ParserTestParser.If_blockContext ctx) { 
		 Integer salida = 0;
		 
		 salida = visitCondition_block(ctx.condition_block());	
		 if (salida == 1) {
			 salida = visitElse_block(ctx.else_block()); 
		 }
		 
		 return salida; 
	 }
	 
	 @Override
	 public Integer visitCondition_block(Condition_blockContext ctx) {
		//System.out.println("childcount en if:"+ctx.getChildCount());
		Integer salidaCondition = -1;
		Integer salidaStatement = -1;

		salidaCondition = visitOperation(ctx.operation());
		if(salidaCondition==0) {
			if(ctx.block()!=null)
				salidaStatement = visitBlock(ctx.block());
			else
				throw new IllegalArgumentException("IF sin statements");	
		}	
		return salidaCondition;
	 }
	 @Override 
	 public Integer visitElse_block(Else_blockContext ctx) { 
		 Integer salida = 0;
		 if(ctx.block()!=null)
			salida = visitBlock(ctx.block());
		 else
			throw new IllegalArgumentException("ELSE sin statements");
		 return salida; 
	 }
	 
	 @Override 
	 public Integer visitBlock(BlockContext ctx) { 
		 Integer salida =0;
		 //System.out.println("cant de statement"+ctx.getChildCount());

		 for(int indice = 0;indice<ctx.getChildCount();indice++)
		 {
			 salida= visitStatement(ctx.statement(indice));
		 }
		 
		 return salida; 
	 }
	 
	 
	 @Override 
	 public Integer visitOperation(OperationContext ctx) { 
		 String id1="";
		 String id2="";
		 String value1 ="";
		 String value2 ="";
		 Integer salida = -1;
		 
		 if(ctx.getChildCount()==1){
			 id1 = ctx.ID().getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else {
					value1 = variables.get(id1);
					if(value1.equals("true")) {
						 salida = 0;
					}else if (value1.equals("false")) {
					 	salida = 1;
					}else{ 
						 salida = Integer.valueOf(value1);
					}			 
			 }		 
		 }else {
			 id1 = ctx.getChild(0).getText();
			 id2 = ctx.getChild(2).getText();
			 if (!variables.containsKey(id1))
		            throw new IllegalArgumentException("Variable '" + id1 + "' has not ben declared");
			 else if (!variables.containsKey(id2))
		            throw new IllegalArgumentException("Variable '" + id2 + "' has not ben declared");
			 else {
				 value1 = variables.get(id1);
				 value2 = variables.get(id2);
				//System.out.println(value1+" "+value2);
				 if(ctx.EQUAL().getText().equals("==")){
					 if(value1 == value2) {
						 salida = 0;
					 }else {
						 salida = 1;
					 }
				 }
			 }
		 } 
		 return salida; 	 
	 }
	 
	 @Override 
	 public Integer visitWhile_block(While_blockContext ctx) { 
		 Integer salida=0;
		 while(salida==0) {
			 salida = visitCondition_block(ctx.condition_block());
		 }
		 
		 return salida; 	 
	 }

	 @Override 
	 public Integer visitStatement(StatementContext ctx) { 
		 Integer salida = 0;
		 
		 
		 if(ctx.assign()!=null) {
			 salida = visitAssign(ctx.assign());
		 }else if(ctx.add()!=null) {
			 salida = visitAdd(ctx.add());
		 }else if(ctx.print()!=null) {
			 salida = visitPrint(ctx.print());
		 }else if(ctx.if_block()!=null) {
			 salida = visitIf_block(ctx.if_block());
		 }else if(ctx.while_block()!=null){
			 salida = visitWhile_block(ctx.while_block());
		 }
		 
		 for(int indice = 0;indice<list.size();indice++)
		 {
			 if(list.get(indice).assign()!=null) {
				 salida = visitAssign(list.get(indice).assign());
			 }else if(list.get(indice).add()!=null) {
				 salida = visitAdd(list.get(indice).add());
			 }else if(list.get(indice).print()!=null) {
				 salida = visitPrint(list.get(indice).print());
			 }else if(list.get(indice).if_block()!=null) {
				 salida = visitIf_block(list.get(indice).if_block());
			 }
		 }
		
	return salida; 
	 }
}*/
