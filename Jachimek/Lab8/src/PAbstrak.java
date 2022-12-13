import java.util.ArrayList;

public class PAbstrak extends abstrakcyjna<Osoba>{

    public static ArrayList<Osoba> lista = new ArrayList<Osoba>();

    public void dodaj (Osoba x){lista.add(x);}
    public boolean wystepuje(Osoba x){
        for(Osoba xx:lista) {
            if (xx.jestRowny(x))
                return true;
        }
        return false;
        }
    }

