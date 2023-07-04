package Diloro.Week7;

import java.util.Scanner;

public class FindMinimum_IntArray {

    public static void minimumArray(int[] array){
        int minNum = array[0];

        for (int each : array) {
            if(each < minNum){
                minNum = each;
            }
        }

        System.out.println("Minimum number in array is: " + minNum);

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

        minimumArray(array);

    }
}
