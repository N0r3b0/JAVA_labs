import java.util.ArrayList;

public class Uczen extends Osoba
{
    String szkola ="domyslna szkola";
    String profil = "domyslny profil";
    String dataRozp = "domyslna data rozp";
    double srednia = 0.0;
    static ArrayList<Uczen> listaUczniow = new ArrayList<>();

    public Uczen(String szkola, String profil, String dataRozp, double srednia)
    {
        this.szkola = szkola;
        this.profil = profil;
        this.dataRozp = dataRozp;
        this.srednia = srednia;
        listaUczniow.add(this);
    }
    public Uczen()
    {
        listaUczniow.add(this);
    }

    public String toString()
    {
        return  super.toString() + "\nszkoła: " + szkola + "\nprofil: " + profil + "\ndata rozpoczęcia: " + dataRozp + "\nczas nauki: "
                + String.format("%5.2f", wiek(dataRozp)) + " lat" + "\nśrednia: " + srednia;
    }

    public boolean jestRowny(Uczen ucz)
    {
        return this.imie.equals(ucz.imie) && this.nazwisko.equals(ucz.nazwisko) && this.dataUr.equals(dataUr);
    }

    public String okreslNazwiskoUczniaZMaxSrednia()
    {
        Uczen zMaxOcena = listaUczniow.get(0);
        for (int i = 1; i < listaOsob.size(); i++) {
            if(listaUczniow.get(i).srednia > zMaxOcena.srednia)
                zMaxOcena = listaUczniow.get(i);
        }
        return zMaxOcena.nazwisko;
    }
    public static Uczen najstarszyUczen()
    {
        Uczen najstarszy = listaUczniow.get(0);
        for (int i = 1; i < listaOsob.size(); i++)
        {
            if(listaUczniow.get(i).wiek(listaUczniow.get(i).dataUr) > najstarszy.wiek(najstarszy.dataUr))
                najstarszy = listaUczniow.get(i);
        }
        return najstarszy;
    }
    public static Uczen najmlodszyUczen()
    {
        Uczen najmlodszy = listaUczniow.get(0);
        for (int i = 1; i < listaOsob.size(); i++)
        {
            if(listaUczniow.get(i).wiek(listaUczniow.get(i).dataUr) < najmlodszy.wiek(najmlodszy.dataUr))
                najmlodszy = listaUczniow.get(i);
        }
        return najmlodszy;
    }
    public static void zamienMiejscami()
    {
        Uczen najstarszy = Uczen.najstarszyUczen();
        Uczen najmlodszy = Uczen.najmlodszyUczen();
        int bufor1 = 0; int bufor2 = 0;
        for (int i = 0; i < listaUczniow.size(); i++) {
            if(listaUczniow.get(i) == Uczen.najstarszyUczen())
                bufor1 = i;
            if(listaUczniow.get(i) == Uczen.najmlodszyUczen())
                bufor2 = i;
        }
        listaUczniow.set(bufor1, najmlodszy);
        listaUczniow.set(bufor2, najstarszy);

    }
}
