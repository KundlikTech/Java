import java.util.Scanner;

public class GradeIfElse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();
        if(marks>=80 && marks<=100)
        {
            System.out.println("A+");
        }
        else if(marks>=60 && marks<80)
        {
            System.out.println("B+");
        }
        else if(marks>=40 && marks<60)
        {
            System.out.println("C+");
        }
        else if(marks>=35 && marks<40)
        {
            System.out.println("E");
        }
        else
        {
            System.out.println("You are fail");
        } 
    }
}
