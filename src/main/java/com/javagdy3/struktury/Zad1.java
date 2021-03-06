package com.javagdy3.struktury;

import java.util.Scanner;
import java.util.Stack;

public class Zad1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String liniaTekstu = scanner.nextLine();

        String[] slowa = liniaTekstu.split(" ");
        for (int i = 0; i < slowa.length; i++) {
            stack.add(slowa[i]);
        }

        System.out.println();
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
            System.out.print(" ");
        }
    }
}
