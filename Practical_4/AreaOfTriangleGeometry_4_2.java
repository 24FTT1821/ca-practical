package Practical_4;

import java.util.Scanner;

public class AreaOfTriangleGeometry_4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three coordinates for a triangle: ");
        //Continuous line for input the numbers, Store the 3 input points
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double a3 = input.nextDouble();
        double b3 = input.nextDouble();

        //Store lengths of the triangle sides using distance formula
        double side1 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        double side2 = Math.sqrt(Math.pow(b3 - b2, 2) + Math.pow(b3 - b2, 2));
        double side3 = Math.sqrt(Math.pow(a1 - a3, 2) + Math.pow(b1 - b3, 2));
        // Math.sqrt = Square root, Math.pow =  Raise a to the power of b.

        //Finding the perimeter of the triangle
        double s = (side1 + side2 + side3) / 2;
        //Finding the area of the triangle
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The area of the triangle is %.1f\n", area);

        input.close();
    }
}
