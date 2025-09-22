import java.io.*;

public class TypeCasting
{
    public static void main(String[] args)
    {
        double i = 100.245;
        short j = (short)i;
        int k = (int)i;

        System.out.println("\nOriginal value before Casting: " + i);
        System.out.println("After Type Casting to Short: " + j);
        System.out.println("After Type Casting to Int: " + k);
    }
}
