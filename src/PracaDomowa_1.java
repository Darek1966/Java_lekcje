import java.util.Scanner;

public class PracaDomowa_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę, podaj pierwszą liczbę całkowitą: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Proszę, podaj drugą liczbę całkowitą: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = firstNumber % secondNumber;

        System.out.println("Suma liczb to: " + addition);
        System.out.println("Różnica liczb to: " + subtraction);
        System.out.println("Iloczyn liczb to: " + multiplication);
        System.out.println("Iloraz liczb to: " + division);
        System.out.println("Modulo liczb to: " + mod);
    }
}
