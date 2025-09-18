import java.util.Scanner;

public class EXERCISE6
{
    public static int[] generateEvenNumbers(int n)
    {
        int[] evens = new int[n];
        for(int i = 0; i < n; i++)
        {
            evens[i] = 2 * (i + 1);
        }
        return evens;
    }

    public static int[] generateSquares(int n)
    {
        int[] squares = new int[n];
        for(int i = 0; i < n; i++)
        {
            squares[i] = (i + 1) * (i + 1);
        }
        return squares;
    }

    public static int[] generateBaseNumbers(int n)
    {
        int[] bases = new int[n];
        for(int i = 0; i < n; i++)
        {
            bases[i] = i + 1;
        }
        return bases;
    }

    public static int[] reverseArray(int[] arr)
    {
        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of even numbers to generate: ");
        int evenCount = sc.nextInt();

        System.out.print("Enter number of square numbers to generate: ");
        int squareCount = sc.nextInt();

        int[] evenNumbers = generateEvenNumbers(evenCount);
        int[] squareNumbers = generateSquares(squareCount);
        int[] baseNumbers = generateBaseNumbers(squareCount);
        int[] reversedBases = reverseArray(baseNumbers);

        System.out.print("\nOutput Array: ");
        for(int i = 0; i < evenNumbers.length; i++)
        {
            System.out.print(evenNumbers[i]);
            if (i < evenNumbers.length - 1) System.out.print(", ");
        }

        System.out.print("\nOutput Array (squared values): ");
        for(int i = 0; i < squareNumbers.length; i++)
        {
            System.out.print(squareNumbers[i]);
            if(i < squareNumbers.length - 1)
            {
                System.out.print(", ");
            }
        }

        System.out.print("\nOutput Array (with exponents): ");
        for(int i = 0; i < squareCount; i++)
        {
            int base = i + 1;
            System.out.print(base + "²");
            if (i < squareCount - 1) System.out.print(", ");
        }

        System.out.print("\nOutput Array: ");
        for(int i = 0; i < reversedBases.length; i++)
        {
            System.out.print(reversedBases[i]);
            if(i < reversedBases.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.print("\n");

        sc.close();
    }
}