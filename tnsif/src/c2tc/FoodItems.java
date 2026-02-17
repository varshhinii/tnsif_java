package c2tc;

public class FoodItems {


	public class Fooditems {
		String name;
		double price;
		String category;
		
		void display() {
			System.out.println("food name :"+ name);
			System.out.println("food price :"+ price);
			System.out.println("food category :"+ category);
			System.out.println("...........................");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Fooditems food = new Fooditems();
			food.name = "burger";
			food.price = 99.9;
			food.category = "fast food";
			
			Fooditems food1 = new Fooditems();
			food1.name = "coca cola";
			food1.price = 90;
			food1.category = "beverages";
			
			Fooditems food2 = new Fooditems();
			food2.name = "paneer biryani";
			food2.price = 160.5;
			food2.category = "Hyderabadi";
			
			food.display();
			food1.display();
			food2.display();
			
			
			
		}

	}

}
