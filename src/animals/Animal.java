package animals;

public abstract class Animal {      // klasa abstrakcyjna

    public final static int legs = 4;   // legs - ilość nóg

    public abstract void sound();   // metoda abstrakcyjna

    public void sayHello() {
        System.out.println("Cześć, jestem zwierzęciem");
    }
}
