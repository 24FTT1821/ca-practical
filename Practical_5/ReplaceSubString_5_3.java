package Practical_5;

import java.util.Scanner;

public class ReplaceSubString_5_3 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        // stores the original message from user
        System.out.print("Enter your message: ");
        String msg = input.nextLine(); 
        
        // stores the substring the user wants to replace
        System.out.print("Enter the substring to replace: ");
        String target = input.nextLine(); 
        
        // stores the new word that will replace the old one
        System.out.print("Enter the replacement string: ");
        String newWord = input.nextLine(); 

        // stores the updated message after replacement
        String updated = msg.replaceAll(target, newWord); 

        System.out.println("The updated message is:\n" + updated);

        input.close(); 
    }
}
