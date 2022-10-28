public class PetlaDoWhile {

    public static void main(String[] args) {

        int number = 5;

        // najpierw wykonujemy kod, a później sprawdzamy warunek while
        do {
            System.out.println("Moja wartość to: " + number + " i jestem mniejsza od 20");
            number++;
        } while (number < 20);
    }
}
