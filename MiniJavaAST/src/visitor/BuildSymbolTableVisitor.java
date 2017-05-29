package visitor;

import ast.*;
import symboltable.SymbolTable;
import symboltable.Class;
import symboltable.Method;
import symboltable.Variable;

public class BuildSymbolTableVisitor implements Visitor {

	SymbolTable symbolTable;

	public BuildSymbolTableVisitor() {
		symbolTable = new SymbolTable();
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	private Class currClass;
	private Method currMethod;

	// MainClass m;
	// ClassDeclList cl;
	public void visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {

			n.cl.elementAt(i).accept(this);

		}
	}

	// Identifier i1,i2;
	// Statement s;
	public void visit(MainClass n) {

		String identificador = n.i1.toString();

		this.symbolTable.addClass(identificador, "quem é o pai?");

		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclSimple n) {
		String identificador = n.i.toString();

		if (this.currClass == null) {

			if (this.symbolTable.getClass(identificador) == null) {
				this.currClass = new Class(identificador, "quem é o pai?");

				if (this.symbolTable.addClass(identificador, "quem é o pai?")) {
					n.i.accept(this);
					for (int i = 0; i < n.vl.size(); i++) {
						n.vl.elementAt(i).accept(this);
					}
					for (int i = 0; i < n.ml.size(); i++) {
						n.ml.elementAt(i).accept(this);
					}
				}
			} else {
				// classe duplicada
			}
			this.currClass = null;
		}
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclExtends n) {
		String identificador = n.i.toString();

		if (this.currClass == null) {

			if (this.symbolTable.getClass(identificador) == null) {
				this.currClass = new Class(identificador, "quem é o pai?");

				if (this.symbolTable.addClass(identificador, "quem é?")) {
					n.i.accept(this);
					n.j.accept(this);
					for (int i = 0; i < n.vl.size(); i++) {
						n.vl.elementAt(i).accept(this);
					}
					for (int i = 0; i < n.ml.size(); i++) {
						n.ml.elementAt(i).accept(this);
					}
				}
			} else {
				// classe duplicada
			}
			this.currClass = null;
		}
	}

	// Type t;
	// Identifier i;
	public void visit(VarDecl n) {

		Type tipo = n.t;
		String identificador = n.i.toString();

		if (this.currMethod == null) {
			if (!this.currClass.addVar(identificador, tipo)) {
				// variável já foi definida na classe (erro)
			}
		} else if (!this.currMethod.addVar(identificador, tipo)) {
			// variável já foi definida no método (erro)
		}

		n.t.accept(this);
		n.i.accept(this);
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public void visit(MethodDecl n) {

		String identificador = n.i.toString();
		this.currMethod = this.currClass.getMethod(identificador);

		if (this.currMethod == null) {
			this.currMethod = new Method(identificador, n.t);

			this.currClass.addMethod(identificador, n.t);

			n.t.accept(this);
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
			n.e.accept(this);

		} else {
			// o método já foi definido na classe (erro)
		}

		this.currMethod = null;
	}

	// Type t;
	// Identifier i;
	public void visit(Formal n) {

		if (!this.currMethod.addParam(n.i.toString(), n.t)) {
			//o parametro já existe no método
		}

		n.t.accept(this);
		n.i.accept(this);
	}

	public void visit(IntArrayType n) {
	}

	public void visit(BooleanType n) {
	}

	public void visit(IntegerType n) {
	}

	// String s;
	public void visit(IdentifierType n) {
	}

	// StatementList sl;
	public void visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
	}

	// Exp e;
	// Statement s1,s2;
	public void visit(If n) {
		n.e.accept(this);
		n.s1.accept(this);
		n.s2.accept(this);
	}

	// Exp e;
	// Statement s;
	public void visit(While n) {
		n.e.accept(this);
		n.s.accept(this);
	}

	// Exp e;
	public void visit(Print n) {
		n.e.accept(this);
	}

	// Identifier i;
	// Exp e;
	public void visit(Assign n) {
		n.i.accept(this);
		n.e.accept(this);
	}

	// Identifier i;
	// Exp e1,e2;
	public void visit(ArrayAssign n) {
		n.i.accept(this);
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(And n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(LessThan n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Plus n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Minus n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Times n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(ArrayLookup n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e;
	public void visit(ArrayLength n) {
		n.e.accept(this);
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public void visit(Call n) {
		n.e.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
	}

	// int i;
	public void visit(IntegerLiteral n) {
	}

	public void visit(True n) {
	}

	public void visit(False n) {
	}

	// String s;
	public void visit(IdentifierExp n) {
	}

	public void visit(This n) {
	}

	// Exp e;
	public void visit(NewArray n) {
		n.e.accept(this);
	}

	// Identifier i;
	public void visit(NewObject n) {
	}

	// Exp e;
	public void visit(Not n) {
		n.e.accept(this);
	}

	// String s;
	public void visit(Identifier n) {
	}
}
