import java.util.Scanner;

public class EXERCISE1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("_______________________");
        System.out.println("OOP SARI-SARI STORE");

        System.out.println("\nEnter customer name: ");
        String customerName = sc.nextLine();

        double price1, price2, price3;
        double total = 0;

        System.out.println("\nEnter prices for 3 items: ");

        System.out.println("Item 1 Price: ");
        price1 = sc.nextDouble();
        System.out.println("Items processed: 1/3\n");

        System.out.println("Item 2 Price: ");
        price2 = sc.nextDouble();
        System.out.println("Items processed: 2/3\n");

        System.out.println("Item 3 Price: ");
        price3 = sc.nextDouble();
        System.out.println("Items processed: 3/3\n");

        total = price1 + price2 + price3;

        System.out.println("____________________");
        System.out.println("RECEIPT");
        System.out.println("\nCustomer Name: " + customerName);

        System.out.print("Items processed: 3/3");

        System.out.println("\nTotal: Php " + total);
        System.out.println("____________________");

        sc.close();
    }
}