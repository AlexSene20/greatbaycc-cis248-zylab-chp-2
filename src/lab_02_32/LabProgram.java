package lab_02_32;

import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] diceValues = new int[5];
        int highScore = 0;

        // Fill array with five values from input
        for (int i = 0; i < diceValues.length; ++i) {
            diceValues[i] = scnr.nextInt();
        }

        // Place values in ascending order
        Arrays.sort(diceValues);

        // Find high score and output
        highScore = findHighScore(diceValues);
        System.out.println("High score: " + highScore);
    }

    // Find high score
    public static int findHighScore(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Add all occurences of goal value
    public static int checkSingles(int[] dice, int goal) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Check for three of a kind (score = 30)
    public static int checkThreeOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Check for four of a kind (score = 40)
    public static int checkFourOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Check for five of a kind (score = 50)
    public static int checkFiveOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Check for full house (score = 35)
    public static int checkFullHouse(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }

    // Check for straight (score = 45)
    public static int checkStraight(int[] dice) {
        /* Complete the method and update the return statement */
        return -1;
    }
}
