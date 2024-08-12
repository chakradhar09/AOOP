public class DebugHandler extends LogHandler {
    @Override
    protected boolean canHandle(LogLevel level) {
        return level == LogLevel.DEBUG;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("DEBUG: " + message);
    }
}