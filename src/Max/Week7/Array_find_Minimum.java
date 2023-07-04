package Max.Week7;

public class Array_find_Minimum {
    public static void main(String[] args) {
        int [] arr = {3,23,56,8,9,5,4,3,-6};
        FindMin(arr);
    }
    public static void FindMin(int[] inputArr){
      int min=inputArr[0];
        for (int each : inputArr) {
            if (min>each)
                min=each;
        }
        System.out.println("min = " + min);
        }
    }

