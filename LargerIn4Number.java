public class LargerIn4Number {
    public static void main(String args[]){
        int a=110;
        int b=500;
        int c=900;
        int d=100;
        int result=(a>b)?((a>c)?((a>d)?a:d):((c>d)?(c):(d))):((b>c)?((b>d)?b:d):((c>d)?c:d));
        System.out.println(result+" is larger");
        /* 
        1)Compile time Success
        2)Run time Success:
        Output:
            900 is larger
        */
    }
}
