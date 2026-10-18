package lab_02_33;

public class FancyCar {

    // Declare private fields
    private final int FULL_TANK = 14;
    private int milesDriven;
    private double galsInTank;
    private double milesPerGal;
    private double driveCapacity;
    private String carModel;
    private boolean engineOn;

    // Default constructor
    public FancyCar() {
        /* Complete the method */
        milesDriven = 5;
        galsInTank = FULL_TANK;
        milesPerGal = 24.0;
        carModel = "Old Clunker";
        engineOn = false;
    }

    // Constructor (String make, double mpg)
    public FancyCar(String make, double mpg) {
        /* Complete the method */
        carModel = make;
        milesPerGal = mpg;
        galsInTank = FULL_TANK;
        milesDriven = 5;
        engineOn = false;
    }

    // Return car model
    public String getModel() {
        /* Update the return statment */
        return carModel;
    }

    // Return miles per gallon (MPG)
    public double getMPG() {
        /* Update the return statment */
        return milesPerGal;
    }

    // Return miles on odometer
    public int checkOdometer() {
        /* Update the return statment */
        return milesDriven;
    }

    // Return amount of gas in tank
    public double checkGasGauge() {
        /* Update the return statment */
        return galsInTank;
    }

    // Honk horn
    public void honkHorn() {
        /* Complete the method */
        System.out.println("The " + getModel() + " says beep beep!");
    }

    // Drive car requested miles but check for enough
    // gas and check for positive value
    public void drive(int milesToDrive) {
        /* Complete the method */
        double maxMiles = galsInTank * milesPerGal;
        if (milesToDrive > 0 && engineOn) {
            if (milesToDrive > maxMiles) {
                milesDriven += (int) maxMiles;
                galsInTank = 0.0;
                engineOn = false;
            } else {
                milesDriven += milesToDrive;
                galsInTank -= milesToDrive / milesPerGal;
            }
        }
    }

    // Add gas to tank. Check for positive value.
    public void addGas(double amtToAdd) {
        /* Complete the method */
        if (amtToAdd > 0 && !engineOn) {
            if (galsInTank + amtToAdd > FULL_TANK) {
                galsInTank = FULL_TANK;
            }
            else {
                galsInTank += amtToAdd;
            }
        }
    }

    // Set boolean variable to true
    public void startEngine() {
        /* Complete the method */
        engineOn = true;
    }

    // Set boolean variable to false
    public void stopEngine() {
        /* Complete the method */
        engineOn = false;
    }

}