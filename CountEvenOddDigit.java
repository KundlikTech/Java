import java.util.Scanner;

public class CountEvenOddDigit {
    public static void main(String args[]) {
        int odd = 0;
        int even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        int r;
        do {
            r = a % 10;
            if (r % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            a = a / 10;
        } while (a > 0);
        System.out.print("Odd Digits " + odd + "Even Digits " + even);
        sc.close();
    }
}
/*
 * 1)Compile time Success
 * 2)Run time Success:
 * Output:
 * Enter Number : 45673
 * Odd Digits 3Even Digits 2
 */