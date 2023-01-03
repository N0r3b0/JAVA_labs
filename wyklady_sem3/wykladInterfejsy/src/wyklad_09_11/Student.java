package wyklad_09_11;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Student extends Osoba implements Comparable<Student>{
    double średnia = 4.01;

    Collator porównywacz = Collator.getInstance(new Locale("pl"));

   static Comparator<Student> comp = new Comparator<Student>() {
       @Override
       public int compare(Student o1, Student o2) {
           if(o1.średnia > o2.średnia) return 1;
           else if (o1.średnia < o2.średnia) return -1;
           else return 0;
       }
   };
    @Override
    public int compareTo(Student o) {
        int x = porównywacz.compare(this.nazwisko, o.nazwisko);
        int y = porównywacz.compare(this.imie, o.imie);
        int z = porównywacz.compare(this.dataUr, o.dataUr);
        
        if(x != 0) return x;
        else if (y != 0) return y;
        else return z;
    }
    public String toString(){
        return nazwisko + " " + imie + " " + dataUr + " " + średnia;
    }
}
