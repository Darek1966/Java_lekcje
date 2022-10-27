public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {

        int number = 0;

        if (number > 0){
            System.out.println("Liczba dodatnia");
        } else if (number < -5){
            System.out.println("Liczba mniejsza od -5");
        } else if (number == 0){
            System.out.println("Liczba równa zero");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
// jeżeli dwa warunki bedą spełnione, to wykona się tylko jeden (ten pierwszy)
