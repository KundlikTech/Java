public class Armstrong {
    public static void main(String args[]){
        int num=371;
        int num1=num;
        int result=0;
        int digit=0;
        int rem=0;
        int ans=0;
        check(num, num1, result, digit, rem, ans);
        
        
    }
    public static void check(int num,int num1,int result,int digit,int rem,int ans) {
        for(int i=num;i>0;i/=10){
            digit++;
        }
        while(num1>0){
            rem=num1%10;
            // ans=(int)(Math.pow(rem,digit));
            ans=1;
            for(int i=0;i<digit;i++){
                ans=ans*rem;
            }
            result+=ans;
            num1/=10;
        }
        if(result==num){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }
        
    }
}