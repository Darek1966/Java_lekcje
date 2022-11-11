package zadania;

import java.util.HashMap;
import java.util.Map;

public class ZliczenieWystapien {

    // int[] numbers = new int[] {1, 2, 3, 2, 5, 3}

    public static void main(String[] args) {
        liczWystapienia(new int[] {1, 2, 3, 2, 5, 3, 7, 7, 13, 2});

    }
    public static void liczWystapienia(int[] numbers) {
        Map<Integer, Integer> wystapienia = new HashMap<>();

        for (int i=0; i<numbers.length; i++) {
            if (wystapienia.containsKey(numbers[i])) {
                Integer values = wystapienia.get(numbers[i]);
                wystapienia.put(numbers[i], values + 1);
            } else {
                wystapienia.put(numbers[i], 1);
            }
        }
        for (Integer key : wystapienia.keySet()) {
            System.out.println("Liczba: " + key + " wystęuje: " + wystapienia.get(key) + " razy");
        }
        System.out.println("Ilość elementów unikalnych w mapie: " + wystapienia.size());
    }
}
