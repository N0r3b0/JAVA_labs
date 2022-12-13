public class pojazdy {

    public void przegladpojazdu(){

        System.out.println("Specyfikacja przegladu pojazdu: ");
    }

    static void zrobTo(pojazdy P){
            String a = P.getClass().getGenericSuperclass().getTypeName();
            System.out.println("\n super: " + a);
            String aa = P.getClass().getTypeName();
            System.out.println("\nklasa: " + aa);
            P.przegladpojazdu();

        }
    }


