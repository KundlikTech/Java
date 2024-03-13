public class Fibonacci {
    public static void main(String args[]){
        int f_value=0;
        int s_value=1;
        int result=0;
        System.out.println(f_value);
        System.out.println(s_value);
        // for(int i=0;i<10;i++){
        //     result=f_value+s_value;
        //     System.out.println(result);
        //     f_value=s_value;
        //     s_value=result;
        // }
        do{
            result=f_value+s_value;
            System.out.println(result);
            f_value=s_value;
            s_value=result;     
        }while (result<20);
    }
}