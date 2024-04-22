import java.util.Scanner;

public class Operation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean condition = false;
        do {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter your choice\n1.Add\n2.Sub\n3.Multiply\n4.Divide");
            byte choice = sc.nextByte();
            switchCase(a, b, choice);
            System.out.println();
            System.out.println("Do you want continue is it true?");
            condition = sc.nextBoolean();
        } while (condition);

        sc.close();
    }

    public static void switchCase(int a, int b, byte choice) {
        switch (choice) {
            case 1:
                add(a, b);
                break;
            case 2:
                sub(a, b);
                break;
            case 3:
                mul(a, b);
                break;
            case 4:
                div(a, b);
                break;

        }
    }

    public static void add(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    public static void sub(int a, int b) {
        System.out.printf("%d - %d = %d", a, b, a - b);
    }

    public static void mul(int a, int b) {
        System.out.printf("%d * %d = %d", a, b, a * b);
    }

    public static void div(int a, int b) {
        System.out.printf("%d / %d = %d", a, b, a / b);
    }
}
