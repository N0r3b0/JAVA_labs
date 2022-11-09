package com.company;

import java.time.LocalDate;

public class Osoba {
    String nazwisko = "domyslne nazwisko";
    String imie = "domyslne imie";
    String dataUr = "2000-1-1";
    static LocalDate dzisiaj = LocalDate.now();
    static int bRok = dzisiaj.getYear();
    static int bMiesiac = dzisiaj.getMonthValue();
    static int bDzien = dzisiaj.getDayOfYear();
}
