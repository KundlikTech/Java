// write a program to print decimal number of binary number 1001
public class BinaryToDecimal {
    public static void main(String args[]){
        int binary=1001;
        int decimal=0;
        int i=0;
        while(binary>0){
            int rem=binary%10;
            if(rem==1){
                decimal+=Math.pow(2,i);
            }
            binary/=10;
            i++;
        }
        System.out.printf("Binary : %d\nDecimal :%d",binary,decimal);
    }
}
