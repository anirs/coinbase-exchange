package com.coinbase.exchange.api.entity;

public class OrderBook {
	private int sequence;
	private Bid[] bids;
	private Ask[] asks;

	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public Bid[] getBids() {
		return bids;
	}
	public void setBids(Bid[] bids) {
		this.bids = bids;
	}
	public Ask[] getAsks() {
		return asks;
	}
	public void setAsks(Ask[] asks) {
		this.asks = asks;
	}

}
