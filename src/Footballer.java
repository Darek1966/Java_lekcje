public class Footballer extends Person {


    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);   // super - wywoła konstruktora klasy nadrzędnej - Person
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void playFootball() {

        System.out.println("Gram w piłkę w klubie: " + footballClub);
    }

    public void sayHello() {
        System.out.println("Cześć, nazywam się: " + name);
        System.out.println("Mam lat: " + age);
    }
}
