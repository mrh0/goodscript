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

INT: '0'|[1-9][0-9]*;
FLOAT: '0f'|[1-9][0-9]*('.'[0-9]*)?'f'?;
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
    number          #primitiveNumber
    | BOOL          #primitiveBool
    | STRING        #primitiveString
    | CHAR          #primitiveChar
    | ATOM          #primitiveAtom
    ;

block:
    INDENT (statements+=statement)+ DEDENT
    ;

unOp:
    'not' | '!' | '!!' | '~' | '-'
    ;

binOp:
    '+' | '-' | '*' | '/' | '%'
    | '<' | '>' | '<=' | '>=' | '==' | '!='
    | '&' | '|' | '&&' | 'and' | '||' | 'or'
    | '<<' | '>>'
    ;

expr:
    left=expr binOp right=expr          #exprBinOp
    | unOp expr                         #exprUnOp
    | '(' expr ')'                      #exprNest
    | primitive                         #exprPrimitive
    | NAME                              #exprNamed
    | 'if' '(' condition=expr ')' body=expr 'else' elseBody=expr #exprInlineIf
    | expr 'is' NAME                    #exprIs
    | expr 'as' NAME                    #exprAs
//   | shortcall         #exprShortcall
    ;

/*
shortcall:
    name=NAME next=expr             #shortcallArg
    | name=NAME                     #shortcallNoArg
    ;
*/
type:
    NAME        #typeByName
    ;

argument:
    NAME ':' type               #argumentTyped
    | primitive                 #argumentPrimitive
    | '_'                       #argumentWildcard
    ;

orderExpression:
    'orderby' expr
    | 'orderasc'
    | 'orderdesc'
    ;

statement:
    'var' NAME (':' type)? '=' expr NL          #statementDefine
    | 'val' NAME (':' type)? '=' expr NL          #statementDefineConst
    | NAME '=' expr NL              #statementAssignment
//    | shortcall NL                  #statementShortcall
    | 'ret' expr NL                 #statementReturn
    | 'break' NL                    #statementBreak
    | 'continue' NL                 #statementContinue

    | 'if' '('? conditions+=expr ')'? 'do' bodies+=block ('eif' '('? conditions+=expr ')'? 'do' bodies+=block)* ('else' elseBody=block)? #statementIf
    | 'while' '('? condition=expr ')'? 'do' body=block ('else' elseBody=block)? #statementWhile
    | 'for' '('? NAME 'in' expr ('where' expr)? orderExpression? ')'? 'do' body=block ('else' elseBody=block)? #statementForIn
    | NAME '('? args+=expr? (',' args+=expr)* ')'? NL #statementCallFunction
    | 'ret' NAME '('? args+=expr? (',' args+=expr)* ')'? NL #statementCallFunctionReturn
    ;

use:
    'use' NAME ('from' STRING)? ('as' NAME)? NL
    ;

funcPrefix:
    'start'
    ;

func:
    funcPrefix? 'fn' name=NAME '(' args+=argument? (',' args+=argument)* ')' 'do' body=block
    // funcPrefix? 'fn' name=NAME '(' args+=NAME? (',' args+=NAME)* ')' '=' expr NL
    ;

program:
    use*
    functions+=func*
    ;