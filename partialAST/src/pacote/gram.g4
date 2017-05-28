grammar gram;

@header {
import ast.*;
}

statement returns [Statement declaracao]:
            '{' ( stmt=statement )* '}'
                {StatementList list = new StatementList();
                list.addElement($stmt.declaracao);
                $declaracao = new Block(list);}

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

          | e1=expression '.' id=identifier '(' ( e2=expression ( ',' e3=expression )* )? ')'
                {ExpList expList = new ExpList();
                 expList.addElement(((ExpressionContext)_localctx).e2.expressao);
                 expList.addElement(((ExpressionContext)_localctx).e3.expressao);

                 Identifier idtf = new Identifier($id.ctx.getText());

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
                {$expressao = new ArrayLength($exp.expressao);}

          | 'new' id=identifier '(' ')'
                {$expressao = new NewObject(new Identifier($id.ctx.getText()));}

          | '!' exp=expression
                {$expressao = new Not($exp.expressao);}

          | '(' exp=expression ')'
                {/* descobrir o que é isso */}
          ;


identifier: IDENTIFIER;


// Missing lexer rules

INTEGER_LITERAL:    [0-9]+;
IDENTIFIER:         [a-zA-Z]+;
WS:                 [ \r\n\t]+ ->skip;