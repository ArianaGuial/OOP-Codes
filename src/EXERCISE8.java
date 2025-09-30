import java.util.Scanner;

public class EXERCISE8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("\nEnter your current balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double withdrawal = Double.parseDouble(sc.nextLine());

            if(withdrawal < 0)
            {
                System.out.println("Error: Withdrawal amount must be positive");
            }
            else if(withdrawal > balance)
            {
                System.out.println("Error: Insufficient funds");
            }
            else
            {
                balance -= withdrawal;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Error: Invalid number format");
        }

        sc.close();
    }
}
