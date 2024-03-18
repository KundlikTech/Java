import java.util.Scanner;

public class LCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number 1");
        int num1=sc.nextInt();
        System.err.println("Enter number 2");
        int num2=sc.nextInt();
        int largest,smallest;
        if(num1>num2){
            largest=num1;
            smallest=num2;
        }
        else{
            largest=num2;
            smallest=num1;
        }
        for(int i=largest; ;i+=largest){
            if(i%smallest==0){
                System.out.printf("LCM of %d and %d is  %d",num1,num2 ,i);
                break;
            }
        }
        sc.close();
    }
}
