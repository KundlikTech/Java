import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=2;
        boolean condition=true;
        while(b<a){
            if(a%b==0){
                condition =false;
            }
            b++;
        }
        if(condition){
            System.out.println(a+" is prime number ");
        }
        else{
            System.out.println(a+" is not prime number ");
        }
    }
}
