package com.coinbase.exchange.api.entity;

import java.math.BigDecimal;

public class Ask {
	private BigDecimal price;
	private BigDecimal size;
	private int num_orders;
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getSize() {
		return size;
	}
	public void setSize(BigDecimal size) {
		this.size = size;
	}
	public int getNum_orders() {
		return num_orders;
	}
	public void setNum_orders(int num_orders) {
		this.num_orders = num_orders;
	}
}
