public class GiroKonto implements Konto {


    private int kontostand;
    private int kontoInhaberId;


    public GiroKonto(int kontostand, int kontoInhaberId) {
        this.kontostand = kontostand;
        this.kontoInhaberId = kontoInhaberId;
    }

    @Override
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
     * Überweist Geld an alle Arten von Konten
     */
    public void ueberweisen(){
        //
    }
}
