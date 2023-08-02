package src.ruslan.week06;

import java.util.Scanner;

public class T1_PasswordValidation {
    //1. Password Validation Task:
    //  Write a return method that can verify if a password is valid or not. Requirements:
    //  1. Password MUST be at least have 6 characters and should not contain space,
    //  2. Password should at least contain one upper case letter,
    //  3. PassWord should at least contain one lower case letter,
    //  4. Password should at least contain one special characters,
    //  5. Password should at least contain a digit.
    //  if all requirements above are met, the method returns true, otherwise returns false.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password: " +
                "\nNote that:" +
                "\n1. Password MUST be at least have 6 characters and should not contain space.\n" +
                "2. Password should at least contain one upper case letter.\n" +
                "3. PassWord should at least contain one lower case letter.\n" +
                "4. Password should at least contain one special characters.\n" +
                "5. Password should at least contain a digit.");

        String password = input.nextLine();
        System.out.println(isValid(password));
        input.close();
    }

    public static boolean isValid(String password) {

        int min = 5;
        int upperCase = 0;
        int lowerCase = 0;
        int special = 0;
        int digit = 0;

        //checking if the password at least have 6 characters and should not contain space
        if (password.length() > min && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {

                //verifying if there is one or more upper case letter
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upperCase++;
                }
                //verifying if there is one or more lower case letter
                if (Character.isLowerCase(ch)) {
                    lowerCase++;
                }
                //verifying if there is one or more special character
                if (ch >= 33 && ch <= 46 || ch == 64) {
                    special++;
                }

                //verifying if there is one or more digit
                if (Character.isDigit(ch)) {
                    digit++;
                }
            }
            if (upperCase >= 1 && lowerCase >= 1 && special >= 1 && digit >= 1) {
                return true;
            }
        }
        return false;
    }
}


