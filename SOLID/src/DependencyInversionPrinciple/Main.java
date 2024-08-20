package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MyApplication app = new MyApplication(emailService);
        app.processMessage("Hello via Email");

        MessageService smsService = new SMSService();
        app = new MyApplication(smsService);
        app.processMessage("Hello via SMS");
    }
}

