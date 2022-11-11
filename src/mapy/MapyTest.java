package mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Jan");
        students.put(2, "Tom");
        students.put(3, "Jerzy");
        students.put(2, "Franek");      // nadpisze 'Tom" i będzie 'Franek'

        System.out.println(students.get(1));
        System.out.println(students.get(2));

        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("Tom"));
        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.remove(3);
        System.out.println(students.size());

        for (Integer key : students.keySet() ) {
            System.out.println(key);
            System.out.println(students.get(key));
        }
        for (String zmienna : students.values()) {
            System.out.println(zmienna);
        }
    }
}
