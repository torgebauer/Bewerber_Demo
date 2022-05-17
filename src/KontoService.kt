class KontoService {

    companion object{
        @JvmStatic
        fun summeAllerKonten(konten: MutableList<Konto>): Int {
            return konten.sumOf { k -> k.kontostand }

        }

        @JvmStatic
        fun summeAlleKontenByKontoinhaber(konten: MutableList<Konto>, kontoInhaber1: Int): Int {
            return konten.filter { k -> k.kontoInhaberId == kontoInhaber1 }.sumOf { k -> k.kontostand }
        }

        @JvmStatic
        fun extractKontoInhaberFromKonten(konten: MutableList<Konto>): MutableList<Kontoinhaber> {
            val kontoinhaber: MutableSet<Kontoinhaber> = mutableSetOf()
            konten.forEach { k -> kontoinhaber.add(Kontoinhaber(k.kontoInhaberId))}
            return kontoinhaber.toMutableList()
        }

        @JvmStatic
        fun findMinKontoByInhaber(konten: MutableList<Konto>, kontoInhaber1: Int): Konto {
            return konten.filter{ k -> k.kontoInhaberId == kontoInhaber1 }.minByOrNull { k -> k.kontostand } ?: throw java.lang.IllegalArgumentException()
        }

    }
}