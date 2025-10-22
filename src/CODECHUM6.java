import java.util.Scanner;

public class CODECHUM6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.print("\n");

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];

        for(int i = 1; i < 5; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }

        System.out.print("\nThe larger number is: " + max);
    }
}