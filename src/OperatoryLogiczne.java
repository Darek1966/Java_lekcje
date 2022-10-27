public class OperatoryLogiczne {

    public static void main(String[] args) {
        /*
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;
        */
        // wartości logiczne mogą też zwracać operatory porównania
        boolean firstValue = 2 > 1;
        boolean secondValue = 3 < 2;
        boolean thirdValue = 5 < 4;
        boolean fourthValue = 5 > 1;

        // && - operator 'i'
        System.out.println(firstValue && secondValue);  //false
        System.out.println(firstValue && fourthValue);  // true

        // || - operator 'lub'
        System.out.println(firstValue || secondValue);  // true
        System.out.println(thirdValue || secondValue);  // false

        // ! - operator 'zaprzeczenie - negacja'
        // - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(! firstValue);   // false
        System.out.println(! secondValue);   // true
        System.out.println(!( firstValue && secondValue));   // true
    }
}
