package wyklad_16_11;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Testowa implements Iterable<String>{
    String[] x = {"Adam", "Jan", "Stanislaw", "Damian", "Wojciech"};
    @Override
    public Iterator<String> iterator() {
        return new MIterator();
    }
    class MIterator implements Iterator<String> {
        int i = 0;
        @Override
        public boolean hasNext() {
            return i < x.length;
        }

        @Override
        public String next() {
            return x[i++];
        }
    }
}


