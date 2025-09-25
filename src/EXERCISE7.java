import java.util.Scanner;

public class EXERCISE7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n  Enter table size: ");
        int size = sc.nextInt();

        int[][] table = new int[size][size];

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("\nMultiplication table: ");

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.printf("%4d", table[i][j]);
            }

            System.out.println();
        }

        sc.close();
    }
}
