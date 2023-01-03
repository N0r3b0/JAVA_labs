package lab5_sluchacze;

public class MojWyjatekzm extends RuntimeException
{
    private static final long serialVersionUID = 10;

    double iloraz;

    public MojWyjatekzm(float x, float y)
    {
        super("Przekroczenie zakresu wartosci zmiennopozycyjnych");
        if(y == 0.0)
                iloraz = Double.MAX_VALUE;
        else iloraz = (double)x / (double)y;
    }
}
