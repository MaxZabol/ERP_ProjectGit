package src.ruslan.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1_FrequencyOfCharacters {

    public static void main(String[] args) {
            /*
         1. Map - Frequency of Characters
         Write a method that prints the frequency of each character from a String.
         Ex: Input => "Hello World"
         Output => Map
                H -> 1
                e -> 1
                l -> 3
                o -> 2
                W -> 1
                d -> 1
         */

        characterCountMap("Hello World");
    }
    public static void characterCountMap(String input) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] strArray = input.toCharArray();

        for (char eachChar : strArray) {

            if (map.containsKey(eachChar)) {

                map.put(eachChar, map.get(eachChar) + 1);

            } else {
                map.put(eachChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
