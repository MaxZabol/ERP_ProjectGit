package Max.Week8;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write long digit");
        String str = input.nextLine();
        String[] StringDigit = str.split("");
        int[] digits = new int[StringDigit.length];
        for (int i = 0; i < StringDigit.length; i++) {
            digits[i] = Integer.parseInt(StringDigit[i]);
        }
        System.out.println("Given Array:" + Arrays.toString(digits));
        System.err.println("Sorted array: " + Arrays.toString(moveZeros(digits)));

        input.close();
    }

    public static int[] moveZeros(int[] arr) {
        int notZero = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[k] != 0) {
                        notZero = arr[k];
                        arr[i] = notZero;
                        arr[k] = 0;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}



