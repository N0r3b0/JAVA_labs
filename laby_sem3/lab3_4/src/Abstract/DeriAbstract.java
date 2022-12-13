package Abstract;

import java.util.ArrayList;

public class DeriAbstract extends Abstract<Osoba> {
    public static ArrayList<Osoba> list = new ArrayList<Osoba>();
    public void add(Osoba x) {list.add(x);}
    public boolean exists(Osoba x){
        for (Osoba o : list) {
            if (o.equals(x)) { return true; }} return false;
    }
    @Override
    public void remove(Osoba x) {
        // TODO Auto-generated method stub

    }

}
