public class User {

    public String username;
    public String password;

    // metoda ukryta (nie trzeba jej zapisywać)
    // działa wewnątrz javy (wpisana dla testu)
    public User(String bartek, String hallo){
        System.out.println("Hello z konstruktora");
    }

    public void sayHello() {
        System.out.println("Hello me name is: " + username);
    }
}
