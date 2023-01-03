package Zarowki;

public class Zarowki extends Zarowka
{
    String producent = "default";
    String typZarowki = "Zarowka";
    static Zarowki listaZarowek[] = new Zarowki[100];
    //static ArrayList<Zarowki> listaZarowek = new ArrayList<>();
    static int koniec = 0;


    public Zarowki(String prod, String typ, int v_maks, int v_zasilania)
    {
        super(v_maks, v_zasilania);
        producent = prod;
        typZarowki = typ;
        listaZarowek[koniec++] = this;
    }
    public Zarowki(){listaZarowek[koniec++] = this;}

    @Override
    public String toString() {
        return super.toString() + "Producent  " + producent + "Typ zarówki " + typZarowki;
    }

    public void drukujStan()
    {
        super.drukujStan();
        System.out.println("Producent  " + producent);
        System.out.println("Typ zarówki " + typZarowki);
    }
}
