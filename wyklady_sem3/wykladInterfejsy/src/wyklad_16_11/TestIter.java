package wyklad_16_11;

import java.util.Iterator;

public class TestIter<T> implements Iterable<T>{
    int ile = 5;
    Object[] tablica = {1,23,4, 2, 32};

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {
            private int wskaznik = 0;
            @Override
            public boolean hasNext() {
                return wskaznik < tablica.length;
            }

            @Override
            public T next() {
                return (T)tablica[wskaznik++];
            }
        };
        return iter;
    }

    public static void main(String[] args) {
        TestIter<Integer> c1 = new TestIter<Integer>();
        Iterator<Integer> i1 = c1.iterator();
        while(i1.hasNext())
            System.out.println(i1.next());
    }
}
