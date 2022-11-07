package exceptions;

import java.util.Scanner;

public class ExceptionsCheck {

    public static void main(String[] args) throws InvalidAgeException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj ile masz lat: ");
        int age = scanner.nextInt();
        if (age<0) {
            throw  new InvalidAgeException("Podany wiek jest nieprawidłowy");
        }
        if (age>=18) {
            System.out.println("Jesteś pełnoletni");
        } else {
            System.out.println("Jesteś niepełnoletni");
        }
    }
}
