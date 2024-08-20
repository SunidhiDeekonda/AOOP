package com.Auction;

import java.util.ArrayList;
import java.util.List;

public abstract class Auction implements Subject {
	private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(AuctionEvent event, String message) {
        for (Observer observer : observers) {
            observer.update(event, message);
        }
    }

    public abstract void startAuction();
    public abstract void endAuction();
}
