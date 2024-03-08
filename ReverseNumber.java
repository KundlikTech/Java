import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = sc.nextInt();
        int r;
        do {
            r = a % 10;
            System.out.print(r);
            a = a / 10;
        } while (a > 0);
        sc.close();
    }
}
/*
 * 1)Compile time Success
 * 2)Run time Success:
 * Output:
 * Enter Number :
 * 4567
 * 7654
 */
