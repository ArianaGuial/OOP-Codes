import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigIntegerAndDecimal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Big Integer: ");
        BigInteger num1 = input.nextBigInteger();
        System.out.print("Using nextBigInteger: " + num1);

        System.out.print("\n\nEnter a Big Decimal: ");
        BigDecimal num2 = input.nextBigDecimal();
        System.out.print("Using nextBigDecimal: " + num2);

        input.close();
    }
}
