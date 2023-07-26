package Max.Week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSomeValues {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 200; i++) {
            arr.add(i);
            }
        arr.removeIf(p->p>100);
        System.out.println("arr = " + Arrays.deepToString(new ArrayList[]{arr}));
    }
}
