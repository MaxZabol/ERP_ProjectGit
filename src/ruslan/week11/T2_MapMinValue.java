package src.ruslan.week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class T2_MapMinValue {

    public static void main(String[] args) {
        /*
         2. Map - Min value
         Write a method that can return the minimum value from a map (DO NOT
         use sort method).
         Ex: Input  => Map
               Key -> Value
                a  -> 11
                e  -> 6
                l  -> 3
                o  -> 2
                W  -> 1
                d  -> 1
                g  -> 8

          Output => 1
         */

        Map<String, Integer> map = Map.of("a", 11, "e", 6, "l", 3, "o", 2, "W", 1, "d", 1, "g", 8);

        int min = Integer.MAX_VALUE;
        List<String> minKeys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                minKeys.clear();
            }
            if (entry.getValue() == min) {
                minKeys.add(entry.getKey());
            }
        }
        System.out.println("map = " + map);
        System.out.println("Minimum value = " + min);
    }
}
