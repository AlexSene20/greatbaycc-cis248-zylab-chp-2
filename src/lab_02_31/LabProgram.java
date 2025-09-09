package lab_02_31;

import java.util.Scanner;

public class LabProgram {

    // Calculate AGI and repair any negative values
    public static int calcAGI(int wages, int interest, int unemployment) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate deduction depending on single, dependent or married
    public static int getDeduction(int status) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate taxable but not allow negative results
    public static int calcTaxable(int agi, int deduction) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate tax for single or dependent
    public static int calcTax(int status, int taxable) {
        /* Complete the method and update the return statement */

        return -1;
    }

    // Calculate tax due and check for negative withheld
    public static int calcTaxDue(int tax, int withheld) {
        /* Complete the method and update the return statement */

        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wages = 0;
        int interest = 0;
        int unemployment = 0;
        int status = -1;
        int withheld = 0;
        int agi;

        // Step #1: Input information


        // Step #2: Calculate AGI
        agi = calcAGI(wages, interest, unemployment);
        System.out.printf("AGI: $%,d\n", agi);

    }
}