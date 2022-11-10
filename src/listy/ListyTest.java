package listy;

import docs.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Darek");
        names.add("Jan");
        names.add("Tomasz");
        names.add("Jan");

        System.out.println(names.get(0));   // odwołujemy się do indexu
        System.out.println(names.indexOf("Jan"));   // zwróci nr indexu
        System.out.println(names.lastIndexOf("Jan"));   // zwróci index ostatniego elementu 'Jan'
        System.out.println(names.contains("Tom"));  // czy lista zawiera 'Tom' (false)
        System.out.println(names.contains("Tomasz"));   // true
        System.out.println(names.size());   // wielkość listy (4)
        System.out.println(names.isEmpty()); // czy lista jest pusta (false)

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));   // odwołujemy się do indexu (2)
        System.out.println(numbers.indexOf(2));   // zwróci nr indexu (1)
        System.out.println(numbers.lastIndexOf(4));   // zwróci index ostatniego elementu (3)
        System.out.println(numbers.contains(2));  // czy lista zawiera '2' (true)
        System.out.println(numbers.size());   // wielkość listy (4)
        System.out.println(numbers.isEmpty()); // czy lista jest pusta (false)

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);        // doda wszystko z listy names

        List<PdfDocument> pdfDocuments = new ArrayList<>(); // można dodać obiekt innej klasy
        pdfDocuments.add(new PdfDocument());

        // przechodzenie przez elementy listy
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // inny sposób zapisu
        for (String zmienna : names) {
            System.out.println(zmienna);
        }
    }
}
