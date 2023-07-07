package Max.Week8;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Unique_Integers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array from 2 to 100:");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        int[] result = (method(array));
        System.out.println(Arrays.toString(result));
        int sum = 0;
        for (int j : result) {
            sum += j;
        }
        System.err.println("Array sum: " + sum);
        input.close();
    }

    public static int[] method(int[] arr) {
        LocalDateTime now = LocalDateTime.now();
        int seconds = now.getSecond();

        if (arr.length >= 2 && arr.length % 2 == 0)
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length / 2) {
                    arr[i] = seconds++;
                } else {
                    arr[i] = (--seconds) * -1;
                }
            }
        if (arr.length > 2 && arr.length % 2 != 0)
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length / 2) {
                    arr[i] = seconds++;
                } else if (i >= arr.length / 2 && i != arr.length - 2) {
                    arr[i] = (--seconds) * -1;
                } else arr[i] = 0;
            }
        return arr;
    }
}

