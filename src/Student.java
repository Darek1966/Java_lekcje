public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSie(){
        System.out.println("Nazywam się: " + imie +" " + nazwisko);
    }
    public void zalogujSie(){
        System.out.println("Loguję się za pomocą email: " + email + " oraz nick: " + nick);
    }
    public void podajNrIndeksu(){
        System.out.println("Numer indeksu to: " + numerIndeksu);
    }
}
