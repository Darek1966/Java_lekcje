public class AutoObiekt {

    public static void main(String[] args) {

        Auto mercedes = new Auto();     // typ obiektowy
        mercedes.marka = "Mercedes";
        mercedes.model = "190D";
        mercedes.rok = 2015;
        mercedes.przebieg = 140000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "100";
        audi.rok = 1995;
        audi.przebieg = 250000;

        audi.info();
    }
}
