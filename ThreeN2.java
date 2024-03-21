import java.util.Scanner;

/**
 * ThreeN2
 * A program that computes and displays several 3N+1 sequences. Starting
 * values for the sequences are input by the user. Terms in the sequence
 * are printed in columns, with five terms on each line of output.
 * After a sequence has been displayed, the number of terms in that
 * sequence is reported to the user.
 */
public class ThreeN2 {
    public static void main(String[] args) {
        int initK; // Starting point for sequence, specified by the user.

        Scanner stdin = new Scanner(System.in); // Open stdin from keyboard

        System.out.println("This program will print out 3N+1 sequences");
        System.out.println("for starting values that you specify.");
        System.out.println();

        do {
            System.out.println("Enter a starting value;");
            System.out.print("To end the program, enter 0: ");
            initK = stdin.nextInt();
            if (initK > 0) {
                print3NSequence(initK);
            }

        } while (initK > 0); // continue only if K > 0
        System.out.println("Done!");

        stdin.close();
    }

    private static void print3NSequence(int k) {
        System.out.println("print3NSequence for " + k + "...");
    }
}