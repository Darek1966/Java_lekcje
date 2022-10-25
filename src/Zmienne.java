// zarezerwowane mniejsce w pamięci z określonym typem danych

public class Zmienne {

    public static void main(String[] args) {

        String name = "Bartek";
        int liczba_1 = 1;
        int liczba_2 = 2;
        int wynik = liczba_1 + liczba_2;

        name = "Florek";    // można nadpisać zmienną

        System.out.println(name);
        System.out.println(wynik);

        int liczba_3, liczba_4, liczba_5;   // można zadeklarować zmienną
        liczba_3 = 3;
        liczba_4 = 4;
        liczba_5 = 5;
        int rezultat = liczba_3 + liczba_4 + liczba_5;
        System.out.println(rezultat);
    }
}
