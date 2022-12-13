import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Period;

public class Osoba {

    public String nazwisko = "Kowalski";
    public String imie = "Jan";
    public String data_uro = "25-09-1999";

    static LocalDate dzisiaj = LocalDate.now();
    static int bRok = dzisiaj.getYear();
    static int bMiesiac = dzisiaj.getMonthValue();

    static ArrayList<Osoba> ListaOsob = new ArrayList<Osoba>();

    public Osoba(String i, String n, String d){
        this.imie = i;
        this.nazwisko = n;
        this.data_uro = d;
        ListaOsob.add(this);
    }

    public Osoba(){
        ListaOsob.add(this);
    }

    public String toString(){
        return this.imie + " " + this.nazwisko + " " + this.data_uro;
    }


    double wiek()
    {
        String[] data = this.data_uro.split("-");
        int lata = this.bRok-Integer.parseInt(data[0]);
        int miesiace = this.bMiesiac-Integer.parseInt(data[1]);
        if (miesiace < 0)
        {
            lata =-1;
            miesiace+=12;
        }
        return lata + miesiace/12.0;


    }

    public boolean jestRowny(Osoba inny){
        return this.imie.equals(inny.imie) &&
                this.nazwisko.equals(inny.nazwisko) &&
                this.data_uro.equals((inny.data_uro));
    }
}
