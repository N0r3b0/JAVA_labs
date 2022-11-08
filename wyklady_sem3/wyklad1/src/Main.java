public class Main
{
    public static void main(String[] args)
    {
        Osoba maciek = new Osoba("Maciek", 23, 30);
        Student marian = new Student("umg", 2, 3);
        marian.imie = "Marian";
        System.out.println(maciek);
    }

}
class Osoba
{
    String imie = "";
    int wiek;
    int dataur;
    public Osoba(String imie, int wiek, int dataur)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.dataur = dataur;
    }
    public Osoba(){};


}
class Student extends Osoba
{
    String nazwaUcz = "";
    int srednia;
    int grupa;
    public Student(String nazwaUcz, int srednia, int grupa)
    {
        this.nazwaUcz = nazwaUcz;
        this.grupa = grupa;
        this.srednia = srednia;
    }

    @Override
    public String toString()
    {
        return imie + " " + " wiek " + dataur + " grupa: " + grupa + " srednia: " + srednia;
    }

}
