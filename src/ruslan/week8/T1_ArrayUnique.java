package src.ruslan.week8;

import java.util.Arrays;
import java.util.Scanner;

public class T1_ArrayUnique {
       /*
    1. Array - N unique integers that sum up to 0
    Write a function that given an integer N (1 < N < 100),
    returns an array containing N unique integers that sum up to 0.
    The function can return any such array.
    Example 1:
    N = 4 => the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].

    The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).

    Example 2:
    N = 3 => one of the possible answers is [-1, 0, 1] (but there are many more correct answers).
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number from 2 until 100:");
        int N = input.nextInt();
        while (N <= 1) {
            System.err.println("Incorrect number input!");
            System.out.println("Please enter correct number from 2 until 100:");
            N = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(uniqueNumbers(N)));
    }

    public static int[] uniqueNumbers(int n) {
        int[] nums = new int[n];
        int index = 0;

        if (n % 2 == 1)
            nums[index++] = 0;

        n /= 2;

        for (int i = 1; i <= n; i++) {
            nums[index++] = i;
            nums[index++] = -i;
        }

        return nums;
    }
}
