grammar hpbl_rfl3;

@header {
import ast.*;
}


goal returns [Program programa]:
                {ClassDeclList cdl1 = new ClassDeclList();}
            mc1=mainClass ( cd1=classDeclaration {
                            if ($cd1.ctx != null) {
                                cdl1.addElement($cd1.declClasse);
                            }}
                            )* EOF

                {$programa = new Program($mc1.classeMain, cdl1);}
            ;


mainClass returns [MainClass classeMain]:
            'class' id1=identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' id2=identifier ')' '{' s1=statement '}' '}'
                {Identifier idtf1 = new Identifier($id1.ctx.getText());
                Identifier idtf2 = new Identifier($id2.ctx.getText());

                $classeMain = new MainClass(idtf1, idtf2, $s1.declaracao);
                }
            ;


classDeclaration returns [ClassDecl declClasse]:
                {VarDeclList vl1 = new VarDeclList();
                MethodDeclList ml1 = new MethodDeclList();}
            'class' id1=identifier ( 'extends' id2=identifier )? '{' ( vd1=varDeclaration {
                                                                                           if ($vd1.ctx != null) {
                                                                                            vl1.addElement($vd1.declVariavel);
                                                                                           }
                                                                                           } )* ( md1=methodDeclaration {
                                                                                                           if ($md1.ctx != null) {
                                                                                                               ml1.addElement($md1.declMetodo);
                                                                                                           }
                                                                                           } )* '}'
                {Identifier idtf1 = new Identifier($id1.ctx.getText());


                if ($id2.ctx != null) {
                    Identifier idtf2 = new Identifier($id2.ctx.getText());
                    $declClasse = new ClassDeclExtends(idtf1, idtf2, vl1, ml1);

                } else {
                    $declClasse = new ClassDeclSimple(idtf1, vl1, ml1);
                }

                }
            ;


varDeclaration returns [VarDecl declVariavel]:
            tp=type id=identifier ';'
                {Identifier idtf = new Identifier($id.ctx.getText());
                $declVariavel = new VarDecl($tp.tipo, idtf);}
            ;


methodDeclaration returns [MethodDecl declMetodo]:
                {FormalList fl1 = new FormalList();
                VarDeclList vl1 = new VarDeclList();
                StatementList sl1 = new StatementList();}
            'public' tp1=type id1=identifier '(' ( tp2=type id2=identifier {
                                                                            if ($id2.ctx != null) {
                                                                                Identifier idtf2 = new Identifier($id2.ctx.getText());
                                                                                Formal f1 = new Formal($tp2.tipo, idtf2);
                                                                                fl1.addElement(f1);
                                                                                }
                                                                            }
                                                                            ( ',' tp3=type id3=identifier {
                                                                                if ($id2.ctx != null) {
                                                                                    Identifier idtf2 = new Identifier($id2.ctx.getText());
                                                                                    Formal f1 = new Formal($tp2.tipo, idtf2);
                                                                                    fl1.addElement(f1);
                                                                                }
                                                                            })* )? ')' '{' ( vd1=varDeclaration {
                                                                                                vl1.addElement($vd1.declVariavel);
                                                                                            })*
                                                                                             ( st1=statement {
                                                                                                sl1.addElement($st1.declaracao);
                                                                                             })*
                                                                                              'return' e1=expression ';' '}'
                {Identifier idtf1 = new Identifier($id1.ctx.getText());

                $declMetodo = new MethodDecl($tp1.tipo, idtf1, fl1, vl1, sl1, $e1.expressao);
                }
            ;


type returns [Type tipo]:
            'int' '[' ']'
                {$tipo = new IntArrayType();}

    |       'boolean'
                {$tipo = new BooleanType();}

    |       'int'
                {$tipo = new IntegerType();}

    |       id=identifier
                {$tipo = new IdentifierType($id.ctx.getText());}
    ;


statement returns [Statement declaracao]:
                {StatementList list = new StatementList();}
            '{' ( stmt=statement {list.addElement($stmt.declaracao);} )* '}'
                {$declaracao = new Block(list);}

         |  'if' '(' exp=expression ')' s1=statement 'else' s2=statement
                {$declaracao = new If($exp.expressao, $s1.declaracao, $s2.declaracao);}

         |  'while' '(' exp=expression ')' blck=statement
                {$declaracao = new While($exp.expressao, $blck.declaracao);}

         |  'System.out.println' '(' exp=expression ')' ';'
                {$declaracao = new Print($exp.expressao);}

         |  id=identifier '=' exp=expression ';'
                {Identifier idtf = new Identifier($id.ctx.getText());
                $declaracao = new Assign(idtf, $exp.expressao);}

         |  id=identifier '[' e1=expression ']' '=' e2=expression ';'
                {Identifier idtf = new Identifier($id.ctx.getText());
                $declaracao = new ArrayAssign(idtf, $e1.expressao, $e2.expressao);}
         ;


expression returns [Exp expressao]:
            e1=expression op=( '&&' | '<' | '+' | '-' | '*' ) e2=expression
                {switch ($op.getText()) {
                    case "&&":  $expressao = new And($e1.expressao, $e2.expressao);
                                break;

                    case "<":   $expressao = new LessThan($e1.expressao, $e2.expressao);
                                break;

                    case "+":   $expressao = new Plus($e1.expressao, $e2.expressao);
                                break;

                    case "-":   $expressao = new Minus($e1.expressao, $e2.expressao);
                                break;

                    case "*":   $expressao = new Times($e1.expressao, $e2.expressao);
                                break;
                }
                }

          | e1=expression '[' e2=expression ']'
                {$expressao = new ArrayLookup($e1.expressao, $e2.expressao);}

          | e1=expression '.' 'length'
                {$expressao = new ArrayLength($e1.expressao);}

          | e1=expression '.' id=identifier {ExpList expList = new ExpList();}
                                                  '(' ( e2=expression {if ($e2.ctx != null) {
                                                                    expList.addElement(((ExpressionContext)_localctx).e2.expressao);
                                                                 }}
                                                                 ( ',' e3=expression {if ($e3.ctx != null) {
                                                                                        expList.addElement(((ExpressionContext)_localctx).e3.expressao);
                                                                                      }}
                                                                 )*
                                                  )? ')'

                {Identifier idtf = new Identifier($id.ctx.getText());
                 $expressao = new Call($e1.expressao, idtf, expList);}

          | integer=INTEGER_LITERAL
                {$expressao = new IntegerLiteral(Integer.parseInt($integer.getText()));}

          | 'true'
                {$expressao = new True();}

          | 'false'
                {$expressao = new False();}

          | id=identifier
                {$expressao = new IdentifierExp($id.ctx.getText());}

          | 'this'
                {$expressao = new This();}

          | 'new' 'int' '[' exp=expression ']'
                {$expressao = new NewArray($exp.expressao);}

          | 'new' id=identifier '(' ')'
                {$expressao = new NewObject(new Identifier($id.ctx.getText()));}

          | '!' exp=expression
                {$expressao = new Not($exp.expressao);}

          | '(' exp=expression ')'
                {/* descobrir se é assim */
                $expressao = $exp.expressao;
                }
          ;


identifier: IDENTIFIER;


// Missing lexer rules

INTEGER_LITERAL:    [0-9]+;
IDENTIFIER:         [a-zA-Z_0-9]+;
WS:                 [ \r\n\t]+ ->skip;
BLOCKCOMMENT:       '/*' .*? '*/' -> skip;
LINECOMMENT:        '//' ~[\r\n]* -> skip;