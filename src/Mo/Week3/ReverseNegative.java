package Mo.Week3;

public class ReverseNegative {
    public static void main(String[] args) {
        int num = -54664767;
        String numString = "" + num;
        String reversedNumString="";
        int reversedNumInteger=0;
        for (int i = numString.length()-1; i >0; i--) {
            reversedNumString +=""+numString.charAt(i);
        }
        reversedNumInteger=Integer.parseInt(reversedNumString)*-1;
        System.out.println("reversed numner = " + reversedNumInteger);
    }
}