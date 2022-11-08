package lambda;

public class StudentTest {

    // pierwszy sposób
    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("Tmasz", it);

        // drugi sposób
        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("Jestem przyszłym doktorem");
                System.out.println("Mam na imię: " + name);
            }
        };
        sayHello("Jan", med);

        // trzeci sposób - lambda
        // (parametr) -> to co ma się wykonać np. System.out.println("Mam na imię: " + name);
        // więcej linii w { }
        Student noStudent = (name) -> System.out.println("Ja nie jestem studentem, mam na imię: " + name);
        sayHello("Tom", noStudent);
    }

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }
}
