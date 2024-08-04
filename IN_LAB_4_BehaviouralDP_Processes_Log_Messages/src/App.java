public class App {
    public static void main(String[] args) throws Exception {
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        Logger logger = new Logger();

        LogCommand infoLog = new LogCommand(LogLevel.INFO, "This is an info message.");
        LogCommand debugLog = new LogCommand(LogLevel.DEBUG, "This is a debug message.");
        LogCommand errorLog = new LogCommand(LogLevel.ERROR, "This is an error message.");

        logger.addCommand(infoLog);
        logger.addCommand(debugLog);
        logger.addCommand(errorLog);

        logger.processCommands(infoHandler);
    }
}
