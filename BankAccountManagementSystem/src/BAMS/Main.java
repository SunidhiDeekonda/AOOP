package BAMS;

public class Main {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(1000);

        Thread user1 = new Thread(new User(sharedAccount, true, 200), "User1");
        Thread user2 = new Thread(new User(sharedAccount, false, 150), "User2");
        Thread user3 = new Thread(new User(sharedAccount, true, 300), "User3");
        Thread user4 = new Thread(new User(sharedAccount, false, 500), "User4");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
    }
}

