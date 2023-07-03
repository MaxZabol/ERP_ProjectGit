package Mo.Week3;
public class MaxAndMin {
    public static void main(String[] args) {
        int [] arr = {3,5,7,-8,0,4,2,1};
        System.out.println(MaxMin(arr));
    }
    public static String MaxMin(int[] arr){
        int maxNum=arr[0];
        int minNum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxNum<arr[i])
                maxNum=arr[i];
            if(minNum>arr[i])
                minNum=arr[i];

        }
        return "maximum number = "+maxNum+"\n"+"minimum number = "+ minNum;
    }
}
