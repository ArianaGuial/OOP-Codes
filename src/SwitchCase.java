import java.util.Scanner;

public class SwitchCase
{
    public static void main(String[] args)
    {
        int num = 15;

        switch(num)
        {
            case 5:
                System.out.println("\nIt's 5");
                break;
            case 10:
                System.out.println("\nIt's 10");
                break;
            case 15:
                System.out.println("\nIt's 15");
                break;
            case 20:
                System.out.println("\nIt's 20");
                break;
            default:
                System.out.println("\nNo number");
        }
    }
}
