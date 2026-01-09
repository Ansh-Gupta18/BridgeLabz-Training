package com.oopsScenarioBased.tourmate;

public class Transport extends Trip{

	private int TransportPrice;
	
	public Transport(int budget, String duration,int TransportPrice) {
		super(budget, duration);
		this.setTransportPrice(TransportPrice);
	}

	public int getTransportPrice() {
		return TransportPrice;
	}

	public void setTransportPrice(int transportPrice) {
		TransportPrice = transportPrice;
	}

	
	
}
