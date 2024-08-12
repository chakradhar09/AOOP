public class Client {
    public static void main(String[] args) {
        // Configure the chain of handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger and add commands
        Logger logger = new Logger();

        Command logInfo = new LogCommand(infoHandler, LogLevel.INFO, "This is an info message.");
        Command logDebug = new LogCommand(infoHandler, LogLevel.DEBUG, "This is a debug message.");
        Command logError = new LogCommand(infoHandler, LogLevel.ERROR, "This is an error message.");

        logger.addCommand(logInfo);
        logger.addCommand(logDebug);
        logger.addCommand(logError);

        // Process commands
        logger.processCommands();
    }
}
