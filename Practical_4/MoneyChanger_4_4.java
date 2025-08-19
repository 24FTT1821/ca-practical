package Practical_4;

import java.util.Scanner;

public class MoneyChanger_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the number based on the choice between 1 and 2 (1 is for BND to RM)(2 is for RM to BND)
        System.out.print("Enter 1 to convert bnd to rm and 2 vice versa: ");
        int choice = input.nextInt();

        // Putting in the amount of money to convert
        System.out.print("Enter the amount to be converted: $");
        double amount = input.nextDouble();

        // Exchanging the money rate
        double result = (choice == 1) ? amount * 3 : amount / 3;

        System.out.printf("The change is $%.2f\n", result);

        input.close();
    }
}
