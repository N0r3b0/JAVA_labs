import java.text.Collator;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Osoba {
    String nazwisko = "Kowalski";
    String imie="Jan";
    public String dataUr="25-09-1999";

    static LocalDate dzisiaj = LocalDate.now();
    static int bRok = dzisiaj.getYear();
    static int bMiesiac = dzisiaj.getMonthValue();


    static ArrayList<Osoba> ListaOsob = new ArrayList<Osoba>();


    public Osoba(String nazwisko, String imie, String dataUr) {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUr = dataUr;
        ListaOsob.add(this);
    }


    public Osoba() {
        ListaOsob.add(this);
    }

    public String toString() {
        return nazwisko + " " + imie + " " + dataUr + " wiek " + String.format("%5.2f\n", wiek());
    }

    double wiek() {
        String[] data = dataUr.split("-");
        int lata = this.bRok-Integer.parseInt(data[0]);
        int miesiace = this.bMiesiac-Integer.parseInt(data[1]);
        if (miesiace < 0)
        {
            lata = -1;
            miesiace+=12;
        }
        return lata + miesiace/12.0;
    }
}
