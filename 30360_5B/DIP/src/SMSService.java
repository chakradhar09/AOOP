public abstract class SMSService implements MessageService{
    public void sendMessage(String message, String recipient){
        System.out.println("Sending SMS to: " + recipient + ": " + message);
    }
}
