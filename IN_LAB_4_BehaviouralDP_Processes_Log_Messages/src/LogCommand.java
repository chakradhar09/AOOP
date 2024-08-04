public class LogCommand implements Command {
    private LogLevel logLevel;
    private String message;

    public LogCommand(LogLevel logLevel, String message) {
        this.logLevel = logLevel;
        this.message = message;
    }

    @Override
    public void execute(String message) {
        // This will be handled by LogHandler
    }

    public LogLevel getLogLevel() {

        return logLevel;
    }

    public String getMessage() {

        return message;
    }
}
