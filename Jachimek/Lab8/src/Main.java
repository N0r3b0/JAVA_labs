public class Main {
    public static void main(String[] args) {

        PAbstrak obiekt = new PAbstrak();
        obiekt.dodaj(new Osoba("Kowal", "Zbigniew", "2003-11-11"));
        Osoba nowa = new Osoba( "Kowaliński", "Zbigniew", "2011-11-11");
        obiekt.dodaj(nowa);
        Osoba nowa1 = new Osoba("Kowaliński", "Zbigniew", "2011-11-11");
        System.out.println("rowność " + nowa.jestRowny(PAbstrak.lista.get(0)));
        System.out.println("wystepowanie" + obiekt.wystepuje(nowa1));
        obiekt.napis = "Jan";
        System.out.println("napis" + obiekt.napis);
        System.out.println("data"+ obiekt.teraz);
    }
}