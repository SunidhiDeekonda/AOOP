package com.Auction;

public class AuctionSystem {
	 public static void main(String[] args) {
	        Auction standardAuction = new StandardAuction();
	        Auction reserveAuction = new ReserveAuction();

	        Bidder bidder1 = new Bidder("Bidder 1");
	        Bidder bidder2 = new Bidder("Bidder 2");

	        standardAuction.subscribe(bidder1);
	        standardAuction.subscribe(bidder2);
	        reserveAuction.subscribe(bidder1);

	        standardAuction.startAuction();
	        standardAuction.endAuction();

	        reserveAuction.startAuction();
	        reserveAuction.endAuction();

	        AuctionTemplate standardTemplate = new StandardAuctionTemplate();
	        AuctionTemplate reserveTemplate = new ReserveAuctionTemplate();

	        standardTemplate.conductAuction();
	        reserveTemplate.conductAuction();
	    }
}
