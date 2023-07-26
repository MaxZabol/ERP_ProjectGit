package src.ruslan.week6;

public class T2_MaximumNumber {
    //2. Find Maximum:
    //  Write a method that can find the maximum number from an int Array.

    public static void main(String[] args) {

        int[] nums = {56, 34, 73, 90, 150, 34, 300, 9, 56};
        System.out.println(maxNumber(nums));
    }

    public static int maxNumber(int[] arr) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
