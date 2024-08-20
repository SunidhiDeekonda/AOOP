package BrowsingHistoryUsingDequeue;
import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history;
    private Deque<String> forwardHistory;

    public BrowserHistory() {
        history = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();
    }

    public void visitPage(String url) {
        history.push(url);
        forwardHistory.clear();
    }

    public void goBack() {
        if (!history.isEmpty()) {
            forwardHistory.push(history.pop());
        }
    }

    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            history.push(forwardHistory.pop());
        }
    }

    public void displayCurrentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current page: " + history.peek());
        } else {
            System.out.println("No pages in history.");
        }
    }
}

