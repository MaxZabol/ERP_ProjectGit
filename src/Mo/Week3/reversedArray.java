package Mo.Week3;

import java.util.Arrays;

public class reversedArray {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        System.out.println( "Reversed Array="+Arrays.toString(reversed(arr)));
    }


    public static int[] reversed(int[] arr){
            int[]arr1=new int [arr.length];
            int index=0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr1[index++]=arr[i];
                  }
        return arr1;
    }
}
