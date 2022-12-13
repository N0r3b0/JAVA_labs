public class Main {

    public static void main(String[] args) {

        TestOb test1 = new TestOb();
        TestOb test2 = new TestOb();
        System.out.println(test2.toString());

        illiasowanie x =  new iliasowanie();
        illiasowanie y =  new iliasowanie();

        x=y;

        System.out.print(y.equals(x));
    }
}