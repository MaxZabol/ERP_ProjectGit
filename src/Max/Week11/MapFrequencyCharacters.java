package Max.Week11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapFrequencyCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = input.nextLine();
        String trimedString="";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i)))
                trimedString+=sentence.charAt(i);
        }
        System.out.println(Frequency(trimedString));
    }

    public static Map<Character, Integer> Frequency(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                Integer num = map.get(str.charAt(i));
                map.put(str.charAt(i), num + 1);
            }else  {map.put(str.charAt(i), 1);}
        }
        return map;
    }
}
