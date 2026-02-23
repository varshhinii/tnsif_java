package org.tns.acc.c2tc.core_java.java_basics;

public class Typecasting {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity = 3;
		double priceperitem = 199.99;
		double totalprice = quantity * priceperitem;
		
		double discount = 50.5;
		int roundedDiscount = (int)discount;
		double totalAmount = totalprice - roundedDiscount;
		System.out.println("Online shopping summary:");
		System.out.println("final Amount :" + totalAmount);
	}
}