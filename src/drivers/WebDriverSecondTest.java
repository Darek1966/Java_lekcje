package drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirefox = new FirefoxDriver();

        // klasa anonimowa (nie ma nazwy - jest WebDriver)
        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Otwórz ścieżkę do safari");
            }
            @Override
            public void findElementBy() {
                System.out.println("Szukaj elementów w przeglądarce safari");

            }
        };
        safari.get();
        safari.findElementBy();
    }
}
