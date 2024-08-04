public class InfoHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {

        return logLevel == LogLevel.INFO;
    }

    @Override
    protected void writeMessage(String message) {

        System.out.println("INFO: " + message);
    }
}
