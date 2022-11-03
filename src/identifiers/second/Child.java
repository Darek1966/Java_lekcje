package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostepu do pól/metod private oraz default, czyli bez identyfikatora
    public void testIdentifier() {
        System.out.println(first);
        // System.out.println(second);  // brak dostepu
        System.out.println(third);
        // System.out.println(fourth);  // brak dostępu do pola prywatnego
        firstMethod();
        // secondMethod();      // brak dostepu
        thirdMethod();
        // fourthMethod();      // brak dostępu do metody prywatnej
    }
}

