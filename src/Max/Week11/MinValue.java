package Max.Week11;

import java.util.HashMap;
import java.util.Map;

public class MinValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
                map.put("q", 11);
        map.put("w", 11);
        map.put("e", 4);
        map.put("r", 35);
        map.put("t", 2);
        map.put("y", 45);
        map.put("u", 22);
        map.put("i", 6);
        System.out.println(Min(map));
    }

    public static Integer Min(Map<String, Integer> map){

        Integer minNum =map.get("w");
       for(Map.Entry<String, Integer> entry:map.entrySet()){
           if(entry.getValue()<minNum)
               minNum= entry.getValue();}
       return minNum;
    }
}
