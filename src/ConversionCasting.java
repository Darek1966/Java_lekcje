import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ConversionCasting {

    public static void main(String[] args) {

        int a = 2;
        double b = 4.23;

        double c = a/b; // int a nie jawnie jest konwertowany na double (a = 2.00)
        // wynik 0.47281323877068554

        int d = a/(int) b;   // konwersja double na int (b = 4)
        // wynik 0

        System.out.println(c);
        System.out.println(d);

        // inny przykład
        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;   // () - konwersja
        firefoxDriver.get();
    }
}
