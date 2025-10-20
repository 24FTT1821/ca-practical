package Practical_8;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing_8_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        // Shuffle once
        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        int chances = 10;  // total tries
        boolean win = false;

        while (chances > 0) {
            System.out.println("\nGuess 4 numbers (no duplicates):");
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }

            int correct = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == numbers[i]) {
                    correct++;
                }
            }

            if (correct == 4) {
                System.out.println("You Won! You got the actual number!");
                win = true;
                break;
            } else {
                chances--; // Decrement only after wrong guess
                System.out.println("You have score " + correct + " out of the 4 numbers. You have " + chances + " chances left.");
            }
        }

        if (!win) {
            System.out.print("\nThe actual number is ");
            for (int i = 0; i < 4; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("You Lose.");
        }
    }
}