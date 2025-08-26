package Practical_5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ModulusQuestion_5_4 {
    public static void main(String[] args) {
                try {
            // random number generator
            Random rand = new Random();

            // first random number (1–200)
            int a = rand.nextInt(200) + 1; 

            // second random number (1–199), avoids zero
            int b = rand.nextInt(199) + 1; 
            
            // stores the modulus question as text
            String question = a + " % " + b + " = ?";
            
            // folder object to store files
            File folder = new File("Practical 5"); 

            // create folder if not exists
            if (!folder.exists()) folder.mkdirs(); 

            // file object for the question text file
            File file = new File(folder, "Modulus Questions.txt"); 

            // writer to append content
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true)); 
            
            // writes the modulus question into file
            bw.write(question); 
            // moves to next line
            bw.newLine(); 
            // closes the writer
            bw.close(); 

            System.out.println("New modulus question added!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
    
}
