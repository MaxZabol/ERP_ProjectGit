package src.ruslan.week6;

import java.util.Scanner;

public class T3_SumOfDigits {
    //3. Sum of digits in a string:
    //  Write a method that can return the sum of the digits in a string.
    //  Ex: "A3v15" = > 3 + 1 + 5 = 9 --> return 9

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter --> A3v15:");
        String sequence = input.nextLine();
        input.close();
        System.out.println("The sum of the digits in a string = " + (sumOfDigits(sequence)));

    }

    public static int sumOfDigits(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                String temp = str.substring(i, i + 1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }
}
