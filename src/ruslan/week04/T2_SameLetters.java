package src.ruslan.week04;

import java.util.Arrays;

public class T2_SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));// --> true;
        System.out.println(sameLetters("abc", "abb"));// --> false;

    }

    public static boolean sameLetters(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }
}
 /*
   2. Same letters
      Write a return method that check if a string is build out of the same letters as another string.
      Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
  */

