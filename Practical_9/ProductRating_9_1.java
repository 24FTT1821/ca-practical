package Practical_9;

import java.text.DecimalFormat;

public class ProductRating_9_1 {
    public static void main(String[] args) {
         int[][] ratings = {
            {4, 5, 4},
            {3, 5, 3},
            {4, 5, 3},
            {1, 2, 1}
        };

        String[] criteria = {"Product", "Packaging", "Delivery"};
        DecimalFormat df = new DecimalFormat("0.00");

        // Display header
        System.out.println("Rating\tProduct\tPackaging\tDelivery");

        // Calculate average per criterion
        double[] avgCriteria = new double[3];
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < ratings.length; i++) {
                sum += ratings[i][j];
            }
            avgCriteria[j] = (double) sum / ratings.length;
        }

        System.out.print("Average\t");
        for (double avg : avgCriteria) {
            System.out.print(df.format(avg) + "\t");
        }
        System.out.println("\n");

        // Display average per customer
        for (int i = 0; i < ratings.length; i++) {
            int sum = 0;
            for (int j = 0; j < ratings[i].length; j++) {
                sum += ratings[i][j];
            }
            double avg = (double) sum / ratings[i].length;
            System.out.println("Customer " + (i + 1) + " provide the average rating " + df.format(avg));
        }
    }
}