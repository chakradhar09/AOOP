public abstract class EmailService implements MessageService{
    public void sendMessage(String message, String recipient){
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
