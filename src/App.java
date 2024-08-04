public class App {
    public static void main(String[] args) throws Exception {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create Logger
        Logger logger = new Logger();

        // Create log commands
        LogCommand infoLog = new LogCommand(LogLevel.INFO, "This is an info message.");
        LogCommand debugLog = new LogCommand(LogLevel.DEBUG, "This is a debug message.");
        LogCommand errorLog = new LogCommand(LogLevel.ERROR, "This is an error message.");

        // Add commands to logger
        logger.addCommand(infoLog);
        logger.addCommand(debugLog);
        logger.addCommand(errorLog);

        // Process commands
        logger.processCommands(infoHandler);
    }
}
