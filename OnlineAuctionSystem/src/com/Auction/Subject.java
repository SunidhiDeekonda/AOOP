package com.Auction;

public interface Subject {
	 void subscribe(Observer observer);
	    void unsubscribe(Observer observer);
	    void notifyObservers(AuctionEvent event, String message);
}
