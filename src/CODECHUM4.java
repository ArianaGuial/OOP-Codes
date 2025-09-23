import java.util.Scanner;

public class CODECHUM4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char[] alphabet = new char[27];
        alphabet[0] = ' ';

        for (int i = 1; i <= 26; i++)
        {
            alphabet[i] = (char) ('A' + i - 1);
        }

        System.out.print("How many numbers will you enter? ");
        int count = sc.nextInt();

        int[] numbers = new int[count];
        String decodedText = "";

        for (int i = 0; i < count; i++)
        {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] >= 0 && numbers[i] <= 26)
            {
                decodedText += alphabet[numbers[i]];
            }
            else
            {
                decodedText += '?';
            }
        }

        System.out.println("\nDecoded Text: " + decodedText);

        sc.close();
    }
}