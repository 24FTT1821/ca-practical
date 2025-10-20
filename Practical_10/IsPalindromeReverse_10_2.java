package Practical_10;

import java.util.Random;
import java.util.Scanner;

public class IsPalindromeReverse_10_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = 100 + rand.nextInt(900); // generate a number between 100–999
        int reversedNumber = reverse(number);

        int userInput;
        while (true) {
            System.out.print("Enter the reverse of " + number + ": ");
            userInput = input.nextInt();

            // Ensure user enters a 3-digit number
            if (userInput < 100 || userInput > 999) {
                System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
                userInput = input.nextInt();
            }

            // Break loop after valid input
            break;
        }

        boolean isPalindrome = isPalindrome(userInput, reversedNumber);

        System.out.println("\nThe digit " + userInput + " is palindrome of " + number + " is " + isPalindrome + ".");
    }

    // Method to reverse a 3-digit number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    // Method to check if user input is palindrome of the generated number
    public static boolean isPalindrome(int userInput, int reversedNumber) {
        return userInput == reversedNumber;
    }
}