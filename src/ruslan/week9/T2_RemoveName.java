package src.ruslan.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class T2_RemoveName {
    /*
       2.ArrayList - Remove "Ahmed"
       Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
       Write a java operation to remove all the names named 'Ahmed'
    */

    public static void main(String[] args) {

        System.out.println(removeName(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Jessica", "Ahmed").toArray(new String[0])));

    }

    public static ArrayList<String> removeName(String[] arr1) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(arr1));

        names.removeIf(p -> p.equals("Ahmed"));
        return names;
    }
}
