public class Metoda_2 {

    public int pobierzWynik() {

        System.out.println("Zaraz policzę wynik");
        int wynik = 0;

        for (int i = 0; i < 100; i++) {
            wynik = wynik + i;
        }
        System.out.println("Wynik to: " + wynik);
        return wynik;
    }
}

