import java.util.Scanner;

public class EXERCISE4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        System.out.println("\nINSTRUCTIONS:");
        System.out.println("- Enter numbers to add them");
        System.out.println("- Enter 0 to stop and display the total\n");

        while(true)
        {
            System.out.println("Enter a number: ");
            num = sc.nextInt();

            if(num == 0)
            {
                break;
            }

            sum += num;
        }

        System.out.println("\nTotal sum: " + sum);

        sc.close();
    }
}
