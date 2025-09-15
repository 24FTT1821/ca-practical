package Practical_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation_6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pre-set username and password
        String correctUser = "Ahmad Ali";
        String correctPass = "12345";

        // Ask user input
        System.out.print("Please enter your username: ");
        String user = input.nextLine();

        System.out.print("Please enter the password: ");
        String pass = input.nextLine();

        // Check username first
        if (!user.equals(correctUser)) {
            System.out.println("\nError: Invalid Username.");
        } else {
            // If username correct, check password
            if (!pass.equals(correctPass)) {
                System.out.println("\nError: Password does not match.");
            } else {
                // If both correct, display welcome with time
                String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
                System.out.println("\nWelcome " + correctUser + ". The time now is " + time);
            }
        }

        input.close();
    }
}