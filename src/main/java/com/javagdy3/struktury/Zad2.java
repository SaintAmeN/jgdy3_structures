package com.javagdy3.struktury;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Deque<String> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String komenda;
        do {
            komenda = scanner.next();
            if (komenda.endsWith("a")) {
                queue.addLast(komenda);
            }
        } while (!komenda.equalsIgnoreCase("enough"));

        while (!queue.isEmpty()){
            System.out.print(queue.pollFirst());
            System.out.print(" ");
        }
    }
}
