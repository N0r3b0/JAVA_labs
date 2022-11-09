import java.lang.management.OperatingSystemMXBean;
import java.util.ArrayList;
import java.util.Objects;

public class Interfejs
{
    public static void main(String[] args) {
        MojZbior<Person> zbior = new MojZbior<Person>()
        {
            @Override
            public boolean czyWystepuje(Person x)
            {
                return klkcja.indexOf(x)>=0;
            }

            @Override
            public boolean dodaj(Person x) {

                klkcja.add(x);
                return false;
            }
        };
        Person o = new Person();
        zbior.dodaj(o);
        for(int i = 0; i<5; i++)
        {
            System.out.println(zbior.klkcja.get(i));
        }
    }

    static interface MojZbior<T>
    {
        ArrayList <Object> klkcja = new ArrayList<>();
        boolean czyWystepuje(T x);
        boolean dodaj(T x);
    }
}
