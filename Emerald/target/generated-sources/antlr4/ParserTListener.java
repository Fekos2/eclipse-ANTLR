// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserTParser}.
 */
public interface ParserTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserTParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ParserTParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ParserTParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#cons}.
	 * @param ctx the parse tree
	 */
	void enterCons(ParserTParser.ConsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#cons}.
	 * @param ctx the parse tree
	 */
	void exitCons(ParserTParser.ConsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParserTParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParserTParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#operadores}.
	 * @param ctx the parse tree
	 */
	void enterOperadores(ParserTParser.OperadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#operadores}.
	 * @param ctx the parse tree
	 */
	void exitOperadores(ParserTParser.OperadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(ParserTParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(ParserTParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#paso}.
	 * @param ctx the parse tree
	 */
	void enterPaso(ParserTParser.PasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#paso}.
	 * @param ctx the parse tree
	 */
	void exitPaso(ParserTParser.PasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVar_asignacion(ParserTParser.Var_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#var_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVar_asignacion(ParserTParser.Var_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#var_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaracion(ParserTParser.Var_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#var_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaracion(ParserTParser.Var_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#cons_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCons_declaration(ParserTParser.Cons_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#cons_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCons_declaration(ParserTParser.Cons_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ParserTParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ParserTParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#scan}.
	 * @param ctx the parse tree
	 */
	void enterScan(ParserTParser.ScanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#scan}.
	 * @param ctx the parse tree
	 */
	void exitScan(ParserTParser.ScanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#repetir}.
	 * @param ctx the parse tree
	 */
	void enterRepetir(ParserTParser.RepetirContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#repetir}.
	 * @param ctx the parse tree
	 */
	void exitRepetir(ParserTParser.RepetirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(ParserTParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(ParserTParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(ParserTParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 */
	void enterSin(ParserTParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 */
	void exitSin(ParserTParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(ParserTParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(ParserTParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserTParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(ParserTParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserTParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(ParserTParser.ControlContext ctx);
}