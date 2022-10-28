public class DebugowanieKodu {

    public static void main(String[] args) {

        int[] tab = new int[]{1, 3, 5, 7, 0};

        for (int i = 0; i < (tab.length / 2); i++) {
            int temp = tab[i];  // dla i=0 jest 1, i=1 jest 3
            tab[i] = tab[tab.length - 1 - i];   // 4 - 0, 3 - 7
            tab[tab.length - 1 - i] = temp; // 1 // tab[3]=3

            System.out.println("Iteracja tab " + i);

        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
