import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("_______________________");
        System.out.println("OOP SARI-SARI STORE");

        System.out.println("\nEnter customer name: ");
        String customerName = sc.nextLine();

        double[] prices = new double[3];
        double total = 0;
        int items = 0;

        System.out.println("\nEnter prices for 3 items: ");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Item " + (i + 1) + " Price: ");
            prices[i] = sc.nextDouble();

            total += prices[i];
            items++;

            System.out.println("Items processed: " + items + "/3\n");
        }

        System.out.println("____________________");
        System.out.println("RECEIPT");
        System.out.println("Customer Name: " + customerName + "\n");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Item " + (i + 1) + ": Php " + prices[i]);
        }

        System.out.println("\nTotal: Php " + total);
        System.out.println("____________________");

        sc.close();
    }
}
