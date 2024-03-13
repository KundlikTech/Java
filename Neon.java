import java.util.Scanner;

public class Neon {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean condition=false;
        for(int i=0;i<1000;i++){
        // System.err.println("Enter Number");
        // int num=sc.nextInt();
        int num=i;
        int sq=num*num;
        int sq1=sq;
        int rem;
        int sum=0;
        while(sq1>0){
            rem=sq1%10;
            sum=sum+rem;
            sq1/=10;
        }
        if(sum==num){
            System.out.println(num+"The number is neon");
            condition=false;
        }
        // else{
        //     System.out.println(num+"The number is not neon");
        //     condition=true;
        // }
        }
        

    }
}
