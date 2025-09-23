import java.util.Scanner;

public class CODECHUM2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHow many grades? ");
        int n = sc.nextInt();

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            sum += grade;

            if (grade > highest)
            {
                highest = grade;
            }

            if (grade < lowest)
            {
                lowest = grade;
            }
        }

        double average = (double) sum / n;

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.printf("Average: %.2f\n", average);

        sc.close();
    }
}
