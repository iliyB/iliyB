// Generated from C:/Users/iliy-/IntelliJIDEAProjects/Hello/src\Hello.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#programm}.
	 * @param ctx the parse tree
	 */
	void enterProgramm(HelloParser.ProgrammContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#programm}.
	 * @param ctx the parse tree
	 */
	void exitProgramm(HelloParser.ProgrammContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(HelloParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(HelloParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(HelloParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(HelloParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(HelloParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(HelloParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#consts}.
	 * @param ctx the parse tree
	 */
	void enterConsts(HelloParser.ConstsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#consts}.
	 * @param ctx the parse tree
	 */
	void exitConsts(HelloParser.ConstsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#region}.
	 * @param ctx the parse tree
	 */
	void enterRegion(HelloParser.RegionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#region}.
	 * @param ctx the parse tree
	 */
	void exitRegion(HelloParser.RegionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(HelloParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(HelloParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HelloParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HelloParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(HelloParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(HelloParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(HelloParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(HelloParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HelloParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HelloParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(HelloParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(HelloParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#continue_}.
	 * @param ctx the parse tree
	 */
	void enterContinue_(HelloParser.Continue_Context ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#continue_}.
	 * @param ctx the parse tree
	 */
	void exitContinue_(HelloParser.Continue_Context ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HelloParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void enterTerm_cond(HelloParser.Term_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term_cond}.
	 * @param ctx the parse tree
	 */
	void exitTerm_cond(HelloParser.Term_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void enterFactor_cond(HelloParser.Factor_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor_cond}.
	 * @param ctx the parse tree
	 */
	void exitFactor_cond(HelloParser.Factor_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
}