package Practical_8;

public class PrintingAlternatingAlphabet_8_1 {
    public static void main(String[] args) {
         String[] alphabet = new String[26];
        
        // Populate the alphabet array with a–z
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf((char) ('a' + i));
        }

        // Use one for loop with two counters: i increasing, j decreasing
        for (int i = 0, j = 25; i < 26 && j >= 0; i++, j--) {
            System.out.print(alphabet[i] + " " + alphabet[j] + " ");
        }
    }
}