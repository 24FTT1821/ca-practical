package Practical_3;

import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Step 1: Ask for target amount
        System.out.print("What is your target amount? $");
        double targetAmount = input.nextDouble();

        // Step 2: Ask for number of months
        System.out.print("How many month(s) to reach your goal? ");
        int months = input.nextInt();

        // Step 3: Calculate days and savings per day
        int totalDays = months * 30;
        double savePerDay = targetAmount / totalDays;

        // Step 4: Display result with 2 decimal places
        System.out.printf("The amount you need to save per day is $%.2f\n", savePerDay);

        System.out.println();
    }
}
