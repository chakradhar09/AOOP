public class BankOperations {
    public static void main(String[] args) {
        UserLoginState loginState = UserLoginState.getInstance();

        // Attempt to view balance without logging in
        viewBalance();

        // Logging in
        loginState.login("john_doe");

        // Attempt to view balance after logging in
        viewBalance();

        // Deposit money
        deposit(100);

        // Withdraw money
        withdraw(50);

        // Logging out
        loginState.logout();

        // Attempt to withdraw money after logging out
        withdraw(20);
    }

    public static void viewBalance() {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Viewing balance for " + loginState.getUsername());
            // Logic to view balance
        } else {
            System.out.println("You must log in to view your balance.");
        }
    }

    public static void deposit(int amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Depositing " + amount + " for " + loginState.getUsername());
            // Logic to deposit money
        } else {
            System.out.println("You must log in to deposit money.");
        }
    }

    public static void withdraw(int amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Withdrawing " + amount + " for " + loginState.getUsername());
            // Logic to withdraw money
        } else {
            System.out.println("You must log in to withdraw money.");
        }
    }
}
