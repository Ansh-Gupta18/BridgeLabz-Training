package com.inheritance.onilneordermanagement;

public class DeliveredOrder extends ShippedOrder {
 
	String deliveryDate;
	
	public DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate) {
		super(orderId, orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}

	public void getOrderStatus() {
		super.getOrderStatus();
		System.out.println("DeliveryDate : "+deliveryDate);
	}
}
