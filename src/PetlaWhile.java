public class PetlaWhile {

    public static void main(String[] args) {

        int number = 0;

        // jeżeli number < 20 - true - pętla się wykonuje
        while (number < 20) {
            System.out.println("Moja wartość to: " + number + " i jestem mniejsza od 20");
            number++;   // zwiększamy number o 1 przy każdej pętli
        }
    }
}
