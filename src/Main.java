import SymbolTable.SymbolTable;

public class Main {
    public static void main(String[] args) {
        SymbolTable<Object> symbolTable = new SymbolTable<>(10);

        // Add some identifiers and constants
        symbolTable.addHash("var1");
        symbolTable.addHash("var2");
        symbolTable.addHash(16);
        symbolTable.addHash(16);
        symbolTable.addHash(5);


        // Check if identifiers and constants are in the symbol table
        System.out.println("Is 'var1' an identifier? " + symbolTable.hasHash("var1"));
        System.out.println("Is 'var2' an identifier? " + symbolTable.hasHash("var2"));
        System.out.println("Is 'var3' an identifier? " + symbolTable.hasHash("var3"));
        System.out.println("Is '16' a constant? " + symbolTable.hasHash(16));
        System.out.println("Is '5' a constant? " + symbolTable.hasHash(5));

        // Get the positions (bucket indexes) for identifiers and constants
        System.out.println("Position of 'var1' " + symbolTable.getPositionHash("var1"));
        System.out.println("Position of 'var2' " + symbolTable.getPositionHash("var2"));
        System.out.println("Position of '16' " + symbolTable.getPositionHash(16));
        System.out.println("Position of '5' " + symbolTable.getPositionHash(5));

        System.out.println(symbolTable);
    }
}