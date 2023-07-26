package src.ruslan.week5;

import java.util.Scanner;

public class T2_UniqueChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter sequence of characters:");
        String sequenceOfChar = input.nextLine();
        input.close();

        System.out.println(uniqueChar(sequenceOfChar));
    }

    public static String uniqueChar(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }
        }
        return unique;
    }
}
/*
1. Find the unique:
  Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

