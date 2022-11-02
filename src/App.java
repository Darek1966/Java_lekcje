public class App {

    public String name;

    // Alt + Insert > Construktor > name - tworzy automatycznie
    public App(String name) {
        this.name = name;
    }

    public void appInfo() {
        System.out.println("Uruchomiona aplikacja nazywa się: " + name);
    }
}
