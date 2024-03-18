import java.util.Scanner;
public class CoPrime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2");
        int num2=sc.nextInt();
        boolean flag=true;
        int small=num1>num2?num2:num1;
        int i=2;
        for(;i<=small;i++){
            if(num1%i==0 && num2%i==0 ){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.printf("The Numbers %d & %d are coprime",num1,num2);//System.out.println("The numbers"+num1+"&"+num2+"are coprime");
        }
        else{
            System.out.printf("The numbers %d & %d are not co prime",num1,num2);
        }
        sc.close();

    }
}
