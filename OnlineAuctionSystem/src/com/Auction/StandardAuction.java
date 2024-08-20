package com.Auction;

public class StandardAuction extends Auction {

	@Override
	public void startAuction() {
		// TODO Auto-generated method stub
		notifyObservers(AuctionEvent.BIDDING_STARTED, "Standard auction has started.");
	}

	@Override
	public void endAuction() {
		// TODO Auto-generated method stub
		 notifyObservers(AuctionEvent.BIDDING_ENDED, "Standard auction has ended.");
	}

}
