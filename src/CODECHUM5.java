import java.util.Scanner;

public class CODECHUM5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] grades = new int[5];

        System.out.print("\n");

        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
        }

        System.out.print("\nGrades entered: ");

        for(int grade : grades)
        {
            System.out.print(grade + " ");
        }

        sc.close();
    }
}