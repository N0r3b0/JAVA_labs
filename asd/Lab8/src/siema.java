import java.util.ArrayList;

public class siema extends ZbiorM<Osoba> {

    int n = 0;
    ArrayList<Osoba> siema = new ArrayList<Osoba>();

    public void dodaj(Osoba x) {
        siema.add(x);
        n++;
    }

    public boolean nalezy(Osoba x) {
        for (Osoba o : siema) {
            if (x.jestRowny(o))
                return true;
        }
        return false;
    }

    public int podajIlosc() {
        return n;
    }

    public void pokazWszystkie() {
        for (Osoba o : siema) {
            System.out.println(o.toString());
        }
    }
}
