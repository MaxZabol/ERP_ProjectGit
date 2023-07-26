package src.ruslan.week5;

import java.util.Scanner;

public class T1_ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String word = input.next();
        input.close();

        System.out.println(reverse(word));
    }

    public static String reverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
 /*
2. Reverse:
  Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
 */

