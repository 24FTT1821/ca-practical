package Practical_6;

import java.util.Scanner;

public class RockPaperScissor_6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

   // Generate random number for computer (0-2)
        // We use (int)(Math.random() * 100) % 3 to ensure fairness
        int computer = (int)(Math.random() * 100) % 3;

        // Ask user for choice
        System.out.println("Enter rock (0), paper (1), scissor (2): ");
        int user = input.nextInt();

        // Show choices (convert number to words)
        String[] choices = {"rock", "paper", "scissor"};
        System.out.println("The computer is " + choices[computer] + ". You are " + choices[user] + ".");

        // Use multiple if (not else) for all 9 possibilities
        if (computer == user) {
            System.out.println("It is a draw.");
        }
        if (computer == 0 && user == 1) {
            System.out.println("You Win.");
        }
        if (computer == 0 && user == 2) {
            System.out.println("You Lose.");
        }
        if (computer == 1 && user == 0) {
            System.out.println("You Lose.");
        }
        if (computer == 1 && user == 2) {
            System.out.println("You Win.");
        }
        if (computer == 2 && user == 0) {
            System.out.println("You Win.");
        }
        if (computer == 2 && user == 1) {
            System.out.println("You Lose.");
        }

        input.close();
    }
}