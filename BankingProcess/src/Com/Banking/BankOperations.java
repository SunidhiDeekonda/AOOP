package Com.Banking;

public class BankOperations {
	    private UserSession userSession;

	    public BankOperations() {
	        userSession = UserSession.getInstance();
	    }

	    public void viewBalance() {
	        if (userSession.isLoggedIn()) {
	            System.out.println("Viewing balance...");
	            // Logic to view balance
	        } else {
	            System.out.println("Please log in to view balance.");
	        }
	    }

	    public void deposit() {
	        if (userSession.isLoggedIn()) {
	            System.out.println("Depositing money...");
	            // Logic to deposit money
	        } else {
	            System.out.println("Please log in to deposit money.");
	        }
	    }

	    public void withdraw() {
	        if (userSession.isLoggedIn()) {
	            System.out.println("Withdrawing money...");
	            // Logic to withdraw money
	        } else {
	            System.out.println("Please log in to withdraw money.");
	        }
	    }

}
