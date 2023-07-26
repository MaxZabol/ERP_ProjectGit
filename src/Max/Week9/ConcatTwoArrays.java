package Max.Week9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        String[] arr1 = {"Max","Max","Max","Max","Max","Max","Max","Max"};
        String[] arr2 = {"Oh ","Viva ","Super ","Wonder ","Billisimo ","Cool ","Handsome ","Bright like a sun "};

        System.out.println("Concat Two Arrays result= " + Arrays.toString(concat(arr1,arr2)));
    }

    public static String[] concat (String [] Array1, String []Array2){
        String [] result = new String[Array1.length];
        for (int i = 0; i < Array2.length; i++) {
            result[i]=Array2[i]+Array1[i];
             }
        return result;
    }



}
