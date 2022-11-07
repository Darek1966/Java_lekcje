package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        WebDriver driver = getDriver("chrome");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
    private static WebDriver getDriver(String name) throws NoValidBrowserName {
        if(name.equals("chrome")) {   // equals - sprawdzenie równości String-ów
            return new ChromeDriver();
        } else if(name.equals("firefox")) {
            return new FirefoxDriver();
        }
        // return null; // zakomentowane - tworzę wyjątek własny (lekcja 80)
        throw new NoValidBrowserName("Brak prawidłowej nazwy przeglądarki");
    }
}
