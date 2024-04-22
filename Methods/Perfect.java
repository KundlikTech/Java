public class Perfect {
    public  static void main(String args[]){
        checkPerfect(27);
    }
    public static void checkPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("The number is perfect");
        }
        else{
            System.out.println("The number is not perfect");
        }
    }
}
