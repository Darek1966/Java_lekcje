public class Person {

    public String name;
    public int age;

    // konstruktor nowy
    public Person (String name, int age) {
        System.out.println("Jestem w konstruktorze Person");
        this.name = name;
        this.age = age;

    }

    public void eat() {
        System.out.println("Lubię jeść pizzę");
    }
    public void walk() {
        System.out.println("Lubię spacerować");
    }
}
