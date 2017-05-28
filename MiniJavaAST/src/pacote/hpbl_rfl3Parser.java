// Generated from /Users/Pintor/Documents/CIn/7/Compiladores/MiniJava-AST/MiniJavaAST/src/pacote/hpbl_rfl3.g4 by ANTLR 4.7
package pacote;

import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hpbl_rfl3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, INTEGER_LITERAL=36, IDENTIFIER=37, 
		WS=38, BLOCKCOMMENT=39, LINECOMMENT=40;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_identifier = 8;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"INTEGER_LITERAL", "IDENTIFIER", "WS", "BLOCKCOMMENT", "LINECOMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "hpbl_rfl3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hpbl_rfl3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public Program programa;
		public MainClassContext mc1;
		public ClassDeclarationContext cd1;
		public TerminalNode EOF() { return getToken(hpbl_rfl3Parser.EOF, 0); }
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			ClassDeclList cdl1 = new ClassDeclList();
			setState(19);
			((GoalContext)_localctx).mc1 = mainClass();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(20);
				((GoalContext)_localctx).cd1 = classDeclaration();

				                            if (((GoalContext)_localctx).cd1 != null) {
				                                cdl1.addElement(((GoalContext)_localctx).cd1.declClasse);
				                            }
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
			((GoalContext)_localctx).programa =  new Program(((GoalContext)_localctx).mc1.classeMain, cdl1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainClassContext extends ParserRuleContext {
		public MainClass classeMain;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public StatementContext s1;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			((MainClassContext)_localctx).id1 = identifier();
			setState(33);
			match(T__1);
			setState(34);
			match(T__2);
			setState(35);
			match(T__3);
			setState(36);
			match(T__4);
			setState(37);
			match(T__5);
			setState(38);
			match(T__6);
			setState(39);
			match(T__7);
			setState(40);
			match(T__8);
			setState(41);
			match(T__9);
			setState(42);
			((MainClassContext)_localctx).id2 = identifier();
			setState(43);
			match(T__10);
			setState(44);
			match(T__1);
			setState(45);
			((MainClassContext)_localctx).s1 = statement();
			setState(46);
			match(T__11);
			setState(47);
			match(T__11);
			Identifier idtf1 = new Identifier(((MainClassContext)_localctx).id1.getText());
			                Identifier idtf2 = new Identifier(((MainClassContext)_localctx).id2.getText());

			                ((MainClassContext)_localctx).classeMain =  new MainClass(idtf1, idtf2, ((MainClassContext)_localctx).s1.declaracao);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDecl declClasse;
		public IdentifierContext id1;
		public IdentifierContext id2;
		public VarDeclarationContext vd1;
		public MethodDeclarationContext md1;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			VarDeclList vl1 = new VarDeclList();
			                MethodDeclList ml1 = new MethodDeclList();
			setState(51);
			match(T__0);
			setState(52);
			((ClassDeclarationContext)_localctx).id1 = identifier();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(53);
				match(T__12);
				setState(54);
				((ClassDeclarationContext)_localctx).id2 = identifier();
				}
			}

			setState(57);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(58);
				((ClassDeclarationContext)_localctx).vd1 = varDeclaration();

				                                                                                           if (((ClassDeclarationContext)_localctx).vd1 != null) {
				                                                                                            vl1.addElement(((ClassDeclarationContext)_localctx).vd1.declVariavel);
				                                                                                           }
				                                                                                           
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(66);
				((ClassDeclarationContext)_localctx).md1 = methodDeclaration();

				                                                                                                           if (((ClassDeclarationContext)_localctx).md1 != null) {
				                                                                                                               ml1.addElement(((ClassDeclarationContext)_localctx).md1.declMetodo);
				                                                                                                           }
				                                                                                           
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__11);
			Identifier idtf1 = new Identifier(((ClassDeclarationContext)_localctx).id1.getText());


			                if (((ClassDeclarationContext)_localctx).id2 != null) {
			                    Identifier idtf2 = new Identifier(((ClassDeclarationContext)_localctx).id2.getText());
			                    ((ClassDeclarationContext)_localctx).declClasse =  new ClassDeclExtends(idtf1, idtf2, vl1, ml1);

			                } else {
			                    ((ClassDeclarationContext)_localctx).declClasse =  new ClassDeclSimple(idtf1, vl1, ml1);
			                }

			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDecl declVariavel;
		public TypeContext tp;
		public IdentifierContext id;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			((VarDeclarationContext)_localctx).tp = type();
			setState(78);
			((VarDeclarationContext)_localctx).id = identifier();
			setState(79);
			match(T__13);
			Identifier idtf = new Identifier(((VarDeclarationContext)_localctx).id.getText());
			                ((VarDeclarationContext)_localctx).declVariavel =  new VarDecl(((VarDeclarationContext)_localctx).tp.tipo, idtf);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDecl declMetodo;
		public TypeContext tp1;
		public IdentifierContext id1;
		public TypeContext tp2;
		public IdentifierContext id2;
		public TypeContext tp3;
		public IdentifierContext id3;
		public VarDeclarationContext vd1;
		public StatementContext st1;
		public ExpressionContext e1;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			FormalList fl1 = new FormalList();
			                VarDeclList vl1 = new VarDeclList();
			                StatementList sl1 = new StatementList();
			setState(83);
			match(T__2);
			setState(84);
			((MethodDeclarationContext)_localctx).tp1 = type();
			setState(85);
			((MethodDeclarationContext)_localctx).id1 = identifier();
			setState(86);
			match(T__6);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(87);
				((MethodDeclarationContext)_localctx).tp2 = type();
				setState(88);
				((MethodDeclarationContext)_localctx).id2 = identifier();

				                                                                            if (((MethodDeclarationContext)_localctx).id2 != null) {
				                                                                                Identifier idtf2 = new Identifier(((MethodDeclarationContext)_localctx).id2.getText());
				                                                                                Formal f1 = new Formal(((MethodDeclarationContext)_localctx).tp2.tipo, idtf2);
				                                                                                fl1.addElement(f1);
				                                                                                }
				                                                                            
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(90);
					match(T__14);
					setState(91);
					((MethodDeclarationContext)_localctx).tp3 = type();
					setState(92);
					((MethodDeclarationContext)_localctx).id3 = identifier();

					                                                                                if (((MethodDeclarationContext)_localctx).id2 != null) {
					                                                                                    Identifier idtf2 = new Identifier(((MethodDeclarationContext)_localctx).id2.getText());
					                                                                                    Formal f1 = new Formal(((MethodDeclarationContext)_localctx).tp2.tipo, idtf2);
					                                                                                    fl1.addElement(f1);
					                                                                                }
					                                                                            
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(T__10);
			setState(103);
			match(T__1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					((MethodDeclarationContext)_localctx).vd1 = varDeclaration();

					                                                                                                vl1.addElement(((MethodDeclarationContext)_localctx).vd1.declVariavel);
					                                                                                            
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(112);
				((MethodDeclarationContext)_localctx).st1 = statement();

				                                                                                                sl1.addElement(((MethodDeclarationContext)_localctx).st1.declaracao);
				                                                                                             
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__15);
			setState(121);
			((MethodDeclarationContext)_localctx).e1 = expression(0);
			setState(122);
			match(T__13);
			setState(123);
			match(T__11);
			Identifier idtf1 = new Identifier(((MethodDeclarationContext)_localctx).id1.getText());

			                ((MethodDeclarationContext)_localctx).declMetodo =  new MethodDecl(((MethodDeclarationContext)_localctx).tp1.tipo, idtf1, fl1, vl1, sl1, ((MethodDeclarationContext)_localctx).e1.expressao);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type tipo;
		public IdentifierContext id;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__16);
				setState(127);
				match(T__8);
				setState(128);
				match(T__9);
				((TypeContext)_localctx).tipo =  new IntArrayType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__17);
				((TypeContext)_localctx).tipo =  new BooleanType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__16);
				((TypeContext)_localctx).tipo =  new IntegerType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				((TypeContext)_localctx).id = identifier();
				((TypeContext)_localctx).tipo =  new IdentifierType(((TypeContext)_localctx).id.getText());
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement declaracao;
		public StatementContext stmt;
		public ExpressionContext exp;
		public StatementContext s1;
		public StatementContext s2;
		public StatementContext blck;
		public IdentifierContext id;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				StatementList list = new StatementList();
				setState(140);
				match(T__1);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(141);
					((StatementContext)_localctx).stmt = statement();
					list.addElement(((StatementContext)_localctx).stmt.declaracao);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__11);
				((StatementContext)_localctx).declaracao =  new Block(list);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__18);
				setState(152);
				match(T__6);
				setState(153);
				((StatementContext)_localctx).exp = expression(0);
				setState(154);
				match(T__10);
				setState(155);
				((StatementContext)_localctx).s1 = statement();
				setState(156);
				match(T__19);
				setState(157);
				((StatementContext)_localctx).s2 = statement();
				((StatementContext)_localctx).declaracao =  new If(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).s1.declaracao, ((StatementContext)_localctx).s2.declaracao);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__20);
				setState(161);
				match(T__6);
				setState(162);
				((StatementContext)_localctx).exp = expression(0);
				setState(163);
				match(T__10);
				setState(164);
				((StatementContext)_localctx).blck = statement();
				((StatementContext)_localctx).declaracao =  new While(((StatementContext)_localctx).exp.expressao, ((StatementContext)_localctx).blck.declaracao);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(T__21);
				setState(168);
				match(T__6);
				setState(169);
				((StatementContext)_localctx).exp = expression(0);
				setState(170);
				match(T__10);
				setState(171);
				match(T__13);
				((StatementContext)_localctx).declaracao =  new Print(((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				((StatementContext)_localctx).id = identifier();
				setState(175);
				match(T__22);
				setState(176);
				((StatementContext)_localctx).exp = expression(0);
				setState(177);
				match(T__13);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new Assign(idtf, ((StatementContext)_localctx).exp.expressao);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				((StatementContext)_localctx).id = identifier();
				setState(181);
				match(T__8);
				setState(182);
				((StatementContext)_localctx).e1 = expression(0);
				setState(183);
				match(T__9);
				setState(184);
				match(T__22);
				setState(185);
				((StatementContext)_localctx).e2 = expression(0);
				setState(186);
				match(T__13);
				Identifier idtf = new Identifier(((StatementContext)_localctx).id.getText());
				                ((StatementContext)_localctx).declaracao =  new ArrayAssign(idtf, ((StatementContext)_localctx).e1.expressao, ((StatementContext)_localctx).e2.expressao);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Exp expressao;
		public ExpressionContext e1;
		public Token integer;
		public IdentifierContext id;
		public ExpressionContext exp;
		public Token op;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode INTEGER_LITERAL() { return getToken(hpbl_rfl3Parser.INTEGER_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(192);
				((ExpressionContext)_localctx).integer = match(INTEGER_LITERAL);
				((ExpressionContext)_localctx).expressao =  new IntegerLiteral(Integer.parseInt(((ExpressionContext)_localctx).integer.getText()));
				}
				break;
			case 2:
				{
				setState(194);
				match(T__30);
				((ExpressionContext)_localctx).expressao =  new True();
				}
				break;
			case 3:
				{
				setState(196);
				match(T__31);
				((ExpressionContext)_localctx).expressao =  new False();
				}
				break;
			case 4:
				{
				setState(198);
				((ExpressionContext)_localctx).id = identifier();
				((ExpressionContext)_localctx).expressao =  new IdentifierExp(((ExpressionContext)_localctx).id.getText());
				}
				break;
			case 5:
				{
				setState(201);
				match(T__32);
				((ExpressionContext)_localctx).expressao =  new This();
				}
				break;
			case 6:
				{
				setState(203);
				match(T__33);
				setState(204);
				match(T__16);
				setState(205);
				match(T__8);
				setState(206);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(207);
				match(T__9);
				((ExpressionContext)_localctx).expressao =  new NewArray(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 7:
				{
				setState(210);
				match(T__33);
				setState(211);
				((ExpressionContext)_localctx).id = identifier();
				setState(212);
				match(T__6);
				setState(213);
				match(T__10);
				((ExpressionContext)_localctx).expressao =  new NewObject(new Identifier(((ExpressionContext)_localctx).id.getText()));
				}
				break;
			case 8:
				{
				setState(216);
				match(T__34);
				setState(217);
				((ExpressionContext)_localctx).exp = expression(2);
				((ExpressionContext)_localctx).expressao =  new Not(((ExpressionContext)_localctx).exp.expressao);
				}
				break;
			case 9:
				{
				setState(220);
				match(T__6);
				setState(221);
				((ExpressionContext)_localctx).exp = expression(0);
				setState(222);
				match(T__10);
				/* descobrir o que é isso */
				                ((ExpressionContext)_localctx).expressao =  ((ExpressionContext)_localctx).exp.expressao;
				                
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(228);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						((ExpressionContext)_localctx).e2 = expression(14);
						switch (((ExpressionContext)_localctx).op.getText()) {
						                              case "&&":  ((ExpressionContext)_localctx).expressao =  new And(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "<":   ((ExpressionContext)_localctx).expressao =  new LessThan(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "+":   ((ExpressionContext)_localctx).expressao =  new Plus(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "-":   ((ExpressionContext)_localctx).expressao =  new Minus(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;

						                              case "*":   ((ExpressionContext)_localctx).expressao =  new Times(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						                                          break;
						                          }
						                          
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(233);
						match(T__8);
						setState(234);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(235);
						match(T__9);
						((ExpressionContext)_localctx).expressao =  new ArrayLookup(((ExpressionContext)_localctx).e1.expressao, ((ExpressionContext)_localctx).e2.expressao);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(239);
						match(T__28);
						setState(240);
						match(T__29);
						((ExpressionContext)_localctx).expressao =  new ArrayLength(((ExpressionContext)_localctx).e1.expressao);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(243);
						match(T__28);
						setState(244);
						((ExpressionContext)_localctx).id = identifier();
						ExpList expList = new ExpList();
						setState(246);
						match(T__6);
						setState(258);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << INTEGER_LITERAL) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(247);
							((ExpressionContext)_localctx).e2 = expression(0);
							if (((ExpressionContext)_localctx).e2 != null) {
							                                                                              expList.addElement(((ExpressionContext)_localctx).e2.expressao);
							                                                                           }
							setState(255);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(249);
								match(T__14);
								setState(250);
								((ExpressionContext)_localctx).e3 = expression(0);
								if (((ExpressionContext)_localctx).e3 != null) {
								                                                                                                  expList.addElement(((ExpressionContext)_localctx).e3.expressao);
								                                                                                                }
								}
								}
								setState(257);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(260);
						match(T__10);
						Identifier idtf = new Identifier(((ExpressionContext)_localctx).id.getText());
						                           ((ExpressionContext)_localctx).expressao =  new Call(((ExpressionContext)_localctx).e1.expressao, idtf, expList);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(hpbl_rfl3Parser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hpbl_rfl3Listener ) ((hpbl_rfl3Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hpbl_rfl3Visitor ) return ((hpbl_rfl3Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\3\4\3\4"+
		"\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6b\n\6\f\6\16\6e\13\6\5\6g\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\3\6\3\6\7\6v\n\6\f"+
		"\6\16\6y\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u008c\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u0093\n\b\f\b\16\b"+
		"\u0096\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c0\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e4\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u0100\n\t\f\t\16\t\u0103\13\t\5\t\u0105\n\t\3"+
		"\t\3\t\3\t\7\t\u010a\n\t\f\t\16\t\u010d\13\t\3\n\3\n\3\n\2\3\20\13\2\4"+
		"\6\b\n\f\16\20\22\2\3\3\2\32\36\2\u0126\2\24\3\2\2\2\4!\3\2\2\2\6\64\3"+
		"\2\2\2\bO\3\2\2\2\nT\3\2\2\2\f\u008b\3\2\2\2\16\u00bf\3\2\2\2\20\u00e3"+
		"\3\2\2\2\22\u010e\3\2\2\2\24\25\b\2\1\2\25\33\5\4\3\2\26\27\5\6\4\2\27"+
		"\30\b\2\1\2\30\32\3\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33"+
		"\34\3\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36\37\7\2\2\3\37 \b\2\1\2 \3\3"+
		"\2\2\2!\"\7\3\2\2\"#\5\22\n\2#$\7\4\2\2$%\7\5\2\2%&\7\6\2\2&\'\7\7\2\2"+
		"\'(\7\b\2\2()\7\t\2\2)*\7\n\2\2*+\7\13\2\2+,\7\f\2\2,-\5\22\n\2-.\7\r"+
		"\2\2./\7\4\2\2/\60\5\16\b\2\60\61\7\16\2\2\61\62\7\16\2\2\62\63\b\3\1"+
		"\2\63\5\3\2\2\2\64\65\b\4\1\2\65\66\7\3\2\2\669\5\22\n\2\678\7\17\2\2"+
		"8:\5\22\n\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;A\7\4\2\2<=\5\b\5\2=>\b\4"+
		"\1\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BI\3\2\2\2CA\3\2"+
		"\2\2DE\5\n\6\2EF\b\4\1\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KI\3\2\2\2LM\7\16\2\2MN\b\4\1\2N\7\3\2\2\2OP\5\f\7\2PQ\5"+
		"\22\n\2QR\7\20\2\2RS\b\5\1\2S\t\3\2\2\2TU\b\6\1\2UV\7\5\2\2VW\5\f\7\2"+
		"WX\5\22\n\2Xf\7\t\2\2YZ\5\f\7\2Z[\5\22\n\2[c\b\6\1\2\\]\7\21\2\2]^\5\f"+
		"\7\2^_\5\22\n\2_`\b\6\1\2`b\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2dg\3\2\2\2ec\3\2\2\2fY\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\r\2\2io\7"+
		"\4\2\2jk\5\b\5\2kl\b\6\1\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pw\3\2\2\2qo\3\2\2\2rs\5\16\b\2st\b\6\1\2tv\3\2\2\2ur\3\2\2\2vy"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\22\2\2{|\5\20\t\2"+
		"|}\7\20\2\2}~\7\16\2\2~\177\b\6\1\2\177\13\3\2\2\2\u0080\u0081\7\23\2"+
		"\2\u0081\u0082\7\13\2\2\u0082\u0083\7\f\2\2\u0083\u008c\b\7\1\2\u0084"+
		"\u0085\7\24\2\2\u0085\u008c\b\7\1\2\u0086\u0087\7\23\2\2\u0087\u008c\b"+
		"\7\1\2\u0088\u0089\5\22\n\2\u0089\u008a\b\7\1\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0080\3\2\2\2\u008b\u0084\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0088\3\2"+
		"\2\2\u008c\r\3\2\2\2\u008d\u008e\b\b\1\2\u008e\u0094\7\4\2\2\u008f\u0090"+
		"\5\16\b\2\u0090\u0091\b\b\1\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u00c0\b\b\1\2"+
		"\u0099\u009a\7\25\2\2\u009a\u009b\7\t\2\2\u009b\u009c\5\20\t\2\u009c\u009d"+
		"\7\r\2\2\u009d\u009e\5\16\b\2\u009e\u009f\7\26\2\2\u009f\u00a0\5\16\b"+
		"\2\u00a0\u00a1\b\b\1\2\u00a1\u00c0\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3"+
		"\u00a4\7\t\2\2\u00a4\u00a5\5\20\t\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5"+
		"\16\b\2\u00a7\u00a8\b\b\1\2\u00a8\u00c0\3\2\2\2\u00a9\u00aa\7\30\2\2\u00aa"+
		"\u00ab\7\t\2\2\u00ab\u00ac\5\20\t\2\u00ac\u00ad\7\r\2\2\u00ad\u00ae\7"+
		"\20\2\2\u00ae\u00af\b\b\1\2\u00af\u00c0\3\2\2\2\u00b0\u00b1\5\22\n\2\u00b1"+
		"\u00b2\7\31\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5"+
		"\b\b\1\2\u00b5\u00c0\3\2\2\2\u00b6\u00b7\5\22\n\2\u00b7\u00b8\7\13\2\2"+
		"\u00b8\u00b9\5\20\t\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb\7\31\2\2\u00bb\u00bc"+
		"\5\20\t\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\b\b\1\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u008d\3\2\2\2\u00bf\u0099\3\2\2\2\u00bf\u00a2\3\2\2\2\u00bf\u00a9"+
		"\3\2\2\2\u00bf\u00b0\3\2\2\2\u00bf\u00b6\3\2\2\2\u00c0\17\3\2\2\2\u00c1"+
		"\u00c2\b\t\1\2\u00c2\u00c3\7&\2\2\u00c3\u00e4\b\t\1\2\u00c4\u00c5\7!\2"+
		"\2\u00c5\u00e4\b\t\1\2\u00c6\u00c7\7\"\2\2\u00c7\u00e4\b\t\1\2\u00c8\u00c9"+
		"\5\22\n\2\u00c9\u00ca\b\t\1\2\u00ca\u00e4\3\2\2\2\u00cb\u00cc\7#\2\2\u00cc"+
		"\u00e4\b\t\1\2\u00cd\u00ce\7$\2\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\7\13"+
		"\2\2\u00d0\u00d1\5\20\t\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\b\t\1\2\u00d3"+
		"\u00e4\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\t"+
		"\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\b\t\1\2\u00d9\u00e4\3\2\2\2\u00da"+
		"\u00db\7%\2\2\u00db\u00dc\5\20\t\4\u00dc\u00dd\b\t\1\2\u00dd\u00e4\3\2"+
		"\2\2\u00de\u00df\7\t\2\2\u00df\u00e0\5\20\t\2\u00e0\u00e1\7\r\2\2\u00e1"+
		"\u00e2\b\t\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00c1\3\2\2\2\u00e3\u00c4\3\2"+
		"\2\2\u00e3\u00c6\3\2\2\2\u00e3\u00c8\3\2\2\2\u00e3\u00cb\3\2\2\2\u00e3"+
		"\u00cd\3\2\2\2\u00e3\u00d4\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00de\3\2"+
		"\2\2\u00e4\u010b\3\2\2\2\u00e5\u00e6\f\17\2\2\u00e6\u00e7\t\2\2\2\u00e7"+
		"\u00e8\5\20\t\20\u00e8\u00e9\b\t\1\2\u00e9\u010a\3\2\2\2\u00ea\u00eb\f"+
		"\16\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00ed\5\20\t\2\u00ed\u00ee\7\f\2\2"+
		"\u00ee\u00ef\b\t\1\2\u00ef\u010a\3\2\2\2\u00f0\u00f1\f\r\2\2\u00f1\u00f2"+
		"\7\37\2\2\u00f2\u00f3\7 \2\2\u00f3\u010a\b\t\1\2\u00f4\u00f5\f\f\2\2\u00f5"+
		"\u00f6\7\37\2\2\u00f6\u00f7\5\22\n\2\u00f7\u00f8\b\t\1\2\u00f8\u0104\7"+
		"\t\2\2\u00f9\u00fa\5\20\t\2\u00fa\u0101\b\t\1\2\u00fb\u00fc\7\21\2\2\u00fc"+
		"\u00fd\5\20\t\2\u00fd\u00fe\b\t\1\2\u00fe\u0100\3\2\2\2\u00ff\u00fb\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u00f9\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\r\2\2\u0107\u0108\b\t\1\2\u0108"+
		"\u010a\3\2\2\2\u0109\u00e5\3\2\2\2\u0109\u00ea\3\2\2\2\u0109\u00f0\3\2"+
		"\2\2\u0109\u00f4\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\21\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\'\2"+
		"\2\u010f\23\3\2\2\2\22\339AIcfow\u008b\u0094\u00bf\u00e3\u0101\u0104\u0109"+
		"\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}