package Max.Week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write long digit");
        String str = input.nextLine();
        String[] StringDigit = str.split("");
        int[] digits = new int[StringDigit.length];
        for (int i = 0; i < StringDigit.length; i++) {
            digits[i] = Integer.parseInt(StringDigit[i]);
        }
        System.out.println(Arrays.toString(sortArray(digits)));


    }
    // Given         Array 1      8,3,7,5,6,3,4
    //   convert     ArrayList    3,,5,,3,4
    //   result      Array 2      8 7 7 6

    public static int[] sortArray(int[] arr) {

        List<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        int[] result = new int[arr.length];
        int index = 0;
        do {
            int maxNum = arrList.get(0);
            int k = 0;
            for (int i = 1; i < arrList.size(); i++) {

                if (maxNum < arrList.get(i)) {
                    maxNum = arrList.get(i);
                    k = i;
                }
            }
            arrList.remove(k);
            result[index++] = maxNum;
        } while (arrList.size() > 0);
        return result;
    }

}
