package laby13_12;

import java.time.LocalDate;
import java.util.ArrayList;

public class Osoba
{
    public String nazwisko = "DomyslneNazwisko";
    public String imie = "DomyslneImie";
    public String dataUr = "2000-12-12";
    static LocalDate dzisiaj = LocalDate.now();
    static int bRok = dzisiaj.getYear();
    static int bMiesiac = dzisiaj.getMonthValue();

    static ArrayList <Osoba> listaOsob = new ArrayList<>();

    public Osoba(String nazwisko, String imie, String dataUr)
    {
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.dataUr = dataUr;
    }

    public String toString()
    {
        return nazwisko + " " + imie + " " + dataUr + " wiek " + String.format("%5.2f\n", wiek(dataUr));
    }

    double wiek(String dataUr)
    {
        String[] data = dataUr.split("-");
        int miesiace = bMiesiac-Integer.parseInt(data[1]);
        int lata = bRok-Integer.parseInt(data[2]);
        if (miesiace < 0)
        {
            lata =-1;
            miesiace+=12;
        }  /*String[] data = dataUr.split("-");
        LocalDate urodzenie = LocalDate.of(Integer.parseInt(data[0]),
                Integer.parseInt(data[1]), Integer.parseInt(data[2]));
        Period per = Period.between(urodzenie, dzisiaj);
        return per.getYears() + per.getMonths()/12.0 + per.getDays()/365.0;
       return lata + miesiace/12.0;*/
        return lata + miesiace/12.0;
    }
    public Osoba()
    {
        listaOsob.add(this);
    }
}
