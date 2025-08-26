package Practical_5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt_5_5 {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        System.out.print("Enter name: ");

        // stores user name in uppercase (trim removes spaces)
        String name = in.nextLine().trim().toUpperCase(); 

        try {
            // folder object for storing the receipt
            File folder = new File("Practical 5");

            // create folder if it doesn't exist
            //if (!folder.exists()) folder.mkdirs(); 

             // file object representing the receipt file
            File receipt = new File(folder, "QReceipt.txt"); 

            // writer object to write content to file
            PrintWriter pw = new PrintWriter(new FileWriter(receipt)); 

            // current date & time (24-hour format)
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

            // random queue number between 1–999
            int queue = new Random().nextInt(999) + 1; 

            // writing receipt details into the file
            pw.println("===== QUEUE RECEIPT =====");
            pw.println("Date/Time: " + time);
            pw.println("Welcome, " + name);
            pw.println("Your Queue Number: " + queue);
            pw.println("=========================");
            
            // close the writer to save changes
            pw.close(); 

            System.out.println("Receipt successfully generated.");
        } catch (IOException e) {
            System.out.println("Error creating receipt.");
        }

        in.close(); 
    }
}