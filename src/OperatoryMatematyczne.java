public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4;

        int addition = firstNumber + secondNumber;  // 10
        int subtraction = secondNumber - firstNumber;   // 2
        int multiplication = firstNumber * secondNumber; // 24
        int division = secondNumber / firstNumber;  // 1
        float div = secondNumber / thirdNumber;  // 1.5
        int mod = secondNumber % firstNumber;   // 2

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnożenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik dzielenia: " + div);
        System.out.println("Wynik modulo: " + mod);

        // zmienna się nadpisuje
        firstNumber+=secondNumber;
        System.out.println(firstNumber);    // 10
        firstNumber-=secondNumber;
        System.out.println(firstNumber);    // 4
        firstNumber*=secondNumber;
        System.out.println(firstNumber);    // 24
        firstNumber/=secondNumber;
        System.out.println(firstNumber);    // 4
        firstNumber%=secondNumber;
        System.out.println(firstNumber);    // 4
    }
}
