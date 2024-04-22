//*************************************************************************
// Title : A java program to demonstrate Single Responsibility Principle.
// Author : Mustakiun Alam, Undergrduate student, Khulna University.
//*************************************************************************
/**
 * This class represents a service for managing accounts.
 */
class AccountService {

    /** The repository to manage accounts. */
    AccountRepository repository = new AccountRepository();

    /** The service for sending notifications. */
    NotificationService notificationService = new NotificationService();

    /**
     * Opens a new account.
     */
    public void openAccount() {
        System.out.println("Fill account internal details");
        repository.create();
        notificationService.sendNotification();
    }
}

/**
 * This class represents a repository for storing accounts.
 */
class AccountRepository {
    /**
     * Creates a new account in the database.
     */
    public void create() {
        System.out.println("Store account object in database");
    }
}

/**
 * This class represents a service for sending notifications.
 */
class NotificationService {
    /**
     * Sends a notification to the user.
     */
    public void sendNotification() {
        System.out.println("send out welcome message");
    }
}

/**
 * This class demonstrates the usage of the AccountService class.
 */
public class SRP {
    /**
     * The main method to run the program.
     * 
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        AccountService service = new AccountService();
        service.openAccount();
    }
}
/**
 * It consists of classes representing services for managing accounts ,
 * sending notifications,
 * as well as a class for storing account data.
 */
