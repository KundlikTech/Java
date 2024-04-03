import java.util.Scanner;
public class Evil{
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int number=sc.nextInt();
        int n=number;
        int num=0;
        int i=1;
        while(n>0){
            if(n%2==1){
                num+=i;
            }
            i*=10;
            n/=2;
        }
        System.out.printf("Decimal : %d\nBinary : %d\n",number,num);
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==1){
                count++;
            }
            num/=10;
        }
        if(count%2==0){
            System.out.println("Evil Number");
        }
        else{
            System.out.println("Not Evil Number");
        }
        sc.close();
    }
}