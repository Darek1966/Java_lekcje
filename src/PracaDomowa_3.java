public class PracaDomowa_3 {

    // wypisz liczby z zakresu 1 - 100 podzielne przez 3
   /* public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println("Jestem podzielna przez 3: " + i);
            }
        }
    }
}*/

    // odwróć elementy tablicy [1, 3, 5] - [5, 3, 1]
    public static void main(String[] args) {
        int[] tab = new int[]{1, 3, 5};

        for (int i = 0; i < (tab.length / 2); i++) {
            int temp = tab[i];  // dla i=0 jest 1
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
