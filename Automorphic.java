import java.util.Scanner;

public class Automorphic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int count1=0;
        int count2=0;
        int a1=a;
        int sq=a*a;
        int b=1;
        while (a1>0) {
            count1++;
            a1/=10;
        }
        int div=(int)Math.pow(10,count1);
        int sq1=sq%div;
        if(sq1==a){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println(" not Automorphic number");
        }

    }
}
