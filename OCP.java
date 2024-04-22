//*************************************************************************
// Title : A java program to demonstrate Single Responsibility Principle.
// Author : Mustakiun Alam, Undergrduate student, Khulna University.
//*************************************************************************
/**
 * Interface representing an entity with a method to calculate BMI.
 */
interface Entity {
    /**
     * Calculates the Body Mass Index (BMI) of the entity.
     * 
     * @return The calculated BMI.
     */
    double calculateBMI();
}

/**
 * Represents a person named Ikbal with height and weight attributes.
 */
class Ikbal implements Entity {
    private int height; // Height of Ikbal in centimeters
    private int weight; // Weight of Ikbal in kilograms

    /**
     * Constructs an Ikbal object with given height and weight.
     * 
     * @param height Height of Ikbal in centimeters.
     * @param weight Weight of Ikbal in kilograms.
     */
    public Ikbal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {
        // BMI formula: weight (kg) / (height (m) * height (m))
        double heightInMeters = height / 100.0; // Converting height from cm to meters
        return weight / (heightInMeters * heightInMeters);
    }
}

/**
 * Represents a person named Nasim with height and weight attributes.
 */
class Nasim implements Entity {
    private int height; // Height of Nasim in centimeters
    private int weight; // Weight of Nasim in kilograms

    /**
     * Constructs a Nasim object with given height and weight.
     * 
     * @param height Height of Nasim in centimeters.
     * @param weight Weight of Nasim in kilograms.
     */
    public Nasim(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {
        // BMI formula: weight (kg) / (height (m) * height (m))
        double heightInMeters = height / 100.0; // Converting height from cm to meters
        return weight / (heightInMeters * heightInMeters);
    }
}

/**
 * Represents a dog with height and weight attributes.
 */
class Dog implements Entity {
    private int height; // Height of the dog in centimeters
    private int weight; // Weight of the dog in kilograms

    /**
     * Constructs a Dog object with given height and weight.
     * 
     * @param height Height of the dog in centimeters.
     * @param weight Weight of the dog in kilograms.
     */
    public Dog(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double calculateBMI() {
        // BMI formula: weight (kg) / (height (m) * height (m))
        double heightInMeters = height / 100.0; // Converting height from cm to meters
        return weight / (heightInMeters * heightInMeters);
    }
}

/**
 * Main class to demonstrate BMI calculation for entities.
 */
public class OCP {
    /**
     * The main method to create entities and calculate their BMI.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create Ikbal
        Ikbal ikbal = new Ikbal(180, 79);
        System.out.println("Ikbal's BMI: " + ikbal.calculateBMI());

        // Create Nasim
        Nasim nasim = new Nasim(160, 55);
        System.out.println("Nasim's BMI: " + nasim.calculateBMI());

        // Create Dog
        Dog dog = new Dog(40, 8);
        System.out.println("Dog's BMI: " + dog.calculateBMI());
    }
}
// This code calculates the Body Mass Index (BMI) for different entities.