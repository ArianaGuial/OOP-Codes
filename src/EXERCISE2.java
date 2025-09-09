import java.util.Scanner;

public class EXERCISE2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        System.out.println("___________________________");
        System.out.println("Welcome to the Snack Shop");

        while (choice != 5)
        {
            System.out.println("___________________________");
            System.out.println("\nChoose an item by entering the number:");
            System.out.println("1. Burger - Php 80.00");
            System.out.println("2. Fries - Php 90.00");
            System.out.println("3. Salad - Php 110.00");
            System.out.println("4. Soda - Php 75.00");

            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\nCHOICE:");
                    System.out.println("Burger - Php 80.00");
                    break;
                case 2:
                    System.out.println("\nCHOICE:");
                    System.out.println("Fries - Php 90.00");
                    break;
                case 3:
                    System.out.println("\nCHOICE:");
                    System.out.println("Salad - Php 110.00");
                    break;
                case 4:
                    System.out.println("\nCHOICE:");
                    System.out.println("Soda - Php 75.00");
                    break;
                case 5:
                    System.out.println("Thank you! Visit again!");
                    break;
                default:
                    System.out.println("Invalid option, enter again");
                    break;
            }
        }

        sc.close();
    }
}