package Diloro.Week7;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_IntArray {

    public static void ascendingArray(int[] array){

        int num;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }

        System.out.println("Array in ascending order: " + Arrays.toString(array));

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an array value:");
        int arrayValue = in.nextInt();
        int [] array = new int [arrayValue];

        System.out.println("Now enter: " + arrayValue + " numbers separately:");

        for (int i = 0; i < arrayValue; i++) {
            int numbers = in.nextInt();
            array[i] = numbers;
        }

        ascendingArray(array);

    }
}
