public class Main
{
    public static void main(String[] args)
    {
        Uczen adrianek = new Uczen("zawodowy zespół szkół nr.7 w Ciechocinku", "murarz-tynkarz", "01-09-2022", 2.3);
        Uczen julka = new Uczen("liceum ogólnokształcące imienia Jana Pawła II w Krakowie", "mat-fiz", "01-09-2021", 1.4);
        Uczen marianek = new Uczen("zawodowy zespół szkół nr.7 w Ciechocinku", "murarz-tynkarz", "01-09-2022", 2.3);

        adrianek.nazwisko = "Stanik"; adrianek.imie = "Adrian"; adrianek.dataUr = "23-03-2000";
        julka.nazwisko = "Isalov"; julka.imie = "Julka"; julka.dataUr = "23-03-1998";
        marianek.nazwisko = "Klaw"; marianek.imie = "Marian"; marianek.dataUr = "23-03-2002";
        //System.out.println(Uczen.najmlodszyUczen());
        for (int i = 0; i < Uczen.listaUczniow.size(); i++) {
            System.out.println(Uczen.listaUczniow.get(i));
            System.out.println();
        }
        Uczen.zamienMiejscami();
        System.out.println();
        System.out.println();
        for (int i = 0; i < Uczen.listaUczniow.size(); i++) {
            System.out.println(Uczen.listaUczniow.get(i));
            System.out.println();
        }

    }
}