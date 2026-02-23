package org.tns.acc.c2tc.core_java.java_basics;

public class DataTypeDemo {
	public static void main(String[] args) {
		int orderId = 101;
        double price = 299.99;
        boolean isDelivered = true;
        char rating = 'A';
        float deliverydistance = 5.3f;

        
        long deliveryBoyNo = 987654323456L;

        byte deliveryTime = 45;

        String customerName = "Rahul";
        String[] fooditems = { "Roti", "Curry", "Water Bottle" };

        System.out.println("----- Order Summary -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Order ID     : " + orderId);
        System.out.println("Total Price  : " + price);
        System.out.println("Delivered?   : " + isDelivered);
        System.out.println("Rating       : " + rating);
        System.out.println("Distance     : " + deliverydistance + " km");
        System.out.println("Delivery Boy No: " + deliveryBoyNo);
        System.out.println("Delivery Time: " + deliveryTime + " mins");

        System.out.println("\nFood Items:");
        for (String food : fooditems) {
            System.out.println("- " + food);
        }
	}
}