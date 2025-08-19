package Practical_4;

import java.util.Scanner;

public class ReverseOfInteger_4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println();
        //Type in choice of the number between 100 to 999
        System.out.print("Enter an integer between 100 and 999: ");
        int number = input.nextInt();

        // Using the number we chose then to divide by 10
        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number;
        // "/=" is remove last digit, "%" is taking remainder or last digit

        System.out.println("The reverse of " + (digit3 * 100 + digit2 * 10 + digit1) + " is " + (digit1 * 100 + digit2 * 10 + digit3));

        System.out.println();

        input.close();
    }
}
