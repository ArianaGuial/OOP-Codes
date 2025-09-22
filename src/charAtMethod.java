import java.io.*;

public class charAtMethod
{
    public static void main(String[] args)
    {
        String str = "OneTwoThreeFourFive";

        System.out.println("\nOdd positions: ");
        for(int i = 0; i < str.length(); i += 2)
        {
            System.out.print(str.charAt(i));
        }

        System.out.println("\n");

        System.out.println("New positions: ");
        for(int i = 1; i < str.length(); i += 2)
        {
            System.out.print(str.charAt(i));
        }
    }
}
