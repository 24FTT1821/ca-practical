package Practical_3;

import java.util.Scanner;

public class NumberOfDurians {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        
        double durianPrice = 15.75;
        //To calculate w the decimal using double

        System.out.println("Each durian cost $" + durianPrice);
        System.out.print("How much money do you have? $");
        double money = input.nextDouble();
        //nextInt() means reads next the next Integer value that user type in

        // Calculate number of durians (whole number using type casting)
        int numberOfDurians = (int)(money / durianPrice);

        System.out.println("The number of durian(s) you can buy is " + numberOfDurians);

        System.out.println();
    }
}
