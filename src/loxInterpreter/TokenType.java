package loxInterpreter;
//no loops
public enum TokenType {
	
	//Single Token Params
	LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, COMMA,
	DOT, MINUS, PLUS, SEMICOLON, SLASH, STAR, LEFT_BRACKET, RIGHT_BRACKET,
	
	//One or two character tokens
	BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL, GREATER, GREATER_EQUAL, 
	LESS, LESS_EQUAL, ARROW_EQUAL,
	
	//Literals
	IDENTIFIER, STRING, NUMBER, NIL,
	
	//Keywords
	AND, ELSE, FALSE, FUN, IF, OR, PRINT, RETURN, TRUE, LET, EOF, CLASS,
	THIS, SERIES

}
