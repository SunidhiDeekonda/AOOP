package BrowsingHistoryUsingDequeue;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitPage("google.com");
        browserHistory.visitPage("stackoverflow.com");
        browserHistory.displayCurrentPage();

        browserHistory.goBack();
        browserHistory.displayCurrentPage();

        browserHistory.goForward();
        browserHistory.displayCurrentPage();
    }
}
