package com.Auction;

public class ReserveAuction extends Auction{

	@Override
	public void startAuction() {
		// TODO Auto-generated method stub
		notifyObservers(AuctionEvent.BIDDING_STARTED, "Reserve auction has started.");
	}

	@Override
	public void endAuction() {
		// TODO Auto-generated method stub
		notifyObservers(AuctionEvent.BIDDING_ENDED, "Reserve auction has ended.");
	}

}
