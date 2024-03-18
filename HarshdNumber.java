public class HarshdNumber {
    public static void main(String args[]){
        int num=22;
        int num1=num;
        int sum=0;
        while(num1>0){
            int rem=num1%10;
            sum+=rem;
            num1/=10;
        }
        if(num%sum==0){
            System.out.println("The number is Harshd");
        }
        else{
            System.out.println("The number is not Harshd");
        }

    }
}
