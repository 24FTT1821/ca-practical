package Practical_4;

import java.util.Scanner;

public class MathQuiz_4_1 {
    public static void main(String[] args) {
        //input Scanner
       Scanner input = new Scanner(System.in);

       //Creating two variable for random numbers using Math.random()
       int number1 = (int)(Math.random()*100);
       int number2 = (int)(Math.random()*100);

       //After finding the total from the percentage proceed with addition
         System.out.print("What is " + number1 + " + " + number2 + " ? ");
        int total = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + total + " is " + (total == (number1 + number2)));

        //Calculating the modulus, finding remainder after divsion 
          System.out.print("What is " + number1 + " % " + number2 + " ? ");
        int userMod = input.nextInt();
        System.out.println(number1 + " % " + number2 + " = " + userMod + " is " + (userMod == (number1 % number2)));

        input.close();
    }   
}
