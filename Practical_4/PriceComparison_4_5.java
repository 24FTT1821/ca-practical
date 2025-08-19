package Practical_4;

import java.util.Scanner;

public class PriceComparison_4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //entering the 1st package variable price & weight
        System.out.print("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();
        System.out.print("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();

        //Entering the 2nd package variable price & weight
        System.out.print("Enter the price of the 2nd package: $");
        double price2 = input.nextDouble();
        System.out.print("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();

        //Calculating the grams per dollar
        double value1 = weight1 / price1;
        double value2 = weight2 / price2;

        //Comparing between 2 value which are more better
        String result = (value1 > value2) ? "It is worth more to buy the 1st package"
                                          : "It is worth more to buy the 2nd package";

        System.out.println(result);

        input.close();
    }
}
