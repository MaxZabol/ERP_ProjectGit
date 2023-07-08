package src.ruslan.week8;

import java.util.Arrays;
import java.util.Scanner;

public class T2_MoveZeros {
   /*
    2. Array - Move Zeros to the End
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please write any numbers:");
        String numbers = input.nextLine();
        String[] nums = numbers.split("");
        int[] digits = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            digits[i] = Integer.parseInt(nums[i]);
        }
        input.close();

        System.out.println("Array input:" + Arrays.toString(digits));
        System.out.println("Array output:" + Arrays.toString(moveZeroes(digits)));
    }

    public static int[] moveZeroes(int[] arr) {

        int[] nums = new int[arr.length];
        int index = 0;

        for (int each : arr) {
            if (each != 0) {
                nums[index++] = each;
            }
        }
        return nums;
    }

}
