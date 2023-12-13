public class Token {
    private final String lexeme;
    private final String lexicalComp;
    private final int line;
    private final int column;

    public Token(String lexeme, String lexicalComp, int line, int column) {
        this.lexeme = lexeme;
        this.lexicalComp = lexicalComp;
        this.line = line;
        this.column = column;
    }

    // Getters para lexeme, lexicalComp, line, column

    public String getLexeme() {
        return lexeme;
    }

    public String getLexicalComp() {
        return lexicalComp;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
    
}