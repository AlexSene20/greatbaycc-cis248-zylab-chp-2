package lab_02_34;

public class SelfPayKiosk {
    private final double SALES_TAX = 0.07;
    private int servedCustomers;
    private double totSales;
    private double currAmountDue;
    private boolean checkedOut = false;


    // Constructor
    public SelfPayKiosk() {
        /* Complete the method */
        servedCustomers = 0;
        totSales = 0;
        currAmountDue = 0;
    }

    // Return total daily sales
    public double getTotalSales() {
        /* Update the return statment */
        return totSales;
    }

    // Return current amount due
    public double getAmountDue() {
        /* Update the return statment */
        return currAmountDue;
    }

    // Return number of customers served
    public int getNumCustomers() {
        /* Update the return statment */
        return servedCustomers;
    }

    // Scan one item
    public void scanItem(double price) {
        /* Complete the method */
        if (price > 0) {
            currAmountDue += price;
        }
    }

    // Apply sales tax to current purchases
    public void checkOut() {
        /* Complete the method */
        checkedOut = true;
        currAmountDue +=  currAmountDue * SALES_TAX;
    }

    // Cancel current purchases
    public void cancelTransaction() {
        /* Complete the method */
        if (!checkedOut) {
            currAmountDue = 0;
        }

    }

    // Reset register for the day
    public void resetKiosk() {
        /* Complete the method */
        servedCustomers = 0;
        currAmountDue = 0;
        totSales = 0;
    }

    // Apply payment to amount due
    public void makePayment(double payment) {
        /* Complete the method */
            if (payment > 0 && checkedOut) {
                if (payment >= currAmountDue) {
                    totSales += currAmountDue;
                    servedCustomers++;
                    currAmountDue = 0;
                    checkedOut = false;
                }
                else {
                    totSales += payment;
                    currAmountDue -= payment;

                }
            }
    }

    // Simulate multiple transactions
    public void simulateSales(int numSales, double initialPrice, double incrPrice) {
        /* Complete the method */
        for (int i = 0; i < numSales; i++) {
            scanItem(initialPrice);
            checkOut();
            makePayment(currAmountDue + 1);
            initialPrice += incrPrice;

        }

    }
}
