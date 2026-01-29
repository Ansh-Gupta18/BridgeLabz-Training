package com.dealtracker;

import java.time.LocalDate;

//Deal entity
public class Deal extends Promotion<String> {

 private String dealCode;
 private LocalDate validTill;
 private int discountPercent;
 private int minimumPurchase;

 public Deal(String dealCode, LocalDate validTill,
             int discountPercent, int minimumPurchase) {

     super("Discount");
     this.dealCode = dealCode;
     this.validTill = validTill;
     this.discountPercent = discountPercent;
     this.minimumPurchase = minimumPurchase;
 }

 public String getDealCode() {
     return dealCode;
 }

 public LocalDate getValidTill() {
     return validTill;
 }

 public int getDiscountPercent() {
     return discountPercent;
 }

 public int getMinimumPurchase() {
     return minimumPurchase;
 }

 @Override
 public String toString() {
     return dealCode +
             " → " + discountPercent + "% off (Min ₹" +
             minimumPurchase + ", Valid till " + validTill + ")";
 }
}
