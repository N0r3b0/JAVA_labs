package Abstract;

import java.time.LocalDate;

public abstract class Abstract<Element>{
    LocalDate now = LocalDate.now();
    String writing = "abcd";
    public abstract void add(Element x);
    public abstract boolean exists(Element x);
    public abstract void remove(Element x);
}