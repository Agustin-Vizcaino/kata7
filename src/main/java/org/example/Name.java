package org.example;

public class Name {
    private String name;
    private int numericValue;

    public String getName() {
        return name;
    }
    public int getNumericValue() {
        return numericValue;
    }
    private Name(String input) {
        this.name = input;
        this.numericValue = calculateNumericValue();
    }
    public static Name makeName(String input) {
        if (isValidName(input)) return new Name(input); else return new Name("");
    }
    public static boolean isValidName(String input) {
        return input.matches("[a-zA-Z]+");
    }

    private int calculateNumericValue() {
        if (name.isEmpty()) return -1; else return 0;
    }

}
