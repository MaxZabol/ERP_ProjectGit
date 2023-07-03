package Mo.Week2;

public class Fibonacci65 {
    public static void main(String[] args) {
        int count=0;
        long k=0;
        long a=0;

        System.out.print(0);
        for (long i = 1; i<100000000000000000L; i=a+k) {

            System.out.print (" "+i);
            count++;
            if (count==65){
                System.out.println();
                System.err.println("Index= "+count+". Fibonacci number= " + i);
                break;}
            k=a;
           a=i;

        }

    }
}
