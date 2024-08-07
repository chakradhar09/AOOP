public class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService){
        this.messageService = messageService;
    }
    public void sendMessage(String message, String recipient){
        messageService.sendMessage(message, recipient);
    }
}
