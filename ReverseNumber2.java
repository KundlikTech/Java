import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = sc.nextInt();
        int b = 0;
        int r;
        int x = a;
        do {
            r = a % 10;
            b = b * 10 + r;
            a /= 10;
        } while (a > 0);
        System.out.println("reversed number of " + x + " is " + b);
        sc.close();
    }
}
/*
 * 1)Compile time Success
 * 2)Run time Success:
 * Output:
 * Enter Number :
 * 566785
 * reversed number of 566785 is 587665
 */