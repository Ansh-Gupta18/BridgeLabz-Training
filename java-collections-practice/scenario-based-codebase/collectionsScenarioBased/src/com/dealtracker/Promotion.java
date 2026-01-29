package com.dealtracker;

//Generic promotion base class
public class Promotion<T> {

 protected T promotionType; // Discount, Cashback, Referral

 public Promotion(T promotionType) {
     this.promotionType = promotionType;
 }

 public T getPromotionType() {
     return promotionType;
 }
}
