public class DuckNumber {
    public static void main(String args[]){
        int num=103;
        int num1=num;
        boolean flag=false;
        while(num1>0){
            int rem=num1%10;
            if(rem==0){
                flag=true;
                break;
            }
            num1/=10;
        }
        if(flag){
            System.out.println("The number is duck number");
        }
        else{
            System.out.println("The number is not duck number");
        }
    }
}
