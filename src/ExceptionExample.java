import drivers.ChromeDriver;
import drivers.FirefoxDriver;
import drivers.WebDriver;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] numbers = new int[2]; // tablica - długość 2 elementy
        numbers[0] = 1;
        numbers[1] = 3;

       /* for(int i=0; i<= numbers.length; i++) {
            System.out.println(numbers[i]);*/
            /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
            at ExceptionExample.main(ExceptionExample.java:10)*/
        // indeks do którego się odwołujemy jast poza naszą tablicą (index -3)

       /* for (int i = 0; i < numbers.length; i++) {  // tak powinno być
            System.out.println(numbers[i]);
        }*/

        WebDriver driver = getDriver("chrom"); // zła nazwa przeglądarki
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
    }
        private static WebDriver getDriver (String name){
            if (name.equals("chrome")) {
                return new ChromeDriver();
            } else if (name.equals("firefox")) {
                return new FirefoxDriver();
            }
            return null;
    }
}
   /* Exception in thread "main" java.lang.NullPointerException: Cannot invoke "drivers.WebDriver.get()" because "driver" is null
        at ExceptionExample.main(ExceptionExample.java:25)
*/
