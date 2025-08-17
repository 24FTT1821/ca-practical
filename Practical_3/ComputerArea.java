package Practical_3;

public class ComputerArea {
    public static void main(String[] args) {
        System.out.println();

       //Making the variables using double for calculating the decimals number
          double base = 4.0;
        double height = 6.0;
        final double PI = 3.14;  // constant Final (makes variable fix point or unchangeable)
        double radius = 8.0;

        // Calculation on areas using the area format working
        double areaOfSquare = base * base;
        double areaOfTriangle = 0.5 * base * height;
        double areaOfCircle = PI * radius * radius;

        // Print result using only ONE System.out.print
        System.out.print("The area of square is " + areaOfSquare + "\n" +
                         "The area of triangle is " + areaOfTriangle + "\n" +
                         "The area of circle is " + areaOfCircle);
        System.out.println();
    }
}


