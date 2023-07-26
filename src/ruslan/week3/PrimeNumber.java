package src.ruslan.week3;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println(PrimeNumber(17));

    }

    public static String PrimeNumber(int num) {

        if (num == 1) {
            return "1 - is not a Prime Number";
        }
        for (int i = 2; i <= num / 2; i++) {//if num is divisible in the given range --> set true, so the num is not a Prime
            if (num % i == 0) {
                return num + " --> is not a Prime Number";
            }
        }
        return num + " --> is a Prime Number";//if num isn't divisible --> set false and num is a Prime
    }
}
/*
1. PrimeNumber
  Prime Number is a whole number greater than 1
  that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
  Write a method that can check if a number is prime or not.
 */


