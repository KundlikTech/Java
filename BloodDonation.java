import java.util.Scanner;
public class BloodDonation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your himoglobin : ");
        int himoglobin=sc.nextInt();

        System.out.print("Enter your age : ");
        int age=sc.nextInt();

        System.out.print("You have diease .Is is true? ");
        boolean diease=sc.nextBoolean();

        System.out.print("You are addict .Is is true? ");
        boolean drugsaddict=sc.nextBoolean();
        if(age>=18 && age<=60)
        {
            if(himoglobin>=13)
            {
                if(diease==false)
                {
                    if(drugsaddict==false)
                    {
                        System.out.println("You are eligible for blood donation");
                    }
                    else
                    {
                        System.out.println("You can not donate blood because you are drug addict");
                    }
                }
                else
                {
                    System.out.println("You can not donate blood because you have diease");
                }
            }
            else
            {
                System.out.println("You can not donate blood because your himoglobin is less than 13");
            }
        }
        else{
            if(age<18){
                System.out.println("You can not donate blood because your age is less than 18");
            }
            else
            {
                System.out.println("You can not donate blood because your age is more than 60");
            }
        }
    }
}
