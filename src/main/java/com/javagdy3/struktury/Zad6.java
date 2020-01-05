package com.javagdy3.struktury;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Podaj słowo:");
        Scanner scanner = new Scanner(System.in);

        System.out.println(isPalindrome(scanner.nextLine()));
    }

    private static final boolean isPalindrome(String word) {
        Deque<Character> queue = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            queue.addLast(word.charAt(i));
        }

        while (!queue.isEmpty()) {
            if (queue.getFirst() != queue.getLast()) {
                return false;
            }
            queue.pollFirst();
            queue.pollLast();
        }
        return true;
    }
}
