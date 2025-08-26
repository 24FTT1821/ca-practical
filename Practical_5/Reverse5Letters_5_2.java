package Practical_5;

import java.util.Scanner;

public class Reverse5Letters_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the 5 letters word: ");
        String word = input.nextLine(); 
        // stores the word entered by user

        if (word.length() == 5) { 
            //StringBuilder helps reverse the characters
            String reversed = new StringBuilder(word).reverse().toString(); 
            //reversed word
            System.out.println("The reverse of the word " + word + " is " + reversed);
        } else {
            System.out.println("Error: Word must be exactly 5 characters long.");
        }
        
        //close the scanner to free resources
        input.close(); 
    }
}
