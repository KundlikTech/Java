public class nthPrime1 {
    public static void main(String args[]){
        int n=11;
        int n1=n;
        int count=0
        int primeCount=0;
        for(int i=1;i<=n;i++){

        
        for(int j=2;j<i;j++){
            if(i%j==0){
                count++;
            }
        }
        if(count==0){
            primeCount++;
        }
        if(i==n && count>=1){
            System.out.println("The number is not prime");
        }
        else if()
    }
    }
}
