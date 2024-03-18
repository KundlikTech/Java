// write a program to you need to find nth number of prime number 

import java.util.Scanner;

class nthPrime {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int n=num;
        int count = 1;
        int i,j;
        int count1=1;
        if (n == 2) {
            System.out.println(" 1st prime");
        } 
        else {
            for (i = 3; i <= n; i++) {
                count1 = 0;
                for (j = 2; j < n; j++) {
                    if (i % j == 0) {
                        count1++;
                    }
                }
                if (count1 <= 1) {
                    count++;
                }
            }
            if(count1>0){
                System.out.println("The number is not prime");
            }
            else{
                System.out.printf("The number is %d prime",count);
            }
        }
        

    }
}