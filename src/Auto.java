public class Auto {    // klasa

    public String marka;
    public String model;
    public int rok;
    public  int przebieg;

    // dodajemy konstruktor
    public Auto(String marka, String model, int rok, int przebieg) {
        // dodajemy this
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
    }
    public void jedz(){
        System.out.println("Jedz!");
    }
    public void hamuj(){
        System.out.println("Hamuj!");
    }
    public void info(){
        System.out.println("Marka to: " + marka);
        System.out.println("Model to: " + model);
        System.out.println("Rok produkcji to: " + rok);
        System.out.println("Przebieg to: " + przebieg);
    }
}
