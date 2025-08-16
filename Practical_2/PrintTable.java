package Practical_2;
public class PrintTable {
    public static void main (String[] ags){
        //printing the header
        System.out.printf("%-4s %-4s %-4s%n", "a", "a^2", "a^3");
        //printf = print formatted, %-4s = string, left aligned, width 4, %n = move to the next line

        //loop from 1 to 4
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%-4d %-4d %-4d%n", a, a*a, a*a*a);
            // %-4d (%) - start of a format placeholder, (-) - Left align, (4) - Reserve at least 4 spaces, (d) - print as integer
        }
    }
}
