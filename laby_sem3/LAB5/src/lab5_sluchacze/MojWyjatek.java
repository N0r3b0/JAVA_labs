package lab5_sluchacze;

public class MojWyjatek extends RuntimeException
{
    private static final long serialVersionUID = 10;

    int suma;
    int roznica;
    long sumad;
    long roznicad;

    public MojWyjatek(short x, short y)
    {
        super("Przekroczenie zakresu typu short");
        suma = (int)x + (int)y;
        roznica = (int)x - (int)y;
    }
    public MojWyjatek(int x, int y)
    {
        super("Przekroczenie zakresu typu int");
        sumad = (long)x + (long)y;
        roznicad = (long)x - (long)y;
    }
}
