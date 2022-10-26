import java.util.Scanner;

public class CustomScanner {

    public static void main(String[] args) {

        // klasa Scanner

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        // pobierze wpisaną wartość w terminalu i wyświetli przywitanie
        System.out.println("Cześć: " + name + " !");*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę, podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        int wynik = firstNumber * firstNumber;

        System.out.println("Kwadrat tej liczby to: " + wynik);
        System.out.println("Kwadrat tej liczby to: " + firstNumber * firstNumber);  // 2 sposób
    }
}
