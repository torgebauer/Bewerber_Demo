class KontoService {
    companion object {
        @JvmStatic
        fun findMinKontoByInhaber(konten: MutableList<Konto>, i: Int): Konto? {
            return konten.filter { it.kontoInhaberId == i }.minByOrNull { it.kontostand }
        }
    }
}