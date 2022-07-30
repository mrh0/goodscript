grammar Goodscript;

tokens { INDENT, DEDENT }

@lexer::header {
  import com.yuvalshavit.antlr4.DenterHelper;
}

@lexer::members {
  private final DenterHelper denter = new DenterHelper(NL,
                                                       GoodscriptParser.INDENT,
                                                       GoodscriptParser.DEDENT)
  {
    @Override
    public Token pullToken() {
      return GoodscriptLexer.super.nextToken();
    }
  };

  @Override
  public Token nextToken() {
    return denter.nextToken();
  }
}

NL: ('\r'? '\n' ' '*);

BOOL: 'true' | 'false';
NAME: [_a-zA-Z][_a-zA-Z0-9]*;
ATOM: ':'[a-zA-Z0-9][_a-zA-Z0-9]*;

INT: '0'|'-'?[1-9][0-9]*;
HEX: '0x'[0-9a-fA-F]*;
BIN: '0b'[0-1]*;

CHAR: '\''.'\'' | '\'\\'('n'|'r'|'t'|'\\'|'\''|'"'|'0')'\'';

STRING: '"' .*? '"';

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

number:
    | INT
    | HEX
    | BIN
    ;

primitive:
    number
    | BOOL
    | STRING
    | CHAR
    | ATOM
    ;

expr:
    expr '+' expr
    | '(' expr ')'
    | primitive
    ;

shortcall:
    | NAME shortcall
    | NAME expr
    | NAME
    ;

statement:
    NAME '=' '(' expr ')' NL        #statementAssignment
    | NAME '=' expr NL              #statementAssignment
    | shortcall NL                  #statementShortcall
    ;

block:
    INDENT (statements+=statement)+ DEDENT
    ;

func:
    'start'? 'fn' name=NAME '(' args+=NAME? (',' args+=NAME)* ')' ':' body=block
    ;

program:
    functions+=func*
    ;