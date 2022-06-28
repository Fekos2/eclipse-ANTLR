package ANTLR;
// Generated from ParserT.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserTParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ParserTParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons(ParserTParser.ConsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParserTParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#operadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadores(ParserTParser.OperadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ParserTParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#paso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaso(ParserTParser.PasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_asignacion(ParserTParser.Var_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#var_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaracion(ParserTParser.Var_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cons_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCons_declaration(ParserTParser.Cons_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(ParserTParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#scan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScan(ParserTParser.ScanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#repetir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepetir(ParserTParser.RepetirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(ParserTParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(ParserTParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#sin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(ParserTParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#cos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(ParserTParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserTParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(ParserTParser.ControlContext ctx);
}