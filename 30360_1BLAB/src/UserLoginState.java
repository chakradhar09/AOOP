public class UserLoginState {
    // Static variable reference of single_instance of type UserLoginState
    private static UserLoginState single_instance = null;

    // Variable to store the login state
    private boolean loggedIn;
    private String username;

    // Private constructor restricted to this class itself
    private UserLoginState() {
        loggedIn = false;
        username = null;
    }

    // Static method to create instance of Singleton class
    public static UserLoginState getInstance() {
        if (single_instance == null)
            single_instance = new UserLoginState();

        return single_instance;
    }

    // Method to login the user
    public void login(String username) {
        if (!loggedIn) {
            this.username = username;
            loggedIn = true;
            System.out.println(username + " has logged in.");
        } else {
            System.out.println("Already logged in as " + this.username);
        }
    }

    // Method to logout the user
    public void logout() {
        if (loggedIn) {
            System.out.println(username + " has logged out.");
            username = null;
            loggedIn = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    // Method to check if a user is logged in
    public boolean isLoggedIn() {
        return loggedIn;
    }

    // Method to get the logged-in username
    public String getUsername() {
        return username;
    }
}
