public class Metody_3Test {

        public static void main(String[] args) {

            Metoda_3 metody = new Metoda_3();
            metody.policzWynikParam(10);
            metody.policzWynikParam(100);
            metody.policzWynikParam(1000);
            // różne sposoby wywołania wyniku
            /*metody.add(2, 6);
            System.out.println(metody.add(4, 7));
            int wynik = metody.add(5, 9);   // przypisanie do zmiennej
            System.out.println(wynik);*/

            metody.add(2, 6, "Będziemy liczyć!");
            System.out.println(metody.add(4, 7, "Liczymy"));
            //int wynik = metody.add(5, 9);   // przypisanie do zmiennej
            //System.out.println(wynik);
        }
    }
