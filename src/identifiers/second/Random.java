package identifiers.second;

import identifiers.first.Parent;

public class Random {

    // klasa w innej paczce nie ma dostepu do pól/metod private  oraz default, czyli bez identyfikatora i protected
    public void testIdentifier() {
        Parent parent = new Parent();

        System.out.println(parent.first);
        //System.out.println(parent.second);  // brak dostepu
        //System.out.println(parent.third);   // brak dostępu

        parent.firstMethod();
        //parent.secondMethod();  // brak dostępu
        //parent.thirdMethod();   // brak dostępu
    }
}
