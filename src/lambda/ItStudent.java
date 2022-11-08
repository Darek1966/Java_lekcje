package lambda;

public class ItStudent implements Student {


    @Override
    public void sayHello(String name) {
        System.out.println("Jestem chłopcem z it");
        System.out.println("Mam na imię: " + name);
    }
}
