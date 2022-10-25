public class TypyObiektowe {

    // blok kodu
    public static void main(String[] args) {

        // liczby stałoprzecinkowe
        Byte firstNumber = 127;
        Short secondNumber = 32689;
        Integer thirdNumber = 32768999;
        Long fourthNumber = 2148000L;

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F;
        Double sixthNumber = 3.999999999999999D;

        // wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        // pojedyczy znak
        Character letter = 'A';

        // ciągi znaków
        String hello = "Hello Word";    // nie ma typu prostego

        // przykłady
        System.out.println(hello.charAt(0));
        System.out.println(hello.contains("Hello"));    // true
    }
}
