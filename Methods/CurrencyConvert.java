import java.util.Scanner;

public class CurrencyConvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your currency \n1.Indian Rupees \n2.American Dollar \n3.European Euro \n4.Great Britain Pound\n5.Saudi Riyal");
        int input = sc.nextInt();
        System.out.println("Enter output \n1.Indian Rupees \n2.American Dollar \n3.European Euro \n4.Great Britain Pound \n5.Saudi Riyal");
        int output = sc.nextInt();
        System.out.println("Enter amount");
        int amount = sc.nextInt();
        switch (input) {
            case 1:
                switch (output) {
                    case 1 -> System.out.printf("%d Indian Rupees : %f Indian Rupees \n", amount, amount);
                    case 2 -> System.out.printf("%d Indian Rupees : %f American Dollar\n", amount, amount * 83.59);
                    case 3 -> System.out.printf("%d Indian Rupees : %f European Euro \n", amount, amount * 88.96);
                    case 4 -> System.out.printf("%d Indian Rupees : %f Great Britain Pound \n", amount, amount * 104.08);
                    case 5 -> System.out.printf("%d Indian Rupees : %f Saudi Riyal \n", amount, amount * 22.28);
                }
                break;
            case 2:
                switch (output) {
                    case 1 -> System.out.printf("%d American Dollar : %f Indian Rupees \n", amount, amount*0.012);
                    case 2 -> System.out.printf("%d American Dollar : %f  American Dollar\n", amount, amount);
                    case 3 -> System.out.printf("%d American Dollar : %f European Euro \n", amount, amount *0.939635);
                    case 4 -> System.out.printf("%d American Dollar : %f Great Britain Pound \n", amount, amount *0.08031);
                    case 5 -> System.out.printf("%d American Dollar : %f Saudi Riyal \n", amount, amount * 3.751795);
                }
                break;
            case 3:
                switch (output) {
                    case 1 -> System.out.printf("%d European Euro : %f Indian Rupees \n", amount, amount*0.011);
                    case 2 -> System.out.printf("%d European Euro : %f  American Dollar\n", amount, amount * 1.06424213);
                    case 3 -> System.out.printf("%d European Euro : %f European Euro \n", amount, amount);
                    case 4 -> System.out.printf("%d European Euro : %f Great Britain Pound \n", amount, amount * 0.854727);
                    case 5 -> System.out.printf("%d European Euro : %f Saudi Riyal \n", amount, amount * 3.9928);
                }
                break;
            case 4:
                switch (output) {
                    case 1 -> System.out.printf("%d Great Britain Pound : %f Indian Rupees \n", amount, amount*0.0096);
                    case 2 -> System.out.printf("%d Great Britain Pound : %f American Dollar\n", amount, amount * 1.245125);
                    case 3 -> System.out.printf("%d Great Britain Pound : %f European Euro \n", amount, amount * 1.1699);
                    case 4 -> System.out.printf("%d Great Britain Pound : %f Great Britain Pound \n", amount, amount);
                    case 5 -> System.out.printf("%d Great Britain Pound : %f Saudi Riyal \n", amount, amount * 4.671454);
                }
                break;
            case 5:
                switch (output) {
                    case 1 -> System.out.printf("%d Saudi Riyal : %f Indian Rupees \n", amount, amount*0.045);
                    case 2 -> System.out.printf("%d Saudi Riyal : %f  American Dollar\n", amount, amount * 0.266539);
                    case 3 -> System.out.printf("%d Saudi Riyal : %f European Euro \n", amount, amount * 0.250449);
                    case 4 -> System.out.printf("%d Saudi Riyal : %f Great Britain Pound \n", amount, amount * 0.214066103);
                    case 5 -> System.out.printf("%d Saudi Riyal : %f Saudi Riyal \n", amount, amount);
                }
        }
        sc.close();

    }
}