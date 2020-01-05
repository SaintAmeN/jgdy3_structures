package com.javagdy3.struktury.Zad3;

import java.time.LocalDateTime;
import java.util.PriorityQueue;

public class Poczekalnia {
    private PriorityQueue<Klient> klients = new PriorityQueue<>(new KlientComparator());

    public void dodajKlienta(String imie, boolean czyPriorytet) {
        Klient klient = new Klient(imie, LocalDateTime.now(), czyPriorytet);
        klients.add(klient);
    }

    public Klient pobierzKlienta() {
        return klients.poll();
    }

    public void wypisz() {
        while (!klients.isEmpty()) {
            System.out.println(klients.poll());
        }
    }
}
