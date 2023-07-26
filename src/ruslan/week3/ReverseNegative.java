package src.ruslan.week3;

public class ReverseNegative {

    public static void main(String[] args) {

        reverseNegative(-215);

    }

    public static void reverseNegative(int num) {// num: -215

        int reversed = 0;

        for (; num != 0; num /= 10) {
            //1st iteration -> num: -215;  digit: -5
            //2nd iteration -> num: -21;   digit: -1
            //3st iteration -> num: -2;  digit: -2
            
            int digit = num % 10;//reminder of num --> now is (5)
            
            reversed = reversed * 10 + digit;
            //1st iteration -> reversed: 0;   digit: -5
            //2nd iteration -> reversed: -5;  digit: -1
            //3rd iteration -> reversed: -51;  digit: -2
        }
        System.out.println("Reversed number = " + reversed);
    }
}
/*
2. Reverse negative number
  Write a return method that can reverse negative number and return it as int.
  For example, N = -215:
  OutPut: -512
 */
