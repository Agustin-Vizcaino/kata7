package org.example;

public class Tester {
    public static int test() {
        int score = 6;
        score -= test01_numbers();
        score -= test02_nothing();
        score -= test03_symbols();
        score -= test04_melissa();
        score -= test05_agustin();
        score -= test06_zzzzzzz();
        System.out.println("Failure rate: " + score/6 + "%");
        if (score == 0) System.out.println("Congratulations!"); else System.out.println("Please try again");
        return score;
    }

    private static int test01_numbers() {

    }

    private static int test02_nothing() {

    }

    private static int test03_symbols() {

    }

    private static int test04_melissa() {

    }

    private static int test05_agustin() {

    }

    private static int test06_zzzzzzz() {

    }
}
