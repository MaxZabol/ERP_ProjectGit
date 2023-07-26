package src.ruslan.week7;

import java.util.Arrays;
import java.util.Scanner;

public class T2_ArrayAscendingOrder {

    /*
    2. Array - Sort Ascending
    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = Sort(arr); ==>{ 7, 8, 9, 10};
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter:");
        int numbers = input.nextInt();
        int[] arr = new int[numbers];

        System.out.println("Please enter your numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();

        System.out.println(Arrays.toString(sortAscendingOrder(arr)));

    }

    public static int[] sortAscendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];
                }
            }
        }
        return arr;

    }
}
