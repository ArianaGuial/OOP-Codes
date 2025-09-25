import java.io.*;

public class EXCEPTIONHANDLING
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 0;

        try
        {
            int ans = a / b;
            System.out.println("Answer =  " + ans);
        }
        catch (ArithmeticException e)
        {
            System.out.println("\nERROR : Division by zero is not allowed");
        }
        finally
        {
            System.out.println("Continues after handling the exception");
        }
    }
}
