public class FinalTest {

    public static void main(String[] args) {
        final int x = 2;    // final - nie można zmienić wartości przypisanej do tej zmiennej

        final Person person = new Person("Tim", 29);
        person.age = 25;    // tu można zmienić
        // nie możemy przypisać nowego -> new Person
    }
}
