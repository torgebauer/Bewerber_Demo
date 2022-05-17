import java.util.Objects;

public class Kontoinhaber {
    private int kontoInhaberId;

    public Kontoinhaber(int kontoInhaberId) {
        this.kontoInhaberId = kontoInhaberId;
    }

    public int getKontoInhaberId() {
        return kontoInhaberId;
    }

    public void setKontoInhaberId(int kontoInhaberId) {
        this.kontoInhaberId = kontoInhaberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontoinhaber that = (Kontoinhaber) o;
        return kontoInhaberId == that.kontoInhaberId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kontoInhaberId);
    }
}
