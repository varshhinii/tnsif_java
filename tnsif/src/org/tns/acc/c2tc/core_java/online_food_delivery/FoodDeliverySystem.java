package org.tns.acc.c2tc.core_java.online_food_delivery;

import java.util.*;

public class FoodDeliverySystem {
	
	
	

	    private static Scanner sc = new Scanner(System.in);

	    private static CustomerService customerService = new CustomerService();
	    private static FoodService foodService = new FoodService();
	    private static OrderService orderService = new OrderService();

	    private static int orderCounter = 1;

	    public static void main(String[] args) {

	        while (true) {

	            System.out.println("\n1. Admin Menu");
	            System.out.println("2. Customer Menu");
	            System.out.println("3. Exit");
	            System.out.print("Choose an option: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    adminMenu();
	                    break;

	                case 2:
	                    customerMenu();
	                    break;

	                case 3:
	                    System.out.println("Exiting application...");
	                    return;

	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
	    }

	    // ADMIN MENU

	    private static void adminMenu() {

	        while (true) {

	            System.out.println("\nAdmin Menu:");
	            System.out.println("1. Add Restaurant");
	            System.out.println("2. Add Food Item to Restaurant");
	            System.out.println("3. Remove Food Item from Restaurant");
	            System.out.println("4. View Restaurants and Menus");
	            System.out.println("5. View Orders");
	            System.out.println("6. Add Delivery Person");
	            System.out.println("7. Assign Delivery Person to Order");
	            System.out.println("8. Exit");

	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter Restaurant ID: ");
	                    int rid = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Restaurant Name: ");
	                    String rname = sc.nextLine();

	                    Restaurant r = new Restaurant(rid, rname);
	                    foodService.addRestaurant(r);

	                    System.out.println("Restaurant added successfully!");
	                    break;

	                case 2:
	                    System.out.print("Enter Restaurant ID: ");
	                    int restId = sc.nextInt();

	                    Restaurant rest = foodService.getRestaurantById(restId);

	                    if (rest == null) {
	                        System.out.println("Restaurant not found!");
	                        break;
	                    }

	                    System.out.print("Enter Food Item ID: ");
	                    int fid = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Food Item Name: ");
	                    String fname = sc.nextLine();

	                    System.out.print("Enter Food Item Price: ");
	                    double price = sc.nextDouble();

	                    FoodItem item = new FoodItem(fid, fname, price);
	                    rest.addFoodItem(item);

	                    System.out.println("Food item added successfully!");
	                    break;

	                case 3:
	                    System.out.print("Enter Restaurant ID: ");
	                    int rId = sc.nextInt();

	                    Restaurant res = foodService.getRestaurantById(rId);

	                    if (res == null) {
	                        System.out.println("Restaurant not found!");
	                        break;
	                    }

	                    System.out.print("Enter Food Item ID to remove: ");
	                    int removeId = sc.nextInt();

	                    res.removeFoodItem(removeId);
	                    System.out.println("Food item removed!");
	                    break;

	                case 4:

	                    System.out.println("Restaurants and Menus:");

	                    for (Restaurant restaurant : foodService.getRestaurants()) {

	                        System.out.println("Restaurant ID: " + restaurant.getId() +
	                                ", Name: " + restaurant.getName());

	                        for (FoodItem item1 : restaurant.getMenu()) {

	                            System.out.println("- Food Item ID: " + item1.getId()
	                                    + ", Name: " + item1.getName()
	                                    + ", Price: Rs. " + item1.getPrice());
	                        }
	                    }

	                    break;

	                case 5:

	                    System.out.println("\nOrders:");
	                    for (Order o : orderService.getOrders()) {
	                        System.out.println(o);
	                    }

	                    break;

	                case 6:

	                    System.out.print("Enter Delivery Person ID: ");
	                    int dpId = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Delivery Person Name: ");
	                    String dpName = sc.nextLine();

	                    System.out.print("Enter Contact No.: ");
	                    long dpContact = sc.nextLong();

	                    DeliveryPerson dp = new DeliveryPerson(dpId, dpName, dpContact);
	                    orderService.addDeliveryPerson(dp);

	                    System.out.println("Delivery person added successfully!");
	                    break;

	                case 7:

	                    System.out.print("Enter Order ID: ");
	                    int oid = sc.nextInt();

	                    System.out.print("Enter Delivery Person ID: ");
	                    int dpid = sc.nextInt();

	                    orderService.assignDeliveryPersonToOrder(oid, dpid);

	                    System.out.println("Delivery person assigned to order successfully!");
	                    break;

	                case 8:
	                    System.out.println("Exiting Admin Module");
	                    return;

	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
	    }

	    // CUSTOMER MENU

	    private static void customerMenu() {

	        while (true) {

	            System.out.println("\nCustomer Menu:");
	            System.out.println("1. Add Customer");
	            System.out.println("2. View Food Items");
	            System.out.println("3. Add Food to Cart");
	            System.out.println("4. View Cart");
	            System.out.println("5. Place Order");
	            System.out.println("6. View Orders");
	            System.out.println("7. Exit");

	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter User ID: ");
	                    int uid = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Username: ");
	                    String uname = sc.nextLine();

	                    System.out.print("Enter Contact No.: ");
	                    long contact = sc.nextLong();

	                    Customer c = new Customer(uid, uname, contact);
	                    customerService.addCustomer(c);

	                    System.out.println("Customer created successfully!");
	                    break;

	                case 2:

	                    System.out.println("\nRestaurants and Menus:");

	                    for (Restaurant restaurant : foodService.getRestaurants()) {

	                        System.out.println("Restaurant ID: " + restaurant.getId() +
	                                ", Name: " + restaurant.getName());

	                        for (FoodItem fi : restaurant.getMenu()) {

	                            System.out.println("- Food Item ID: " + fi.getId() +
	                                    ", Name: " + fi.getName() +
	                                    ", Price: Rs. " + fi.getPrice());
	                        }
	                    }

	                    break;

	                case 3:

	                    System.out.print("Enter Customer ID: ");
	                    int custId = sc.nextInt();

	                    Customer cust = customerService.getCustomer(custId);

	                    if (cust == null) {
	                        System.out.println("Customer not found!");
	                        break;
	                    }

	                    System.out.print("Enter Restaurant ID: ");
	                    int restId = sc.nextInt();

	                    Restaurant restaurant = foodService.getRestaurantById(restId);

	                    System.out.print("Enter Food Item ID: ");
	                    int foodId = sc.nextInt();

	                    System.out.print("Enter Quantity: ");
	                    int qty = sc.nextInt();

	                    for (FoodItem fi : restaurant.getMenu()) {

	                        if (fi.getId() == foodId) {
	                            cust.getCart().addItem(fi, qty);
	                            System.out.println("Food item added to cart!");
	                        }
	                    }

	                    break;

	                case 4:

	                    System.out.print("Enter Customer ID: ");
	                    int cid = sc.nextInt();

	                    Customer cc = customerService.getCustomer(cid);

	                    System.out.println(cc.getCart());
	                    break;

	                case 5:

	                    System.out.print("Enter Customer ID: ");
	                    int custid = sc.nextInt();

	                    Customer customer = customerService.getCustomer(custid);

	                    Order order = new Order(orderCounter++, customer);

	                    for (Map.Entry<FoodItem, Integer> entry :
	                            customer.getCart().getItems().entrySet()) {

	                        order.addItem(entry.getKey(), entry.getValue());
	                    }

	                    orderService.placeOrder(order);

	                    customer.getCart().getItems().clear();

	                    System.out.println("Order placed successfully! Your order ID is: "
	                            + order.getOrderId());

	                    break;

	                case 6:

	                    System.out.println("\nOrders:");
	                    for (Order o : orderService.getOrders()) {
	                        System.out.println(o);
	                    }

	                    break;

	                case 7:
	                    System.out.println("Exiting Customer Module");
	                    return;

	                default:
	                    System.out.println("Invalid option.");
	            }
	        }
	    }
	}
}
