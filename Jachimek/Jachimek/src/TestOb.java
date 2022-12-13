
public class TestOb extends  Object{

    public static int aaa = 10;
    @Override
    public boolean equals(Object obj){
        return this.aaa==((TestOb)obj).aaa;

    }
    @Override
    public String toString() {
        return "Test metody toString " + this.aaa;
    }
}
