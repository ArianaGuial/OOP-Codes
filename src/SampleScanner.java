import java.util.Scanner;

public class SampleScanner
{
   public static void main(String[] args)
   {
       Scanner number = new Scanner(System.in);

       System.out.println("Enter a number: ");
       int num1 = number.nextInt();

       System.out.println("Enter a number: ");
       int num2 = number.nextInt();

       int Ans = num1 + num2;

       System.out.println("The answer is: " + Ans);
   }
}
