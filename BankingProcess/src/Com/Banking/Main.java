package Com.Banking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserSession userSession = UserSession.getInstance();
        BankOperations bankOperations = new BankOperations();

        // Attempt to perform operations without logging in
        bankOperations.viewBalance();
        bankOperations.deposit();
        bankOperations.withdraw();

        // Log in and perform operations
        userSession.login();
        bankOperations.viewBalance();
        bankOperations.deposit();
        bankOperations.withdraw();

        // Log out and attempt to perform operations
        userSession.logout();
        bankOperations.viewBalance();
	}

}
