import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

    public static void main(String[] args) {
        // try - próbuj wykonać kod (może wyrzucić wyjątek)
        try {
            System.out.println("Przed odczytaniem pliku");
            readFile("/sd/ssd.text.txt");
            System.out.println("Zamykamy plik");
            // catch - jak wyrzuci wyjątek to łapiemy go i określamy co ma się stać
            // jak scieżka będzie prawidłowa, catch nie wykona się
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage()); // pobieramy wiadomość dot. wyjątku

        } finally {     // finally - wykona się zawsze (niezależnie, czy będzie wyjątek czy nie)
            System.out.println("Zamykamy plik");
        }
    }
    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }
}
