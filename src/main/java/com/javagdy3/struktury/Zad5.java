package com.javagdy3.struktury;

import java.util.Scanner;
import java.util.Stack;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liniaTekstu = scanner.nextLine();

        String[] slowa = liniaTekstu.split(" ");
        for (String slowo : slowa) {
            metoda(slowo);
        }

        // kot ma dwa psy
        // tok am awd ysp
        // ysp awd am tok -- źle !!!!
    }

    private static void metoda(String slowo) {
        Stack<String> stack = new Stack<>();

        String[] literki = slowo.split("");
        for (int i = 0; i < literki.length; i++) {
            stack.add(literki[i]);
        }

        System.out.print(" ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.print(" ");
    }
}
