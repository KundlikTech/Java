public class Factorial {
    public static void main(String args[]){
        calculate(5);
    }
    public static void calculate(int n){
        int facto=1;
        for(int i=1;i<=n;i++){
            facto*=i;
        }
        System.out.printf("The factorial of number %d is %d",n,facto);
    }
}
