public class UserTest {

    public static void main(String[] args) {

        User user = new User("Bartek", "Hallo");     // konstruktor
        user.username = "Bartek";
        user.password = "QWERTY";

        user.sayHello();
    }
}
