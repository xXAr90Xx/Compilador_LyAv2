import java.io.*;

%%

%class Lexer
%public

%{

import java.util.ArrayList;
import java.util.List;

%}

%unicode
%line
%column
%cupdebug

%type Token
%eofval{
    new Token(sym.EOF, "EOF");
%eofval}

%state IN_STRING

// Resto de tus reglas léxicas...

%%

// Reglas léxicas...

// Reglas para espacios en blanco y saltos de línea
[\t\r\f]+   { /* Ignorar */ }

// Regla para números
[+-]?(\d*\.\d+([eE][+-]?\d+)?|\d+([eE][+-]?\d+)?)   { return new Token(sym.NUMERO, yytext()); }

// Regla para palabras reservadas y otros tokens
Si|SiNo|FinSino|FinSi|Repite|Mientras|FMientras|Car|Cad|Num|IniC|FinC|IniB|FinB|Dec|Bool|Seno|Coseno|Tangente|Cotangente|Secante|Cosecante|Elegir|Com|MensajeS|DatoE|Posicion|Gravedad|Sprite|Velocidad|Vacio   { return new Token(sym.PALABRARESERVADA, yytext()); }

// Regla para tipos de datos
Car|Cad|Num|Dec|Bool   { return new Token(sym.TIPODEDATO, yytext()); }

// Regla para comunicación
Com|MensajeS   { return new Token(sym.COMUNICACION, yytext()); }

// Regla para funciones especiales
Seno|Coseno|Tangente|Cotangente|Secante|Cosecante   { return new Token(sym.FUNCIONESESPECIALES, yytext()); }

// Regla para constantes especiales
Gravedad   { return new Token(sym.CONSTANTESESPECIALES, yytext()); }

// Regla para objetos en entidades
Sprite|Velocidad   { return new Token(sym.OBJETOSENTIDADES, yytext()); }

// Regla para identificadores
[a-zA-Z_][a-zA-Z0-9_]*   { return new Token(sym.IDENTIFICADOR, yytext()); }

// Regla para cadenas de caracteres
\"([^\"]|\\.)*\"   { return new Token(sym.CARACTER, yytext()); }

// Regla para operadores aritméticos
[+*/\-%]|e|E   { return new Token(sym.OPERADORAR, yytext()); }

// Regla para operadores relacionales
==|<=|>=|!=   { return new Token(sym.OPERADORRE, yytext()); }

// Regla para operadores de agrupación
[(){}¿?]   { return new Token(sym.OPERADORAG, yytext()); }

// Regla para operadores incremento y decremento
(\+\+|\-\-)   { return new Token(sym.OPERADORIYD, yytext()); }

// Regla para operadores lógicos
(\&\&|\^\^|\!)   { return new Token(sym.OPERADORLOG, yytext()); }

// Regla para operadores asignación
=|\+=|-=   { return new Token(sym.OPERADORASG, yytext()); }

// Regla para caracteres no reconocidos
.   { return new Token(sym.INVALIDO, yytext()); }

// Regla para saltos de línea
\n   { return new Token(sym.SALTO, yytext()); }

// Regla para manejar cadenas de caracteres no cerradas
<IN_STRING>\"   { yybegin(INITIAL); return new Token(sym.CARACTER, yytext()); }
<IN_STRING>[^\n]*   { /* Ignorar */ }
<IN_STRING>\n       { yybegin(INITIAL); return new Token(sym.CARACTER, yytext()); }
