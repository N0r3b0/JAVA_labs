public class Main
{
    public static void main(String[] args)
    {
        /*
        TestOB object1 = new TestOB();
        //TestOB object2 = new TestOB();
        object1.number = 6;
        //object2.number = 2;
        //object2 = object1;
       // System.out.println(object1.equals(object2));
        System.out.println(object1.toString());
        TestOB object2=object1;
        object2.number = 5;
        System.out.println(object1 + "   " + object2);
         */
        /*Klasa1 test = new Klasa1();
        test.number = 99;
        Klasa2 test1 = new Klasa2();
        test1.number = 123;

        System.out.println(test1.okreslSume());

         */
        /*K8_K object = new K8_K();
        System.out.println("" + object);
        K8_K object2 = new K8_K(123);
        System.out.println(object2);
         */
        Klasa2 object = new Klasa2();
        object.wartoscKlasa1(123);
        System.out.println("Suma = " + object.okreslSume());
        System.out.println(object);
        Klasa2 object1 = new Klasa2();
        Klasa2 object3 = new Klasa2();
        System.out.println(object1 + "utworzono " + Klasa2.ile);
    }
}

class TestOB extends Object
{
    public int number = 5;


    public boolean equals (TestOB obj)
    {
        return this.number == obj.number;
    }

    public String toString()
    {
        return String.valueOf(this.number);
    }

}

class Klasa1
{
    int number = 23;
    public String toString()
    {
        return "klasa bazowa " + this.getClass().getName() + "\n";
    }
    static class KlasaWew
    {
        //int number = 22;
        public String toString()
        {
            return "klasa bazowa " + this.getClass().getName() + "\n";
        }
    }
}

class Klasa2 extends Klasa1
{
    int number = 553;
    static int ile = 0;
    public Klasa2() {ile++;}
    public void wartoscKlasa1(int a) {super.number = a;}
    public void wartoscKlasa2(int a) {this.number = a;}
    public int okreslSume() {return super.number + this.number;}
    public String toString ()
    {
        return super.toString();
    }
}

class K8_K
{
    public int number = 111;
    public K8_K(int x) {number = x;} //konstruktor 1
    public K8_K() {}                 //konstruktor 2

    public String toString()
    {
        return "number = " + number;
    }



}



