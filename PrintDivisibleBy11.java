public class PrintDivisibleBy11 {
    public static void main(String args[]){
        int a=100;
        do{
            if(a%11==0){
                System.out.println(a);
            }   
            a++;
        }while(a<=300);
    }
}
