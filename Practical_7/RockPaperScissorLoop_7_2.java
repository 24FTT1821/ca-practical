package Practical_7;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop_7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int rounds = 0, userScore = 0, compScore = 0;
        String cont;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = input.nextInt();
            int compChoice = random.nextInt(3);

            // Show computer choice
            String[] names = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + names[compChoice] + ". You are " + names[userChoice] + ".");

            // Decide result
            if (userChoice == compChoice) {
                System.out.println("It is a draw.");
            } else if ((userChoice == 0 && compChoice == 2) 
                       || (userChoice == 1 && compChoice == 0) 
                       || (userChoice == 2 && compChoice == 1)) {
                System.out.println("You win.");
                userScore++;
            } else {
                System.out.println("You lose.");
                compScore++;
            }

            rounds++;
            System.out.print("\nEnter y to play again: ");
            cont = input.next();

        } while (cont.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userScore +
                           ", Computer scored " + compScore);

        if (userScore > compScore) {
            System.out.println("You won the game.");
        } else if (userScore < compScore) {
            System.out.println("You lose the game.");
        } else {
            System.out.println("It is a draw game.");
        }
    }
}