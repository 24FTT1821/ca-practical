package Practical_3;

import java.util.Scanner;

public class ConvertBytesIntoBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Asking the user for number of bytes
        System.out.println("Enter the number of byte(s) to be converted: ");
        int bytes = input.nextInt();
        //nextInt() means reads next the next Integer value that user type in

        //Conversion of 1 bytes = 8 Bits
        int bits = bytes*8;

        //Display the output
        System.out.println(bytes+ " byte(s) is "+ bits + " bits ");

        System.out.println();
    }
}
