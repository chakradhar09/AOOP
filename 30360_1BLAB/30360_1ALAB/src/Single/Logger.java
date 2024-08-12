package Single;

public class Logger {
    // Static variable reference of single_instance of type Logger
    private static Logger single_instance = null;

    // Private constructor restricted to this class itself
    private Logger() {}

    // Static method to create instance of Logger class
    public static Logger getInstance() {
        //if (single_instance == null) {
        //synchronized (Logger.class) {
        if (single_instance == null) {
            single_instance = new Logger();
            //}
        }
        // }
        return single_instance;
    }

    // Method to log messages
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}

