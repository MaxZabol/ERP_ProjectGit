package src.ruslan.week9;

import java.util.ArrayList;
import java.util.Arrays;

public class T3_RemoveValues {
    /*
      3.ArrayList - Remove some values
      Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 100, 876, 900, 510, 78, 400, 89, 205, 46, 1000, 135, 55, 1903));

        list.removeIf(p -> p > 100);

        System.out.println(list);

    }
}
