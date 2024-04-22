//*************************************************************************
// Title : A java program to demonstrate Single Responsibility Principle.
// Author : Mustakiun Alam, Undergrduate student, Khulna University.
//*************************************************************************
/**
 * Interface representing an ATM with an operation.
 */
interface ATM {
    /**
     * Performs an ATM operation.
     */
    void ATM_OPERATION();
}

/**
 * Represents a bank with an ATM.
 */
 class Bank implements ATM {
    private int atmBalance; // Stores the balance of the bank's ATM

    /**
     * Constructor to initialize the bank's ATM balance.
     * @param atmBalance Initial ATM balance of the bank.
     */
    public Bank(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    @Override
    public void ATM_OPERATION() {
        // For demonstration purposes, let's just print a message
        System.out.println("Money added to Bank ATM. Bank ATM balance increased.");
    }

    /**
     * Gets the balance of the bank's ATM.
     * @return The balance of the bank's ATM.
     */
    public int getAtmBalance() {
        return atmBalance;
    }
}

/**
 * Represents a customer with an ATM card.
 */
class Customer implements ATM {
    private int atmBalance; // Stores the balance of the customer's ATM

    /**
     * Constructor to initialize the customer's ATM balance.
     * @param atmBalance Initial ATM balance of the customer.
     */
    public Customer(int atmBalance) {
        this.atmBalance = atmBalance;
    }

    @Override
    public void ATM_OPERATION() {
        // For demonstration purposes, let's just print a message
        System.out.println("Money withdrawn from Customer ATM. Customer ATM balance decreased.");
    }

    /**
     * Gets the balance of the customer's ATM.
     * @return The balance of the customer's ATM.
     */
    public int getAtmBalance() {
        return atmBalance;
    }
}

/**
 * Main class to demonstrate ATM operations.
 */ 
  public class DIP{
    /**
     * The main method to run the ATM operations.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        Customer customer = new Customer(5000);

        // Display initial ATM balances
        System.out.println("Bank ATM Balance: " + bank.getAtmBalance());
        System.out.println("Customer ATM Balance: " + customer.getAtmBalance());

        // Perform ATM operations
        bank.ATM_OPERATION(); // Adding money to bank ATM
        customer.ATM_OPERATION(); // Withdrawing money from customer ATM

        // Display updated ATM balances
        System.out.println("Bank ATM Balance: " + bank.getAtmBalance());
        System.out.println("Customer ATM Balance: " + customer.getAtmBalance());
    }
}
/* This code demonstrates the Dependency Inversion Principle by defining 
interfaces for ATM operations and implementing them in different classes.
 */