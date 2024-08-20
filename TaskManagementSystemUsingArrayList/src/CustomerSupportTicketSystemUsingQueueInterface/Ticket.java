package CustomerSupportTicketSystemUsingQueueInterface;

public class Ticket {
    private String description;

    public Ticket(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}

