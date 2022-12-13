public class rozszrzeniezangielskiego extends zarowka {

    String producent = "OSRAM";
    String typŻarówki = "Czołówka";
    private double procentówka = 100;
    static int koniec = 0;
    static rozszrzeniezangielskiego kolekcja[] = new rozszrzeniezangielskiego[100];

    public rozszrzeniezangielskiego(String prod, String typ, int napM, int napZ){
    super(napM, napZ);
    producent = prod;
    typŻarówki = typ;
    kolekcja[koniec++] = this; }
    public rozszrzeniezangielskiego() { kolekcja[koniec++] = this;}

    String drukujStan(){
        return super.drukujStan();}



    void przyćmij(){
        procentówka = procentówka/10;
    }
    void rozjaśnij(){
        procentówka = procentówka/1.45;

    }


}


