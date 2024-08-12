public class LogCommand implements Command {
    private LogHandler handler;
    private LogLevel level;
    private String message;

    public LogCommand(LogHandler handler, LogLevel level, String message) {
        this.handler = handler;
        this.level = level;
        this.message = message;
    }

    @Override
    public void execute(String message) {
        handler.handleRequest(level, message);
    }
}
