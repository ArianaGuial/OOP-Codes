import java.util.Scanner;

public class EXERCISE5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a text: ");
        String text = sc.nextLine();

        System.out.print("Enter character to check its occurrence: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == ch)
            {
                count++;
            }
        }

        System.out.println("Occurrence of " + ch + ": " + count);

        sc.close();
    }
}