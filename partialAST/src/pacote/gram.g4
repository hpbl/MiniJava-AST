grammar gram;

@header {
import ast.*;
}


expression returns [Exp expressao]:
            e1=expression op='+' e2=expression
                {$expressao = new Plus($e1.expressao, $e2.expressao);}

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