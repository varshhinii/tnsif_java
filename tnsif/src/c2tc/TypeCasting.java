package c2tc;

public class TypeCasting {
	

	public class Typecasting {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int quantity = 3;
			double priceperitem = 99.38;
			double totalprice = quantity * priceperitem;
			
			double discount = 20.3;
			int roundedDiscount = (int)discount;
			double totalAmount = totalprice*roundedDiscount;
			System.out.println("Online shopping summary:");
			System.out.println("final Amount :" + totalAmount);

		}

	}

}
