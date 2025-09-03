import java.util.Scanner;

public class GetIntegerFromUser
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("You entered the number " + number);

        input.close();
    }
}
