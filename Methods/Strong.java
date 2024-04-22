import java.util.Scanner;

class Strong {
    static int a=10;
    public static void check(int n) {
        int n1=n;
        int sum=0;
        while(n1>0){
            int rem=n1%10;
            sum+=factorial(rem);
            n1/=10;
        }
        if(sum==n){
            System.out.println("the number is strong number");
        }
        else{
            System.out.println("the number is not  strong number");
        }
    }
    public static int  factorial(int n){
        int facto=1;
        for(int i=1;i<=n;i++){
            facto*=i;
        }
        return facto;
    }
}
class Weak {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        Strong.check(n);
        System.out.println(Strong.a);
    }
}
