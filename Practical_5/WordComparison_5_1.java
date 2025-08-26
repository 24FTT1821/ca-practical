package Practical_5;

import java.util.Scanner;

public class WordComparison_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the first word: ");
        String first = input.nextLine();

        System.out.print("Enter the second word: ");
        String second = input.nextLine();

        // convert both to lowercase before comparing
        boolean result = first.toLowerCase().equals(second.toLowerCase());

        System.out.println("Are both words the same? " + result);

        input.close();
    }
}
