public class MachTeacher extends Person {


    public String school;

    public MachTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze MachTeacher");
        this.school = school;
    }

    public void teachMatch() {       // metoda w klasie MachTeacher

        System.out.println("Ja uczę matematyki na uczelni: " + school);
    }
    public void sayHello() {
        System.out.println("Cześć, nazywam się: " + name);
        System.out.println("Mam lat: " + age);
    }
}
