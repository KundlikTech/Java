import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number :");
        int n=sc.nextInt();
        System.out.println(check(n));
    }
    public static String check(int num){
        String result=(num%2==0)?("The number "+num+" is Even"):("The number "+num+" is Odd");
        return result;
    }
    
}
