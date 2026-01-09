package com.oopsScenarioBased.medistore;

import java.time.LocalDate;


public class Medicine implements ISellable {
	
	private int price;
	private int quantity = 10;
	protected LocalDate expiryDate;
	protected String name;
	
	public Medicine(String name, int price, LocalDate expiryDate) {
		super();
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
	}

	
	double discount;
	public void sell(int qty) {
		if(qty > getQuantity()) {
			System.out.println("Insufficient medicine");
			
		}
		
		int amount = qty * price;
		int discountPrice = (price * discountAmount(amount))/100;
		   discount = price - discountPrice;
		   System.out.println("The price of this medicine after discount is : "+discount);
	}
int discountAmount(int amount){
	if(amount > 200)
		return 10;
	else if (amount >100)
		return 5;
	else 
		return 1;
				
}
	@Override
	public boolean checkExpiry() {
		return LocalDate.now().isAfter(this.expiryDate);
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
