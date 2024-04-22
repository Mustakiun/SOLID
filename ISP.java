//*************************************************************************
// Title : A java program to demonstrate Interface segregation Principle.
// Author : Mustakiun Alam, Undergrduate student, Khulna University.
//*************************************************************************
/**
 * Interface representing a restaurant that provides vegetarian meals.
 */
interface VegRestaurant {
    /**
     * Method to provide vegetarian meals.
     */
    void vegMeals();
}

/**
 * Interface representing a restaurant that provides non-vegetarian meals.
 */
interface NonVegRestaurant {
    /**
     * Method to provide non-vegetarian meals.
     */
    void nonVegMeals();
}

/**
 * Class representing an ABC Veg Restaurant that provides vegetarian meals.
 */
class ABCVegRestaurant implements VegRestaurant {
    /**
     * Provides vegetarian meals.
     */
    @Override
    public void vegMeals() {
        System.out.println("ABC Veg Restaurant provides vegetarian meals");
    }
}

/**
 * Class representing an XYZ Veg Restaurant that provides both vegetarian and
 * non-vegetarian meals.
 */
class XYZVegRestaurant implements VegRestaurant, NonVegRestaurant {
    /**
     * Provides vegetarian meals.
     */
    @Override
    public void vegMeals() {
        System.out.println("XYZ Veg Restaurant provides vegetarian meals");
    }

    /**
     * Provides non-vegetarian meals.
     */
    @Override
    public void nonVegMeals() {
        System.out.println("XYZ Veg Restaurant provides non-vegetarian meals");
    }
}

/**
 * Main class to demonstrate different types of restaurants.
 */
public class ISP {
    public static void main(String[] args) {
        // Creating instances of restaurants
        ABCVegRestaurant abcRestaurant = new ABCVegRestaurant();
        XYZVegRestaurant xyzRestaurant = new XYZVegRestaurant();

        // Calling methods to provide meals
        abcRestaurant.vegMeals(); // ABC Veg Restaurant provides vegetarian meals
        xyzRestaurant.vegMeals(); // XYZ Veg Restaurant provides vegetarian meals
        xyzRestaurant.nonVegMeals(); // XYZ Veg Restaurant provides non-vegetarian meals
    }
}
/*This code demonstrates the Interface Segregation Principle by defining 
separate interfaces for vegetarian and non-vegetarian restaurants.
 */