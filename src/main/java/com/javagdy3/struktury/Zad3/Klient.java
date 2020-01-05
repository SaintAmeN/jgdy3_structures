package com.javagdy3.struktury.Zad3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Klient {
    private String imie;
    private LocalDateTime czasPrzybycia;
    private boolean priority;
}
