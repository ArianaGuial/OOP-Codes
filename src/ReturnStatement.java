import java.io.*;

public class ReturnStatement
{
    public static int calculateSum(int num1, int num2)
    {
        System.out.println("\nCalculating the sum of " + num1 + " and " + num2 + ":");
        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);

        return sum;
    }

    public static void main(String[] args)
    {
        int result = calculateSum(43, 8);
        System.out.println("\nAnswer: " + result);
    }
}
