public class UniversityDiscoutprice{

	public static void main(String args[]){
	int fees = 125000;
	int discountPercent = 10;
	// Calculating the discount 
	double discount = (fees * discountPercent )/100;
        // Calculating the dicounted price...
 	double DiscountedPrice = fees - discount;

	System.out.println("The discount amount is INR : " +discount+  " and final discounted fee is INR : " +DiscountedPrice);
}
}


