package Abstract;

public class Main
{
    public static void main(String[] args) {
        DeriAbstract obiekt = new DeriAbstract();
        obiekt.add(new Osoba("Kowal", "Zbigniew", "2003-11-11"));
        Osoba nowa = new Osoba("Kowalinski", "Zbigniew", "2011-11-12");
        obiekt.add(nowa);
        Osoba nowa1 = new Osoba("zbigniewski", "krystai", "2012-11-11");
        //System.out.println("równośc" + nowa.jestRowny();

    }
}
