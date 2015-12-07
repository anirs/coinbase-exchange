package com.coinbase.exchange.api.entity;

import java.math.BigDecimal;

public class Stats {
	private BigDecimal open;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal volume;
	
	public BigDecimal getOpen() {
		return open;
	}
	public void setOpen(BigDecimal open) {
		this.open = open;
	}
	public BigDecimal getHigh() {
		return high;
	}
	public void setHigh(BigDecimal high) {
		this.high = high;
	}
	public BigDecimal getLow() {
		return low;
	}
	public void setLow(BigDecimal low) {
		this.low = low;
	}
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volumn) {
		this.volume = volumn;
	}

}
