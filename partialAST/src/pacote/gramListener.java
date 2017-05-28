// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/partialAST/src/pacote/gram.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(gramParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(gramParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(gramParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(gramParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(gramParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(gramParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(gramParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(gramParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(gramParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(gramParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gramParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gramParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(gramParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(gramParser.IdentifierContext ctx);
}