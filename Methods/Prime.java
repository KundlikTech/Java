public class Prime {
    public static void main(String args[]){
        checkPrime(7);
    }
    public static void checkPrime(int n){
        boolean flag=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.printf("%d is prime",n);
        }
        else{
            System.out.printf("%d is not prime",n);
        }
    }
}
