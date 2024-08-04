public class ErrorHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {

        return logLevel == LogLevel.ERROR;
    }

    @Override
    protected void writeMessage(String message) {

        System.out.println("ERROR: " + message);
    }
}
