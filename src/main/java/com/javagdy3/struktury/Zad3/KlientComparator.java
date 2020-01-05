package com.javagdy3.struktury.Zad3;

import java.util.Comparator;

public class KlientComparator implements Comparator<Klient> {

    // 1 = o1 większy
    // -1 = o1 mniejszy
    @Override
    public int compare(Klient o1, Klient o2) {
        if (o1.isPriority() && !o2.isPriority()) {
            return 1;
        }
        if (o2.isPriority() && !o1.isPriority()) {
            return -1;
        }
        if (o1.isPriority() && o2.isPriority()) {
            if (o1.getCzasPrzybycia().isBefore(o2.getCzasPrzybycia())) {
                return 1;
            } else if (o1.getCzasPrzybycia().isAfter(o2.getCzasPrzybycia())) {
                return -1;
            }
        }

        if (o1.getCzasPrzybycia().isBefore(o2.getCzasPrzybycia())) {
            return 1;
        } else if (o1.getCzasPrzybycia().isAfter(o2.getCzasPrzybycia())) {
            return -1;
        }
        return 0;
    }
}
