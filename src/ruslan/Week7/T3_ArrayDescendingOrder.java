package src.ruslan.Week7;

import java.util.Arrays;
import java.util.Scanner;

public class T3_ArrayDescendingOrder {
        /*
    3. Array - Sort Descending
    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter:");
        int numbers = input.nextInt();
        int[] arr = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(sortDescendingOrder(arr)));

    }

    public static int[] sortDescendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
        }
        return arr;
    }
}
