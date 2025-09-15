package Practical_6;

import java.util.Scanner;

public class MiniCalculator_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to type an arithmetic expression (example: 5 + 3)
        System.out.print("Enter an arithmetic expression: ");

        // Capture first number, operator (as String), and second number
        int num1 = input.nextInt();    // Reads first integer
        String operator = input.next(); // Reads the operator (+, -, *, /)
        int num2 = input.nextInt();    // Reads second integer

        // Use switch to decide which operation to perform
        switch (operator) {
            case "+": // If operator is "+"
                System.out.println("The sum is " + (num1 + num2));
                break;

            case "-": // If operator is "-"
                System.out.println("The subtraction is " + (num1 - num2));
                break;

            case "*": // If operator is "*"
                System.out.println("The multiplication is " + (num1 * num2));
                break;

            case "/": // If operator is "/"
                if (num2 == 0) { 
                    // Special case: division by 0 is not allowed
                    System.out.println("Math error: The divisor cannot be Zero");
                } else {
                    // Perform integer division if divisor is not 0
                    System.out.println("The division is " + (num1 / num2));
                }
                break;

            default: // If user enters something other than +, -, *, /
                System.out.println("Invalid operator.");
        }
    }
}

