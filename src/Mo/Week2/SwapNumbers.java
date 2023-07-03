package Mo.Week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 25;
        int b = 35;
        System.out.println("Before swapping:" + "\na = " + a + "\nb = " + b);

        a = a + b;// 25 + 35 = 60
        b = a - b;// 60 - 35 = 25
        a = a - b;// 60 - 25 = 35

        System.out.println("After swapping:" + "\na = " + a + "\nb = " + b);
    }
}
