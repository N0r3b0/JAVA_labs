public class zarowka {
    private int napZasilania = 0;
    private int napMaksymalne = 230;

    zarowka(){}


    zarowka(int napZas, int napMax) {
        this.napZasilania = napZas;
        this.napMaksymalne = napMax;
    }
    void zapal(){
        napZasilania = napMaksymalne;}
    void zgas(){
        napZasilania = 0;}
    String drukujStan() {
        if (napZasilania > 0)
            return "ON";
        else
            return "OFF";

    }

    boolean isON(){
        if(this.napZasilania > 0)
            return true;
        else
            return false;

    }




    }


