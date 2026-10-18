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
        int highScore = 0;
        int score;
        for (int goal = 1; goal <= dice.length + 1; goal++) {
            score = checkSingles(dice, goal);
            if (score > highScore) {
                highScore = score;
            }
        }
        score = checkThreeOfKind(dice);
        if (score > highScore) {
            highScore = score;
        }
        score = checkFourOfKind(dice);
        if (score > highScore) {
            highScore = score;
        }
        score = checkFiveOfKind(dice);
        if (score > highScore) {
            highScore = score;
        }
        score = checkFullHouse(dice);
        if (score > highScore) {
            highScore = score;
        }
        score = checkStraight(dice);
        if (score > highScore) {
            highScore = score;
        }
        return highScore;
    }

    // Add all occurences of goal value
    public static int checkSingles(int[] dice, int goal) {
        /* Complete the method and update the return statement */
        int sumOfGoal = 0;
        for (int i = 0; i < dice.length; ++i) {
            if (dice[i] == goal) {
                sumOfGoal += dice[i];
            }
        }
        return sumOfGoal;
    }

    // Check for three of a kind (score = 30)
    public static int checkThreeOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        for (int i = 0; i < dice.length - 2; ++i) {
            if (dice[i] == dice[i + 2]) {
                return 30;
            }
        }
        return 0;
    }

    // Check for four of a kind (score = 40)
    public static int checkFourOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        int score = 0;
        for (int i = 0; i < dice.length - 3; ++i) {
            if (dice[i] == dice[i + 3]) {
                score = 40;
            }
        }
        return score;
    }

    // Check for five of a kind (score = 50)
    public static int checkFiveOfKind(int[] dice) {
        /* Complete the method and update the return statement */
        int score = 0;
        for (int i = 0; i < dice.length - 4; ++i) {
            if (dice[i] == dice[i + 4]) {
                score = 50;
            }
        }
        return score;
    }

    // Check for full house (score = 35)
    public static int checkFullHouse(int[] dice) {
        /* Complete the method and update the return statement */
        int score = 0;
        int i = 0;
        if ((dice[i] == dice[i + 1] && dice[i + 2] == dice[i + 4]) || (dice[i] == dice[i + 2] && dice[i + 3] == dice[i + 4] )) {
                score = 35;
            }

        return score;
    }

    // Check for straight (score = 45)
    public static int checkStraight(int[] dice) {
        /* Complete the method and update the return statement */
        int count = 0;
        for (int i = 1; i <= dice.length; ++i) {
            if (dice[i - 1] == i) {
                count++;
            }
        }
        if (count != 5) {
            count = 0;
        }
        for (int i = 2; i <= dice.length + 1; ++i) {
            if (dice[i - 2] == i) {
                count++;
            }
        }
        if (count == 5) {
            return 45;
        }
        else {
            return 0;
        }
    }
}
