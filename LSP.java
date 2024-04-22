//*************************************************************************
// Title : A java program to demonstrate  Liskov Substitution  Principle.
// Author : Mustakiun Alam, Undergrduate student, Khulna University.
//*************************************************************************
/**
 * This is the base class representing a vehicle.
 */
class Vehicle {
    /**
     * Method to start the vehicle.
     */
    public void start() {
        System.out.println("starting a vehicle");
    }

    /**
     * Method to stop the vehicle.
     */
    public void stop() {
        System.out.println("stopping a vehicle");
    }
}

/**
 * This class represents a Bike, which is a type of Vehicle.
 */
class Bike extends Vehicle {
    /**
     * Overrides the start method to start a Bike.
     */
    @Override
    public void start() {
        System.out.println("starting a Bike");
    }

    /**
     * Overrides the stop method to stop a Bike.
     */
    @Override
    public void stop() {
        System.out.println("stopping a Bike");
    }
}

/**
 * This class represents a Car, which is a type of Vehicle.
 */
class Car extends Vehicle {
    /**
     * Overrides the start method to start a Car.
     */
    @Override
    public void start() {
        System.out.println("starting a Car");
    }

    /**
     * Overrides the stop method to stop a Car.
     */
    @Override
    public void stop() {
        System.out.println("stopping a Car");
    }
}

/**
 * This class demonstrates the Liskov Substitution Principle (LSP) with the
 * testDrive method.
 */
public class LSP {
    /**
     * Method to test drive a vehicle.
     * 
     * @param vehicle The vehicle to test drive.
     */
    static void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }

    /**
     * Main method to test drive different vehicles.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        testDrive(new Vehicle()); // Test driving a Vehicle
        testDrive(new Bike()); // Test driving a Bike
        testDrive(new Car()); // Test driving a Car
    }
}
/*This code demonstrates the Liskov Substitution Principle by testing
* the drive functionality of different vehicles.
*/