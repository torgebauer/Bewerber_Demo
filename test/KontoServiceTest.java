import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class KontoServiceTest {


    public static final int KONTO_INHABER_1 = 1;
    public static final int KONTO_INHABER_2 = 2;
    private List<Konto> konten;


    @Before
    public void init(){
        konten = List.of(
                new GiroKonto(1000, KONTO_INHABER_1),
                new GiroKonto(4000, KONTO_INHABER_1),
                new Sparbuch(10000, KONTO_INHABER_1),
                new GiroKonto(1000, KONTO_INHABER_2),
                new Sparbuch(2000, KONTO_INHABER_2)
        );

    }


    @Test
    public void testKontenSummeGesamt(){
        Assert.assertEquals(18000, KontoService.summeAllerKonten(konten));
    }



    @Test
    public void testKontenSummeByKontoInhaber(){
        Assert.assertEquals(15000, KontoService.summeAlleKontenByKontoinhaber(konten, KONTO_INHABER_1));
    }



    @Test
    public void testExtractKontoInhaberFromKonto(){
        List<Kontoinhaber> expected = List.of(new Kontoinhaber(1), new Kontoinhaber(2));
        Assert.assertEquals(expected, KontoService.extractKontoInhaberFromKonten(konten));
    }



    @Test
    public void testFindMinKontoByInhaber(){
          Assert.assertEquals(konten.get(0), KontoService.findMinKontoByInhaber(konten, KONTO_INHABER_1));
    }





}