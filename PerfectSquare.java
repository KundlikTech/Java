import java.util.Scanner;

public class PerfectSquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int sq;
        boolean flag=false;
        for(int i=1;i<=n;i++){
            sq=i*i;
            if(sq==n){
                flag=true;
                break;
            }
            if(sq>n){
                break;
            }
        }
        if(flag){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not Perfect Square");
        }
    }
}
