package MessagingApplication;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<String> sharedQueue;

    public Producer(BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                String message = "Message " + i;
                System.out.println("Produced: " + message);
                sharedQueue.put(message); // Put message into the queue
                Thread.sleep(100); // Simulate time taken to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
