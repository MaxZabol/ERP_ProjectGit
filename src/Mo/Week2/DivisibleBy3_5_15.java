package Mo.Week2;

public class DivisibleBy3_5_15 {
    public static void main(String[] args) {
        String Divide15 = "";
        String Divide5 = "";
        String Divide3 = "";
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                Divide15 += " " + i;
            } else if (i % 5 == 0) {
                Divide5 += " " + i;
            } else if (i % 3 == 0) {
                Divide3 += " " + i;
            }
        }
        System.out.println(" Divisible By 15 : "+Divide15);
        System.out.println(" Divisible By 5 : "+Divide5);
        System.out.println(" Divisible By 3 : "+Divide3);

    }
}

/*EX:
        OutPut:
        Divisible By 15 : 15 30 45 60 75 90
        Divisible By 5 : 5 10 20 25 35 40 50 55 65 70 80 85 95 100
        Divisible By 3 : 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99 */
