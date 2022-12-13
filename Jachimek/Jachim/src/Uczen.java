import javax.sql.rowset.serial.SerialDatalink;
import java.awt.image.SampleModel;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;

public class Uczen extends Osoba {

    String szkoła = "2 LO";
    String profil = "Kulturoznastwo";
    String dataRozp = " 2017-09-01";
    double średnia = 2.57;


    static ArrayList<Uczen> ListaUczniów = new ArrayList<>();

    public Uczen (String a, String b, String c, String d, String e, String f, double x)
    {
        this.imie = a;
        this.nazwisko = b;
        this.dataUr = c;
        this.szkoła = d;
        this.profil = f;
        this.średnia = x;

        ListaUczniów.add(this);

    }
    public String toString(){
        return super.toString() +
                "\nszkoła: " + szkoła +
                "\nprofil: " + profil +
                "\nrozpoczal " + dataRozp +
                "\nuczy sie " + String.format("%5.2f", wiek()) +
                " lat " + String.format("\nśrednia %5.2f", średnia);

    }
    public Uczen(){
        ListaUczniów.add(this);



    }
    public boolean jestRowny(Uczen inny){
        return this.imie.equals(inny.imie) &&
                this.nazwisko.equals(inny.nazwisko) &&
                this.dataUr.equals((inny.dataUr));

    }
    public static Uczen maxsrednia() {
        Uczen max = ListaUczniów.get(0);
        for (int i = 1; i < ListaUczniów.size(); i++) {
            if (ListaUczniów.get(i).średnia > max.średnia) {
                max = ListaUczniów.get(i);
            }
        }
        return max;
    }

    public static Uczen Najstarszy(){

                Uczen st = ListaUczniów.get(0);

                for(int i = 1; i < ListaUczniów.size(); i++)
                    if(st.dataUr.compareTo(ListaUczniów.get(i).dataUr) > 0);
                        st = ListaUczniów.get(i);

                        return st;
            }

    public static void zamien() {

        int st = 0;
        int dz = 0;


        for (int i = 1; i < ListaUczniów.size(); i++){
            if (ListaUczniów.get(st).dataUr.compareTo(ListaUczniów.get(i).dataUr) > 0)
                st = i;
            else if (ListaUczniów.get(dz).dataUr.compareTo(ListaUczniów.get(i).dataUr) > 0)
                dz = i;
    }
    Uczen pomoc = ListaUczniów.get(st);
        ListaUczniów.add(st, ListaUczniów.get(dz));
        ListaUczniów.add(dz,pomoc);

        }


        public static void lista(){
        for(int i = 0; i < ListaUczniów.size(); i++)
            System.out.println(ListaUczniów.get(i).imie);
        }


    }


