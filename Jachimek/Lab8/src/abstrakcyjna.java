import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Locale;

public abstract class abstrakcyjna <E> {

    LocalDate teraz = LocalDate.now();
    String napis = "abcd";
    public abstract void dodaj(E x);
    public abstract boolean wystepuje(E x);

}
