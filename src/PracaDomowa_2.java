import java.util.Scanner;
/* Zapytaj użytkownika o wiek.
W przypadku gdy ma mniej niż 18 lat wpisz na ekranie informację, że nie możesz kupić alkoholu.
Gdy ma więcej niż 18 lat, to podziękuj za zakupy.
 */
public class PracaDomowa_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę, podaj ile masz lat: ");
        int age = scanner.nextInt();

        if (age < 18 && age > 0){
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age <= 0){
            System.out.println("Wprowadź wartość dodatnią");
        } else {
            System.out.println("Dziękuję za zakup. Zapraszam ponownie!");
        }
    }
}
