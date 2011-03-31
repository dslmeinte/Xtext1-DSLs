lexer grammar InternalDataModelDsl;
@header {
package nl.dslmeinte.xtext.examples.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'primitive-types' ;
T12 : '{' ;
T13 : '}' ;
T14 : 'extends' ;
T15 : '->' ;
T16 : 'datatype' ;
T17 : ':' ;
T18 : 'enum' ;
T19 : 'transient' ;
T20 : 'abstract' ;
T21 : 'entity' ;
T22 : 'constraint' ;
T23 : 'uses' ;
T24 : 'function' ;
T25 : '(' ;
T26 : ')' ;
T27 : 'string' ;
T28 : 'int' ;
T29 : 'number' ;
T30 : 'boolean' ;
T31 : 'optional' ;
T32 : 'required' ;
T33 : 'repeated' ;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1289
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1291
RULE_INT : ('0'..'9')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1293
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1295
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1297
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1299
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../nl.dslmeinte.xtext.examples.data/src-gen/nl/dslmeinte/xtext/examples/parser/antlr/internal/InternalDataModelDsl.g" 1301
RULE_ANY_OTHER : .;


