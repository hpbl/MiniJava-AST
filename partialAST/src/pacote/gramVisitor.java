// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/partialAST/src/pacote/gram.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(gramParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(gramParser.IdentifierContext ctx);
}