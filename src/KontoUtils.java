import java.util.List;
import java.util.stream.Collectors;

public class KontoUtils {


    public static int summeAllerKonten(List<Konto> konten) {
        return konten.stream().mapToInt(Konto::getKontostand).sum();
    }

    public static List<Kontoinhaber> extractKontoInhaberFromKonten(List<Konto> konten) {
        return konten.stream().map(konto -> new Kontoinhaber(konto.getKontoInhaberId())).distinct().collect(Collectors.toList());
    }

    public static int summeAlleKontenByKontoinhaber(List<Konto> konten, int kontoInhaber) {
        return konten.stream().filter(konto -> konto.getKontoInhaberId() == kontoInhaber).mapToInt(Konto::getKontostand).sum();
    }
}
