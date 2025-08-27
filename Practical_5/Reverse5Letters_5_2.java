package Practical_5;

import java.util.Scanner;

public class Reverse5Letters_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
             // Step 1: Ask user for 5-letter word
        System.out.print("Enter the 5 letters word: ");
        String word = input.next();
        
        // Check if word length is exactly 5
        if (word.length() != 5) {
            System.out.println("Error: The word must be exactly 5 letters.");
            
        } else {
            // Step 2: Reverse using charAt()
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse += word.charAt(i);
            }

            // Step 3: Output the reverse word
            System.out.println("The reverse of the word " + word + " is " + reverse);
        }

        input.close();
    }
}
