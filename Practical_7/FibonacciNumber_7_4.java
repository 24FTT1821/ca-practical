package Practical_7;

import java.util.Scanner;

public class FibonacciNumber_7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the term: ");
        int term = input.nextInt();

        int f0 = 0, f1 = 1, f2 = 0;

        if (term == 0) {
            System.out.println("Fibonacci number F(0) is " + f0);
        } else if (term == 1) {
            System.out.println("Fibonacci number F(1) is " + f1);
        } else {
            for (int i = 2; i <= term; i++) {
                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            System.out.println("At term " + term + " is " + f2);
        }
    }
}
