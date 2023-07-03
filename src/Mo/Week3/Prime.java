package Mo.Week3;

public class Prime {
    public static void main(String[] args) {
        int num= 56;

        for (int i = 1; i < num; i++) {
           boolean count=false;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count= true;
                break;}
            }
            if(!count)
                System.out.print("  "+i);
        }
    }
}
