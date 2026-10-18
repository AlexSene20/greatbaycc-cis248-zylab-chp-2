package lab_02_31;

import java.util.Scanner;

public class LabProgram {

    // Calculate AGI and repair any negative values
    public static int calcAGI(int wages, int interest, int unemployment) {
        /* Complete the method and update the return statement */
        if (wages < 0) {
            wages = -(wages);
        }
        if (interest < 0) {
            interest = -(interest);
        }
        if (unemployment < 0) {
            unemployment = -(unemployment);
        }
        return wages + interest + unemployment;
    }

    // Calculate deduction depending on single, dependent or married
    public static int getDeduction(int status) {
        /* Complete the method and update the return statement */
        if (status == 0) {
            return 6000;
        }
        else if (status == 1) {
            return 12000;
        }
        else if (status == 2) {
            return 24000;
        }
        else {
            return 6000;
        }
    }

    // Calculate taxable but not allow negative results
    public static int calcTaxable(int agi, int deduction) {
        /* Complete the method and update the return statement */
        if (agi - deduction < 0) {
            return 0;
        }
        else {
            return agi - deduction;
        }

    }

    // Calculate tax for single or dependent
    public static int calcTax(int status, int taxable) {
        /* Complete the method and update the return statement */
        int tax = 0;

        if ((status == 0 || status == 1) && (taxable > 0 && taxable <= 10000)) {
            tax = (taxable * 10) / 100;
        }
        else if ((status == 0 || status == 1) && taxable <= 40000) {
            tax = ((taxable - 10000) * 12 / 100) + 1000;
        }
        else if ((status == 0 || status == 1) && taxable <= 85000) {
            tax = ((taxable - 40000) * 22 / 100) + 4600;
        }
        else if ((status == 0 || status == 1) && taxable >= 8501){
            tax = ((taxable - 85000) * 24 / 100) + 14500;
        }
        if (status == 2 && taxable <= 20000){
            tax = (taxable * 10 / 100);
        }
        else if (status == 2 && taxable <= 80000) {
            tax = ((taxable - 20000) * 12 / 100) + 2000;
        }
        else if (status == 2 && taxable > 80000) {
            tax = ((taxable - 80000) * 22 / 100) + 9200;
        }
        return tax;
    }

    // Calculate tax due and check for negative withheld
    public static int calcTaxDue(int tax, int withheld) {
        /* Complete the method and update the return statement */
        if (withheld < 0) {
            withheld = 0;
        }
        return tax - withheld;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wages = 0;
        int interest = 0;
        int unemployment = 0;
        int status = -1;
        int withheld = 0;
        int agi;
        int deduction;
        int fedTax;
        int taxDue;

        // Step #1: Input information
        wages = scan.nextInt();
        interest = scan.nextInt();
        unemployment = scan.nextInt();
        status = scan.nextInt();
        withheld = scan.nextInt();

        // Step #2: Calculate AGI
        agi = calcAGI(wages, interest, unemployment);
        System.out.printf("AGI: $%,d\n", agi);

        deduction = getDeduction(status);
        System.out.printf("Deduction: $%,d\n", deduction);

        System.out.printf("Taxable income: $%,d\n", calcTaxable(agi, deduction));

        fedTax = calcTax(status, calcTaxable(agi, deduction));
        System.out.printf("Federal tax: $%,d\n", fedTax);

        taxDue = calcTaxDue(fedTax, withheld);
        System.out.printf("Tax due: $%,d\n", taxDue);


    }
}