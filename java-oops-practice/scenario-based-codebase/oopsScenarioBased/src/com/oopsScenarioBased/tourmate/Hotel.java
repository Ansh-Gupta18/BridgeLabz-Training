package com.oopsScenarioBased.tourmate;

public class Hotel extends Trip {
	
	private int HotelPrice;
	
	public Hotel(int budget, String duration,int HotelPrice) {
		super(budget, duration);
		this.setHotelPrice(HotelPrice);
	}

	public int getHotelPrice() {
		return HotelPrice;
	}

	public void setHotelPrice(int hotelPrice) {
		HotelPrice = hotelPrice;
	}

	
	
	

}
