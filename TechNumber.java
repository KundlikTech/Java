import java.util.Scanner;
public class TechNumber {
    public static void main(String args[]){
        System.out.println("Enter Number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int num1=number;
        int count =0;
        int div=1;
        int firstHalf,secondHalf;
        while(num1>0){
            count++;
            num1/=10;
        }
        if(count%2!=0){
            System.out.println("invalid number ");

        }
        else{
            for(int i=1;i<=(count/2);i++){
                div=div*10;
            }
            // System.out.println(div);
            firstHalf=number/div;
            secondHalf=number%div;
            System.out.println(firstHalf);
            System.out.println(secondHalf);
            int sum=firstHalf+secondHalf;
            int sq=sum*sum;
            if(sq==number){
                System.out.println("The number is tech number");
            }
            else{
                System.out.println("The number is not tech number");
            }
        }
        sc.close();
    }
}
