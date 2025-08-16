package Practical_3;

import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user on the same line
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        // Get first character from output

        // Convert character to Unicode value (int)
        int Unicode = (int) ch;

        // Display output
        System.out.println("The Unicode for character "+ ch + " is "+ Unicode);

        System.out.println();
    }
}
