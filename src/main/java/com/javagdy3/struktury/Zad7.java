package com.javagdy3.struktury;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        System.out.println("Podaj słowo:");
        Scanner scanner = new Scanner(System.in);

        String odwrocony = odwroc(scanner.nextLine());
        System.out.println(odwrocony);

    }

    private static String odwroc(String slowo) {
        if (slowo.length() <= 1) {
            return slowo;
        }
        char ostatniaLiterka = slowo.charAt(slowo.length() - 1);
        String slowoBezLiterki = slowo.substring(0, slowo.length() - 1);

        return ostatniaLiterka + odwroc(slowoBezLiterki);
    }
}
