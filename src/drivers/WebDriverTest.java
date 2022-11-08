package drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        // przechodzimy po wartościach w Enum
        DriverType[] driverTypes = DriverType.values();
        for (int i=0; i<driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
    // pierwszy sposób
    /*private static WebDriver getDriver(DriverType type) {
        if (type == DriverType.CHROME) {
            return new ChromeDriver();
        }
            return new FirefoxDriver();
    }*/
    // drugi sposób
    private static WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new ChromeDriver();
        }
        System.out.println(type.path);
        return new FirefoxDriver();
    }
}
