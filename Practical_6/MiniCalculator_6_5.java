package Practical_6;

import java.util.Scanner;

public class MiniCalculator_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Capture input (numbers and operator separated by spaces)
        System.out.print("Enter an arithmetic expression (example: 5 + 3): ");
        int num1 = input.nextInt();   // first number
        String op = input.next();     // operator (+, -, *, /)
        int num2 = input.nextInt();   // second number

        // Switch based on operator
        switch (op) {
            case "+":
                System.out.println("The sum is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The subtraction is " + (num1 - num2));
                break;
            case "*":
                System.out.println("The multiplication is " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Math error: The divisor cannot be Zero");
                } else {
                    System.out.println("The division is " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        input.close();
    }
}
