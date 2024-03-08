public class PrintEvenDigit {
    public static void main(String args[]) {
        int a = 3456;
        int r;
        do {
            r = a % 10;
            if ((r & 1) == 0) {// r%2==0
                System.out.println(r);
            }
            a = a / 10;
        } while (a > 0);
    }
}
/*
 * 1)Compile time Success
 * 2)Run time Success:
 * Output:
 * 6
 * 4
 */