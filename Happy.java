import java.util.Scanner;

public class Happy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int n1 = n;
        int Sqsum = 0;
        while (n1 > 9) {
            Sqsum = 0;
            int i=n1;
            while(i>0){
                int rem = i % 10;
                int sq=rem*rem;
                Sqsum = Sqsum + sq;
                i/=10;
                if(i!=0){
                    System.out.printf("(%d * %d = %d ) + ",rem,rem,sq);
                }
                else{
                    System.out.printf("(%d * %d = %d ) ",rem,rem,sq);
                }
                
                // System.out.println(Sqsum);
            }
            System.out.println(" = "+Sqsum);

            n1 = Sqsum;
            // System.out.println(Sqsum);
        }
        if (Sqsum == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
        sc.close();
    }

}
