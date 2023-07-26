package Max.Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Max","Ahmed", "Super_Max", "Viva_Max", "ahmed", "Oh_Max", "The Greatest Max Ever"));
        System.out.println("Result="+Arrays.deepToString(new ArrayList[]{removeAhmed(names)}));

    }

    public static ArrayList<String> removeAhmed (ArrayList<String> Arr){
        Arr.removeIf(p->p.equalsIgnoreCase("Ahmed"));
        return Arr;



    }
}
