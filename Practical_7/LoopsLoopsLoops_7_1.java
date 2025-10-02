package Practical_7;

public class LoopsLoopsLoops_7_1 {
    public static void main(String[] args) {
        //while loop: 1 to 20
        System.out.println("Below is generated using while loop: ");
        int l = 1;
        while (l <= 20) {
            System.out.print(l + " ");
            l++;
        }
        System.out.println();

        //do while loop: 50 to 35
        System.out.println("Below is generated using do while loop: ");
        int m = 50;
        do {
            System.out.print(m + " ");
            m--;
        } while (m >= 35);
        System.out.println();

        //loop for: a to z
        System.out.println("Below is generated using for loop: ");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
    }
        System.out.println();
    }
}
