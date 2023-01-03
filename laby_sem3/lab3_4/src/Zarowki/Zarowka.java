package Zarowki;

public class Zarowka
{
    private int v_zasilania = 0;
    private int v_maks = 230;
    void zapal(){v_zasilania = v_maks;}
    void zgas(){v_zasilania = 0;}
    public Zarowka(){};
    public Zarowka(int v_zasilania, int v_maks)
    {
        this.v_zasilania = v_zasilania;
        this.v_maks = v_maks;
    }

    @Override
    public String toString() {
        return "Napięcie zasilania " + v_zasilania + "Napięcie maksymalne " + v_maks;
    }

    public void drukujStan()
    {
        System.out.println("Napięcie zasilania  " + v_zasilania);
        System.out.println("Napięcie maksymalne " + v_maks);
    }
}
