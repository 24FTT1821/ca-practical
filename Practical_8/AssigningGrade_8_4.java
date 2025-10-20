package Practical_8;

import java.util.Scanner;

public class AssigningGrade_8_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         
        System.out.println("Enter the number of students:");
        int num = input.nextInt();
        
        int[] scores = new int[num];
        char[] grades = new char[num];
        
        System.out.println("\nEnter the " + num + " scores");
        int best = 0;
        for (int i = 0; i < num; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        
        // Determine grades
        for (int i = 0; i < num; i++) {
            if (scores[i] >= best - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= best - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= best - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= best - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        // Display output
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}
