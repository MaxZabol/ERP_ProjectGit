package Mo.Week2;


import java.util.Scanner;


public class WithoutThirdVarible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number1");
        int number1 = input.nextInt();

        System.out.println("Enter second number2");
        int number2 = input.nextInt();

         method1(number1,number2);

        number2=method2(number1,number2);
        System.out.println("Number2 = "+number2 );
    }

    public static void method1(int number1, int number2) {

        number1=number2;
        System.out.println("number1 = " + number1);
    }


    public static int method2(int number1, int number2) {
        number2=number1;
return  number2;
    }


}
