public class UserAuthentication {
    private static UserAuthentication single_instance = null;
    private boolean isAuthenticated;
    private String username;

    private UserAuthentication() {
        isAuthenticated = false;
        username = null;
    }

    public static UserAuthentication getInstance() {
        if (single_instance == null) {
            single_instance = new UserAuthentication();
        }
        return single_instance;
    }

    public void login(String username) {
        if (!isAuthenticated) {
            this.username = username;
            isAuthenticated = true;
            System.out.println(username + " has logged in.");
        } else {
            System.out.println("Already logged in as " + this.username);
        }
    }

    public void logout() {
        if (isAuthenticated) {
            System.out.println(username + " has logged out.");
            username = null;
            isAuthenticated = false;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public String getUsername() {
        return username;
    }
}
