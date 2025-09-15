package Practical_6;

import java.util.Scanner;

public class AddFourNumber_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   // Generate 4 random numbers between 0 - 99
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        int number3 = (int)(Math.random() * 100);
        int number4 = (int)(Math.random() * 100);

        int sum = number1 + number2 + number3 + number4; // correct answer

        // Ask user for the sum
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + " + " + number4 + "?");
        int answer = input.nextInt();

        // Use if-else to check answer
        if (answer == sum) {
            System.out.println("Well done, you are correct!");
        } else {
            System.out.println("Nice try, the sum should be " + sum);
        }

        input.close();
    }
}