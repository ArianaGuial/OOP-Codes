import java.util.Scanner;

public class CODECHUM3
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);

       System.out.print("\nEnter electricity consumption in kWh: ");
       int kWh = sc.nextInt();

       double totalBill = 0;

       if (kWh <= 100)
       {
           totalBill = kWh * 5.00;
       }
       else if (kWh <= 300)
       {
           totalBill = (100 * 5.00) + ((kWh - 100) * 6.50);
       }
       else
       {
           totalBill = (100 * 5.00) + (200 * 6.50) + ((kWh - 300) * 8.00);
       }

       System.out.printf("Total Bill: %.2f", totalBill);

       sc.close();
   }
}