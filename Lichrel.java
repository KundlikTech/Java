public class Lichrel {
    public static void main(String args[]){
        int num1=562;
        int x=num1;
        int num2=0;
        while(x>0){
            num2=(num2*10)+(x%10);
            x/=10;
        }
        int num3=num1+num2;
        int y=num3;
        int num4=0;
        while(y>0){
            num4=(num4*10)+(y%10);
            y/=10;
        }
        if(num3!=num4){
            System.out.println("Lichrel Number");
        }
        else{
            System.out.println("Not Lichrel Number");
        }
        

    }
}
