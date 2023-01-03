public class Main {
 public static void main(String[] args) {
    for(int i = 0; i < 100; i++)
    {
       rozszrzeniezangielskiego siema = new rozszrzeniezangielskiego();
       if(i % 2 == 0)
          rozszrzeniezangielskiego.kolekcja[i].zapal();
    }

    int zapalone = 0;
    int zgaszone = 0;

    for(rozszrzeniezangielskiego siema: rozszrzeniezangielskiego.kolekcja){
       if(siema.isON())
          zapalone++;
       else
          zgaszone++;
    }
    System.out.println("Zapalonych jest: " + zapalone);
    System.out.println("Zgaszonych jest: " + zgaszone);

    rozszrzeniezangielskiego.kolekcja[1].zapal();
    rozszrzeniezangielskiego.kolekcja[2].zapal();
    rozszrzeniezangielskiego.kolekcja[5].zapal();
    rozszrzeniezangielskiego.kolekcja[0].zgas();
    rozszrzeniezangielskiego.kolekcja[3].zgas();
    rozszrzeniezangielskiego.kolekcja[4].zgas();
    rozszrzeniezangielskiego.kolekcja[9].zgas();

    System.out.println(rozszrzeniezangielskiego.kolekcja[1].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[2].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[5].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[0].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[3].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[4].drukujStan());
    System.out.println(rozszrzeniezangielskiego.kolekcja[9].drukujStan());

    zarowka x = new rozszrzeniezangielskiego();
    System.out.println(x.drukujStan());

 }
}