public class DebugHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel logLevel) {

        return logLevel == LogLevel.DEBUG;
    }

    @Override
    protected void writeMessage(String message) {

        System.out.println("DEBUG: " + message);
    }
}
