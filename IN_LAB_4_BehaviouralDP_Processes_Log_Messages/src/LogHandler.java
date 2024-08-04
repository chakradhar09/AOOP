public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {

        this.nextHandler = nextHandler;
    }

    public void handle(LogCommand logCommand) {
        if (canHandle(logCommand.getLogLevel())) {
            writeMessage(logCommand.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handle(logCommand);
        }
    }

    protected abstract boolean canHandle(LogLevel logLevel);

    protected abstract void writeMessage(String message);
}
