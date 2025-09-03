import java.util.Scanner;

public class FloatDoubleString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a float: ");
        float aFloat = input.nextFloat();
        System.out.print("You entered the float " + aFloat);

        System.out.println("\n\nEnter a double: ");
        double aDouble = input.nextDouble();
        System.out.print("You entered the double " + aDouble);

        System.out.println("\n\nEnter a string: ");
        String aString = input.next();
        System.out.print("You entered the string " + aString);
    }
}
