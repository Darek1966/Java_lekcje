public class PetlaFor {

    public static void main(String[] args) {

        int number = 100;

        // i - specjalna zmienna sterująca
        // i < number - warunek do kiedy pętla się wykonuje
        // i = i + 2  - przy każdym cyklu zwiększa się o 2
       for (int i = 0; i < number; i = i + 2){
            System.out.println(i);
       }

        // i++  - zwiększamy wartość o 1
        // i % 5 == 0  - liczba podzielna przez 5
        for (int i = 0; i < number; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
            for (int j = 0; j < number; j++) {
                System.out.println("Będę robił prace domowe");
            }
        }
    }
}
