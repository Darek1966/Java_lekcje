public class PersonTest {       // klasa wykonywalna

    // metoda wykonywalna main
    public static void main(String[] args) {
        MachTeacher teacher = new MachTeacher("Jan", 29, "AGH");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMatch();

        Footballer footballer = new Footballer("Robert", 29, "Legia");
        footballer.walk();
        footballer.eat();
        footballer.sayHello();
        footballer.playFootball();
    }
}
