package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia
        List<String> names = Arrays.asList("Tom", "John", "Mat", "Poul");
        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,4,6,8);
        IntStream intStream = IntStream.range(1,100);

        // przetwarzanie danych
        // filter - filtrowanie danych
        // map - może zmienić każdy element na coś innego
        // limit - zwraca określoną liczbę elementów
        // peek - pozwala przeprowadzić operację na każdym elemencie

        // forEach - wykonanie akcji dla każdego elementu strumienia
        // count - zwróci ilość elementów w strumieniu
        // allMatch - czy wszystkie elementy strumienia spełniają warunek
        // collect - zwraca nowy typ na podstawie strumienia

        /*streamNames.filter(el -> el.startsWith("T"))     //lambda-tylko słowa na literę 'T'
                .map(el-> el.toUpperCase())             // zmienia litery na duże
                .forEach(el -> System.out.println(el));*/

        /*intStream.filter(el -> el>20)   // szukamy elementów większych od 20
                 .map(el -> el*2)       // zwiększamy wyszukane elementy razy 2
                 .limit(10)     // ograniczenie do 10 elementów
                 .forEach(el -> System.out.println(el));*/

        // inny sposób zakończenia strumienia
        long count = intStream.filter(el -> el>20)
                .map(el -> el*2)
                .count();
        System.out.println(count);

        List<String> modifiedNames = streamNames.filter(el -> el.startsWith("T"))
                .map(el-> el.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());
    }
}
