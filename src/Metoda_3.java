public class Metoda_3 {

    public void policzWynikParam(int number) {

        System.out.println("Number ma wartość: " + number);

        System.out.println("Zaraz policzę wynik");
        int wynik = 0;

        for (int i = 0; i < number; i++) {
            wynik = wynik + i;
        }
        System.out.println("Wynik to: " + wynik);
    }

   /* public void add(int firstNumber, int secondNumber) {
        System.out.println("Suma to: " + (firstNumber + secondNumber));
    }*/
    public int add(int firstNumber, int secondNumber, String word) {
        System.out.println(word);
        System.out.println("Suma to: " + (firstNumber + secondNumber));
        if (firstNumber == 0) {
            return 0;
        }
        return firstNumber + secondNumber;
    }
}
