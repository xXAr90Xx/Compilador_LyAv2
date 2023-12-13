import compilerTools.Token;

%%
%class Lexer
%public
%line
%column
%unicode
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*
Numero = {Digito} ({Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%

/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }


/*Numero*/
{Numero} "." {Numero} { return token(yytext(), "REAL", yyline, yycolumn); }
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }

// Regla para palabras reservadas y otros tokens
Si|SiNo|FinSino|FinSi|Repite|Mientras|FMientras|Car|Cad|Num|IniC|FinC|IniB|FinB|Dec|Bool|Seno|Coseno|Tangente|Cotangente|Secante|Cosecante|Elegir|Com|MensajeS|DatoE|Posicion|Gravedad|Sprite|Velocidad|Vacio   { return token("PALABRA_RESERVADA", yytext()); }

// Regla para tipos de datos
Car|Cad|Num|Dec|Bool   { return token("TIPO_DATO", yytext()); }

// Regla para comunicación
Com|MensajeS   { return token("COMUNICACION", yytext()); }

// Regla para funciones especiales
Seno|Coseno|Tangente|Cotangente|Secante|Cosecante   { return token("FUNCION_ESPECIAL", yytext()); }

// Regla para constantes especiales
Gravedad   { return token("CONSTANTE_ESPECIAL", yytext()); }

// Regla para objetos en entidades
Sprite|Velocidad   { return token("OBJETO_ENTIDAD", yytext()); }

// Regla para identificadores
[a-zA-Z_][a-zA-Z0-9_]*   { return token("IDENTIFICADOR", yytext()); }

// Regla para cadenas de caracteres
\"([^\"]|\\.)*\"   { return token("CADENA", yytext()); }

// Regla para operadores aritméticos
[+*/\-%]|e|E   { return token("OPERADOR_ARITMETICO", yytext()); }

// Regla para operadores relacionales
==|<=|>=|!=   { return token("OPERADOR_RELACIONAL", yytext()); }

// Regla para operadores de agrupación
[(){}¿?]   { return token("OPERADOR_AGRUPACION", yytext()); }

// Regla para operadores incremento y decremento
(\+\+|\-\-)   { return token("OPERADOR_INCREMENTO_DECREMENTO", yytext()); }

// Regla para operadores lógicos
(\&\&|\^\^|\!)   { return token("OPERADOR_LOGICO", yytext()); }

// Regla para operadores asignación
=|\+=|-=   { return token("OPERADOR_ASIGNACION", yytext()); }

// Regla para caracteres no reconocidos
.   { return token("CARACTER_NO_RECONOCIDO", yytext()); }
