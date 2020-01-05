package com.javagdy3.struktury;

import java.util.Scanner;
import java.util.Stack;

public class Zad4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String liniaTekstu = scanner.next();

        String[] literki = liniaTekstu.split("");
        for (int i = 0; i < literki.length; i++) {
            stack.add(literki[i]);
        }

        System.out.println();
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
