package wyklad_16_11;

public class TestPrzeglad<T> implements Przegladalny<T>{
    int ile = 5;
    Object[] tablica = {7, 72, 44, 12, 32};

    @Override
    public Przegladacz<T> obiektPrzegladania() {
        Przegladacz<T> przeg = new Przegladacz<T>() {
            private int wskaznik = 0;
            @Override
            public boolean maWiecej() {
                return wskaznik < tablica.length;
            }

            @Override
            public T nastepny() {return (T)tablica[wskaznik++];}
        };
        return przeg;
    }

    public static void main(String[] args) {

    }
}
