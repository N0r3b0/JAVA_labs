import java.util.ArrayList;


public class Main {

    public static String[] imiona = {"Mati", "Siema", "Rafał", "Mirek", "Remek", "Grzegorz", "Sebastian", "Kierowca", "Michał", "Jojo"};

    public static void main(String[] args)
    {
        ArrayList <Uczen>siema = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            siema.add(new Uczen());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(siema.get(i).toString());
        }

        for(int i=0; i < 10; i++){
            for (int j = i; j < 9; j++){
                if(siema.get(i).equals(siema.get(j)));
                System.out.println(siema.get(i).toString() + "");
            }

    }
        Uczen XDDDD = new Uczen();

        XDDDD.lista();

        XDDDD.zamien();





    }
}