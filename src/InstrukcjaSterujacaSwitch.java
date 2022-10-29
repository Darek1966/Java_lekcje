public class InstrukcjaSterujacaSwitch {

    public static void main(String[] args) {

        String danie = "Pizza";
/*
        switch (danie){
            case "Pizza":
                System.out.println("Cena to 22 zł");
                break;
            case "Kurczak":
                System.out.println("Cena to 35 zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9 zł");
                break;
            default:
                System.out.println("Nie ma takiego dania w karcie");*/
        // drugi - nowszy sposób
        switch (danie){
            case "Pizza" -> System.out.println("Cena to 22 zł");

            case "Kurczak" -> System.out.println("Cena to 35 zł");

            case "Frytki" -> System.out.println("Cena to 9 zł");

            default -> System.out.println("Nie ma takiego dania w karcie");
        }
    }
}
