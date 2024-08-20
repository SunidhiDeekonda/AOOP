package CustomerSupportTicketSystemUsingQueueInterface;

public class Main {
    public static void main(String[] args) {
        TicketQueue ticketQueue = new TicketQueue();
        ticketQueue.addTicket("Issue with login");
        ticketQueue.addTicket("Payment not processed");
        ticketQueue.displayPendingTickets();

        ticketQueue.processNextTicket();
        ticketQueue.displayPendingTickets();
    }
}

