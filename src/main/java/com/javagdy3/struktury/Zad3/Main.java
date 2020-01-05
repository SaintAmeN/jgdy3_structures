package com.javagdy3.struktury.Zad3;

import java.security.PrivateKey;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Poczekalnia poczekalnia = new Poczekalnia();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(3000));
                    poczekalnia.dodajKlienta("Jan111", true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(3000));
                    poczekalnia.dodajKlienta("Jan2", false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(3000));
                    poczekalnia.dodajKlienta("Jan3", true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(3000));
                    poczekalnia.dodajKlienta("Jan4", false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(new Random().nextInt(3000));
                    poczekalnia.dodajKlienta("Jan5", true);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        poczekalnia.wypisz();
    }
}
