package Week2;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the value of x and y");

        int x = Scan.nextInt();
        int y = Scan.nextInt();

        System.out.println("before swapping numbers:" +x+" "+y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: " +x+ " "+y);


    }
}
