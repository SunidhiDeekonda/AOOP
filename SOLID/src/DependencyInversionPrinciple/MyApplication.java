package DependencyInversionPrinciple;

public class MyApplication {
    private MessageService messageService;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
