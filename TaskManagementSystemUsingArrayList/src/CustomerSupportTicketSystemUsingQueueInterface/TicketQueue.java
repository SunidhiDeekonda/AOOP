package CustomerSupportTicketSystemUsingQueueInterface;
import java.util.LinkedList;
import java.util.Queue;

public class TicketQueue {
    private Queue<Ticket> tickets;

    public TicketQueue() {
        tickets = new LinkedList<>();
    }

    public void addTicket(String description) {
        tickets.add(new Ticket(description));
    }

    public void processNextTicket() {
        Ticket ticket = tickets.poll();
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    public void displayPendingTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }
}
