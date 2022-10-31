public class Nazwa {

    public String imiemoje;
    public String haslomoje;


    public Nazwa() {
    }

    //public Nazwa(String imie, String haslo) {  // zakomentowane dla this
    public Nazwa(String imiemoje, String haslomoje) {
        System.out.println("Hello z konstruktora");
        this.imiemoje = imiemoje;
        this.haslomoje = haslomoje;

        //imiemoje = imie;      // zakomentowane dla this
        //haslomoje = haslo;
    }
    public void nazwaHallo() {
        System.out.println("Hello me name is: " + imiemoje);
    }
}
