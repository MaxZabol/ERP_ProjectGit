package src.ruslan.Week9;

import java.util.Arrays;

public class T1_ConcatTwoArrays {
    /*
       1.Array - Concat two arrays
       Write a return method that can concat two arrays.
    */

    public static void main(String[] args) {

        System.out.println(Arrays.toString(concatTwoArrays(new int[]{10, 20, 30, 40, 50, 60}, new int[]{70, 80, 90})));

    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }
}
