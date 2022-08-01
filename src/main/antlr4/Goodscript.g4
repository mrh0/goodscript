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
FLOAT: '0f'|'-'?[1-9][0-9]*('.'[0-9]*)?'f'?;
HEX: '0x'[0-9a-fA-F]*;
BIN: '0b'[0-1]*;

CHAR: '\''.'\'' | '\'\\'('n'|'r'|'t'|'\\'|'\''|'"'|'0')'\'';

STRING: '"' .*? '"';

WHITESPACE: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
BLOCKCOMMENT: '/*' .*? '*/' -> skip;

number:
    INT             #numberInt
    | FLOAT         #numberFloat
    | HEX           #numberHex
    | BIN           #numberBin
    ;

primitive:
    number
    | BOOL
    | STRING
    | CHAR
    | ATOM
    ;

expr:
    expr '+' expr       #exprOpBin
    | '(' expr ')'      #exprNest
    | primitive         #exprPrimitive
    | shortcall         #exprShortcall
    ;

shortcall:
    name=NAME next=expr             #shortcallArg
    | name=NAME                     #shortcallNoArg
    ;

statement:
    NAME '=' '(' expr ')' NL        #statementAssignment
    | NAME '=' expr NL              #statementAssignment
    | shortcall NL                  #statementShortcall
    | 'ret' expr NL                 #statementReturn
    ;

block:
    INDENT (statements+=statement)+ DEDENT
    ;

use:
    'use' (NAME 'from')? STRING ('as' NAME)? NL
    ;

func:
    'start'? 'fn' name=NAME '(' args+=NAME? (',' args+=NAME)* ')' ':' body=block
    ;

program:
    use*
    functions+=func*
    ;