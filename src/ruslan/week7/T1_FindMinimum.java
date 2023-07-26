package src.ruslan.week7;

import java.util.Scanner;

public class T1_FindMinimum {
       /*
    1. Array - Find Minimum
       Write a method that can find the minimum number from an int Array
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        input.close();

        System.out.println("Minimum number is = " + minNumber(nums));

    }

    public static int minNumber(int[] arr) {

        int min = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
