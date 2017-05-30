package visitor;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;
import symboltable.SymbolTable;
import symboltable.Class;
import symboltable.Method;
import symboltable.Variable;

public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;
	private Class currClass;
	private Method currMethod;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		String identificador = n.i1.toString();
		this.currClass = symbolTable.getClass(identificador);

		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		this.currClass = symbolTable.getClass(n.i.toString());

		n.i.accept(this);

		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		this.currClass = this.symbolTable.getClass(n.i.toString());

		if (this.currClass.parent() != n.j.s) {
			System.out.println("Extensão de classe errada");
		}

		n.i.accept(this);
		n.j.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		n.t.accept(this);

		String identificador = n.i.toString();
		this.currMethod = this.currClass.getMethod(identificador);
		Type tipoMetodo = this.currMethod.type();

		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		if (!(this.symbolTable.compareTypes(n.e.accept(this), tipoMetodo))) {
			//Erro
			System.out.println("O retorno do método " + this.currMethod.getId() + " é do tipo errado");
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return new IntArrayType();
	}

	public Type visit(BooleanType n) {
		return new BooleanType();
	}

	public Type visit(IntegerType n) {
		return new IntegerType();
	}

	// String s;
	public Type visit(IdentifierType n) {
		return new IdentifierType(n.s);
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if (!(n.e.accept(this) instanceof BooleanType)) {
			//Erro:
			System.out.println("A condição do if deve ser do tipo Boolean");
		}

		n.s1.accept(this);
		n.s2.accept(this);
		return new BooleanType();
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		if (!(n.e.accept(this) instanceof BooleanType)) {
			//Erro:
			System.out.print("A condição do while deve ser do tipo Boolean");
		}

		n.s.accept(this);
		return new BooleanType();
	}

	// Exp e;
	public Type visit(Print n) {
		if (!(n.e.accept(this) instanceof IntegerType)) {
			//Erro:
			System.out.println("Prints devem imprimir inteiros");
		}
		return new IntegerType();
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type tipo1 = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.s);
		Type tipo2 = n.e.accept(this);

		if (!(this.symbolTable.compareTypes(tipo1, tipo2))) {
			System.out.println("A variável e o valor atribuído são de tipos diferentes");
		}

		n.i.accept(this);

		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		Type tipo = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.s);

		if (!(tipo instanceof IntArrayType)) {
			//Erro
			System.out.print("O array deve ser de inteiros");
		}

		if (!(n.e1.accept(this) instanceof IntegerType)) {
			//Erro
			System.out.println("O indice do arrat deve ser um inteiro");
		}

		if (!(n.e2.accept(this) instanceof IntegerType)) {
			//Erro
			System.out.println("O array só armazena inteiros");
		}

		n.i.accept(this);

		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {

		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof BooleanType)) {
			//primeiro elemento não é Boolean (Erro)
			System.out.println("o elemento da esquerda não é Boolean");
		}
		if (!(t2 instanceof BooleanType)) {
			//segundo elemento não é Boolean (Erro)
			System.out.println("o elemento da direita não é Boolean");
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType)) {
			//primeiro elemento não é inteiro (Erro)
			System.out.println("o elemento da esquerda não é inteiro");
		}
		if (!(t2 instanceof IntegerType)) {
			System.out.println("o elemento da direita não é inteiro");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da esquerda não é inteiro");
		}
		if (!(t2 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da direita não é inteiro");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da esquerda não é inteiro");
		}
		if (!(t2 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da direita não é inteiro");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);

		if (!(t1 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da esquerda não é inteiro");
		}
		if (!(t2 instanceof IntegerType)) {
			//Erro:
			System.out.println("o elemento da direita não é inteiro");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		Type tipoArray = n.e1.accept(this);
		Type tipoIndice = n.e2.accept(this);

		if (!(tipoArray instanceof IntArrayType)) {
			//Erro
			System.out.println("array deve ser de inteiros");
		}

		if (!(tipoIndice instanceof IntegerType)) {
			//Erro
			System.out.println("Índice de array deve ser um inteiro");
		}

		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		Type tipo = n.e.accept(this);

		if (!(tipo instanceof IntArrayType)) {
			//Erro:
			System.out.println("length deve ser usado num array de inteiros");
		}

		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		String idMetodo = n.i.s;
		Type tipoObj = n.e.accept(this);

		if (!(tipoObj instanceof IdentifierType)) {
			//Erro:
			System.out.println("Método " + idMetodo + " chamado por objeto que não o define");
		}

		String idObj = ((IdentifierType) tipoObj).s;

		Method metodo = this.symbolTable.getMethod(idMetodo, idObj);


		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			Type t1 = null;
			Type t2 = null;

			if (metodo.getParamAt(i) != null) {
				t1 = metodo.getParamAt(i).type();
				t2 = n.el.elementAt(i).accept(this);
			}
			if (!(this.symbolTable.compareTypes(t1, t2))) {
				//Erro:
				System.out.println("Argumentos passados com tipo errado para " + idMetodo);
			}

		}
		return metodo.type();
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		Type tipo = this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);

		return tipo;
	}

	public Type visit(This n) {
		return this.currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		Type tipo = n.e.accept(this);

		if (!(tipo instanceof IntegerType)) {
			//Erro:
			System.out.println("Arrays devem ser de inteiros");
		}

		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {

		/*String identificador = n.i.toString();
		Class classe = this.symbolTable.getClass(identificador);

		if (classe == null) {
			//Erro
			System.out.println("Tipo não definido");
		}*/

		return new IdentifierType(n.i.s);
		//return classe.type();
	}

	// Exp e;
	public Type visit(Not n) {
		Type tipo = n.e.accept(this);

		if (!(tipo instanceof  BooleanType)) {
			//Erro
			System.out.println("O elemento não é um boolean");
		}

		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return null;
	}
}
