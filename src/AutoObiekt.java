public class AutoObiekt {

    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes", "190D", 2015, 140000);
        /*mercedes.marka = "Mercedes";  // zakomentowane dla pracy domowej - 55
        mercedes.model = "190D";
        mercedes.rok = 2015;
        mercedes.przebieg = 140000;*/

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi", "100", 1995, 250000);
        /*audi.marka = "Audi";  // zakomentowane dla pracy domowej - 55
        audi.model = "100";
        audi.rok = 1995;
        audi.przebieg = 250000;*/

        audi.info();
    }
}
