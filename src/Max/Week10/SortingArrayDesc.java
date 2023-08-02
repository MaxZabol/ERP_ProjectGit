package Max.Week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayDesc {

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 76, 7, 89, 9, 0, 0));

            System.out.println("Original Array: " + arr);
            ArrayList<Integer> sortedArr = sorting(arr);
            System.out.println("Sorted Array: " + sortedArr);
        }

        public static ArrayList<Integer> sorting(ArrayList<Integer> input) {
            Integer[] arr2 = input.toArray(new Integer[0]);
            for (int i = 0; i < arr2.length - 1; i++) {
                for (int j = 0; j < arr2.length - i - 1; j++) {
                    if (arr2[j] < arr2[j + 1]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + 1];
                        arr2[j + 1] = temp;
                    }
                }
            }
            input.clear();
            Collections.addAll(input, arr2);
            return input;
        }
    }

