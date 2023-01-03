package wyklad_09_11;
import java.time.LocalDate;

public class Osoba {
    String nazwisko = "Kowalski";
    String imie = "Jan";
    String dataUr = "1999-10-12";
    static LocalDate dzisiaj = LocalDate.now();
    static int bRok = dzisiaj.getYear();
    static int bMiesiac = dzisiaj.getMonthValue();
    static int bDzien = dzisiaj.getDayOfYear();
}
