import java.util.Scanner;

public class SunnyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int n1=n+1;
        int sq;
        boolean flag=false;
        for(int i=1;i<=n1;i++){
            sq=i*i;
            if(sq==n1){
                flag=true;
                break;
            }
            if(sq>n1){
                break;
            }
        }
        if(flag){
            System.out.println("Sunny Number");
        }
        else{
            System.out.println("Not Sunny Number");
        }
    }
}
