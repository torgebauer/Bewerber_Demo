public class Sparbuch implements Konto {


    private int kontostand;
    private int kontoInhaberId;


    public Sparbuch(int kontostand, int kontoInhaberId) {
        this.kontostand = kontostand;
        this.kontoInhaberId = kontoInhaberId;
    }


    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getKontoInhaberId() {
        return kontoInhaberId;
    }

    public void setKontoInhaberId(int kontoInhaberId) {
        this.kontoInhaberId = kontoInhaberId;
    }

    /**
     * Überträgt Geld nur an GiroKonten des gleichen Users
     */
    public void uebertrag(){
        //
    }
}
