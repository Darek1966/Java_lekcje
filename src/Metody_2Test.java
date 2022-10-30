public class Metody_2Test {

    public static void main(String[] args) {

        Metoda_2 metody = new Metoda_2();
        // metody.pobierzWynik();
        int wynik = metody.pobierzWynik();
        int wynik_2 = wynik * 2;

        System.out.println("Wynik przed mnożeniem to: " + wynik);
        System.out.println("Wynik po mnożeniu to: " + wynik_2);
    }
}
