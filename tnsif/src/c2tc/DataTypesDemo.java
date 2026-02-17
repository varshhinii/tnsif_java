package c2tc;

public class DataTypesDemo {
	
		public static void main(String[] args) {
			int orderId = 102;
			double price = 399.99;
			boolean isDelivered = false;
			char rating = 'A';
			float deliverydistances = 5.3f;
			long deliveryBoyNumber = 9845326781L;
			byte deliveryTime = 45;
			short restuarantId = 12;
			
			
			String customerName = "Gagana";
			String[] fooditems = {"Burger","Cheesecake","French fries"};
			
			//order  summary
			
			System.out.println("Order Summary:");
			System.out.println("Customer Name:"+ customerName);
			System.out.println("Order Id:"+orderId);
			System.out.println("RestaurantedId:"+ restuarantId);
			System.out.println("Delivery Boy Contact:"+ deliveryBoyNumber);
			System.out.println("Food Items:");
			for(String item : fooditems) {
				System.out.println("-"+item);
			}
			System.out.println("Total price:"+price);
			System.out.println("Delivery Distance:"+deliverydistances);
			
		

		}

	}


