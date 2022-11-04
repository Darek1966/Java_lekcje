public class ReadOnly {

    private String name = "Darek";

    // Getter - umożliwia pobranie wartości pola private
   /* public String getName() {   // Getter
        name = name + "jest ok!";
        return name;
    }*/
    // Setter - umożliwia ustawienie wartości pola prywatnego
    public void setName(String name) {  // Setter
        this.name = name;
    }
}
// Alt + Insert -> można automatycznie wstawiać Getter i Setter
