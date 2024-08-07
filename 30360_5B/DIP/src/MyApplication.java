public class MyApplication {
    private final MessageService messageService;

    public MyApplication(MessageService messageService){
        this.messageService = messageService;
    }
    public void sendMessage(String message, String recipient){
        messageService.sendMessage(message, recipient);
    }
}
