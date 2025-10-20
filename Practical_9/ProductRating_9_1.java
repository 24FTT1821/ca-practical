package Practical_9;

import java.text.DecimalFormat;

public class ProductRating_9_1 {
    public static void main(String[] args) {
        // Ratings by 4 customers for Rating, Product, Package, Delivery
        double[][] ratings = {
            {4, 5, 4, 4},  // Customer 1
            {3, 4, 4, 3},  // Customer 2
            {4, 5, 3, 4},  // Customer 3
            {1, 3, 2, 1}   // Customer 4
        };

        int numCustomers = ratings.length;
        int numCategories = ratings[0].length;

        // Calculate average per category
        double[] categoryAverages = new double[numCategories];
        for (int j = 0; j < numCategories; j++) {
            double sum = 0;
            for (int i = 0; i < numCustomers; i++) {
                sum += ratings[i][j];
            }
            categoryAverages[j] = sum / numCustomers;
        }

        // Print category averages
        System.out.println("<output>");
        System.out.println("Rating   Product Package Delivery");
        System.out.printf("Average %.2f    %.2f    %.2f%n%n", 
                          categoryAverages[0], categoryAverages[1], categoryAverages[2]);

        // Print each customer's average
        for (int i = 0; i < numCustomers; i++) {
            double total = 0;
            for (int j = 0; j < numCategories; j++) {
                total += ratings[i][j];
            }
            double average = total / numCategories;
            System.out.printf("Customer %d provide the average rating %.2f%n", (i + 1), average);
        }

        System.out.println("\n<output>");
    }
}
