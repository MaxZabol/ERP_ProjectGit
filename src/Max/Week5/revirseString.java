package Max.Week5;

import java.util.Scanner;

public class revirseString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter String");
        String str = input.nextLine();
        System.out.println("result = "+revirse(str));

    }
    public static String revirse(String str){
         String result="";
        for(int i=str.length()-1; i>=0; i-- ){
            result+=str.charAt(i);}
        return result;
        }


    }


