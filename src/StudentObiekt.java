// Stwórz 3 obiekty klasy Student.
// Przypisz wartości do pól.
// Stwórz tablicę i dodaj studentów do tablicy.
// Przejdź przez studentów w tablicy.
// Wywołaj metody z klasy Student.
public class StudentObiekt {

    public static void main(String[] args) {

        Student student_1 = new Student();  // obiekt 1
        student_1.imie = "Jan";
        student_1.nazwisko = "Kot";
        student_1.nick = "Kocur";
        student_1.email = "kot@wp.pl";
        student_1.numerIndeksu = 1111;

        Student student_2 = new Student();  // obiekt 2
        student_2.imie = "Tadeusz";
        student_2.nazwisko = "Nowak";
        student_2.nick = "Noki";
        student_2.email = "nowak@op.pl";
        student_2.numerIndeksu = 2222;

        Student student_3 = new Student();  // obiekt 3
        student_3.imie = "Adam";
        student_3.nazwisko = "Duda";
        student_3.nick = "Debil";
        student_3.email = "duda@onet.pl";
        student_3.numerIndeksu = 3333;

        Student[] osoba = new Student[3];   // tablica
        osoba[0] = student_1;
        osoba[1] = student_2;
        osoba[2] = student_3;

        for (int i = 0; i < osoba.length; i++) {    // przejście przez studentów w tablicy
            osoba[i].przedstawSie();                // wywołanie metod
            osoba[i].zalogujSie();
            osoba[i].podajNrIndeksu();
        }
    }
}
