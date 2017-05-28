// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/MiniJavaAST/src/pacote/hpbl_rfl3.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hpbl_rfl3Parser}.
 */
public interface hpbl_rfl3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(hpbl_rfl3Parser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(hpbl_rfl3Parser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(hpbl_rfl3Parser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(hpbl_rfl3Parser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(hpbl_rfl3Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(hpbl_rfl3Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(hpbl_rfl3Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(hpbl_rfl3Parser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(hpbl_rfl3Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(hpbl_rfl3Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(hpbl_rfl3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(hpbl_rfl3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(hpbl_rfl3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(hpbl_rfl3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(hpbl_rfl3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(hpbl_rfl3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hpbl_rfl3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(hpbl_rfl3Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link hpbl_rfl3Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(hpbl_rfl3Parser.IdentifierContext ctx);
}