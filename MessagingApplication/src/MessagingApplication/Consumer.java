package MessagingApplication;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> sharedQueue;

    public Consumer(BlockingQueue<String> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = sharedQueue.take(); // Take message from the queue
                System.out.println("Consumed: " + message);
                Thread.sleep(150); // Simulate time taken to consume a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
