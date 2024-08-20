package com.Auction;

public abstract class AuctionTemplate {
	public final void conductAuction() {
        initializeAuction();
        startBidding();
        endBidding();
    }

    protected abstract void initializeAuction();
    protected abstract void startBidding();
    protected abstract void endBidding();
}
