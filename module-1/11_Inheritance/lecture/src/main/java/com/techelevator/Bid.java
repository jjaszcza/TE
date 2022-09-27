package com.techelevator;

public class Bid extends Object {

	private String bidder;
	private int bidAmount;

	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}

	public static Bid EmptyBed() {
		return new Bid("", 0);
	}

	@Override
	public String toString() {
		return this.bidder + " bid " + this.getBidAmount();
	}
}
