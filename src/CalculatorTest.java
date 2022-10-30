import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę, podaj pierwszą liczbę całkowitą: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Proszę, podaj drugą liczbę całkowitą: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        /*int dodawanie = calculator.dodawanie(firstNumber, secondNumber);
        int odejmowanie = calculator.odejmowanie(firstNumber, secondNumber);
        int mnozenie = calculator.mnozenie(firstNumber, secondNumber);
        int dzielenie = calculator.dzielenie(firstNumber, secondNumber);
        int modulo = calculator.modulo(firstNumber, secondNumber);*/

        System.out.println("Suma liczb to: " + calculator.dodawanie(firstNumber, secondNumber));
        System.out.println("Różnica liczb to: " + calculator.odejmowanie(firstNumber, secondNumber));
        System.out.println("Iloczyn liczb to: " + calculator.mnozenie(firstNumber, secondNumber));
        System.out.println("Iloraz liczb to: " + calculator.dzielenie(firstNumber, secondNumber));
        System.out.println("Modulo liczb to: " + calculator.modulo(firstNumber, secondNumber));
    }
}
