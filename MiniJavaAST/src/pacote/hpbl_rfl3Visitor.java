// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/MiniJavaAST/src/pacote/hpbl_rfl3.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hpbl_rfl3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hpbl_rfl3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(hpbl_rfl3Parser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(hpbl_rfl3Parser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(hpbl_rfl3Parser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(hpbl_rfl3Parser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(hpbl_rfl3Parser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(hpbl_rfl3Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(hpbl_rfl3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(hpbl_rfl3Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hpbl_rfl3Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(hpbl_rfl3Parser.IdentifierContext ctx);
}