package Practical_7;

import java.util.Scanner;

public class CountingNumbers_7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0, positive = 0, negative = 0, count = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        while (true) {
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) positive++;
            else negative++;

            total += number;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers are entered except for 0 to end the program.");
        } else {
            double average = (double) total / count;
            System.out.println("The number of positives is " + positive);
            System.out.println("The number of negatives is " + negative);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f\n", + average);
            
        }
    }
}
