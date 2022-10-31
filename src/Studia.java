public class Studia {

        public String imie;
        public String nazwisko;
        public String nick;
        public String email;
        public int numerIndeksu;

        // pole statyczne, przypisane do klasy Studia
        public static String nazwaUczelni = "AGH";

        public void przedstawSie(){
            System.out.println("Nazywam się: " + imie +" " + nazwisko);
        }
        public void zalogujSie(){
            System.out.println("Loguję się za pomocą email: " + email + " oraz nick: " + nick);
        }
        public void podajNrIndeksu(){
            System.out.println("Numer indeksu to: " + numerIndeksu);
        }
        // metoda statyczna
        public static void infoUczelnia() { System.out.println("Moja uczelnia to: " + nazwaUczelni); }
}
