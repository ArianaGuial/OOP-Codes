import java.util.Scanner;

public class CODECHUM1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = -1;
        int total = 0;
        boolean isEven;

        System.out.print("\n");

        while(num != 0)
        {
            System.out.print("Enter a numeric value (0 to exit): ");
            num = sc.nextInt();

            if(num != 0)
            {
                total += num;
            }
        }

        System.out.println("total sum is " + total);

        isEven = total % 2 == 0;

        if(total < 0 && isEven)
        {
            System.out.println("The result is a negative number and it is an even number.");
        }
        else if(total > 0 && isEven)
        {
            System.out.println("The result is a positive number and it is an even number.");
        }
        else if(total < 0 && !isEven)
        {
            System.out.println("The result is a negative number and it is an odd number.");
        }
        else if(total > 0 && !isEven)
        {
            System.out.println("The result is a positive number and it is an odd number.");
        }
        else
        {
            System.out.println("Result is invalid.");
        }

        sc.close();
    }
}
