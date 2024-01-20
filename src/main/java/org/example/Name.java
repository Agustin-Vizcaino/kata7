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
        this.numericValue = 0;
    }
    public static Name makeName(String input) {
        return new Name(input);
    }
}
