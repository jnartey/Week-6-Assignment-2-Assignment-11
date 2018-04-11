import java.util.Map;

/**
 * @author Jacob Nartey
 *
 */
public class Order extends Cart {
	
	//Instantiating Cart class
	Cart cart = new Cart();
	
	//Empty constructor
	public Order() {
		super();
	}
	
	//Input Output methods
	/**
	 * Print to console
	 * @param message
	 */
	public void display(String message) {
		System.out.println(message);
	}
	
	/**
	 * Display restaurant menu
	 * @param items
	 */
	public void displayMenu(Map<Integer, String> items) {
		items.forEach((key, value) -> System.out.println(key + ". " + value));
	}
	
	public void viewOrder() {
		Map<String, Integer> cartItems = cart.getCartItems();
		
		if(cartItems.isEmpty()) {
			this.display("Cart is empty! No items to checkout");
		}else {
			System.out.println("Your Order");
			System.out.println("************************");
			System.out.printf("%-12s | %-12s", "Item", "Quantity");
			System.out.println("");
			System.out.println("------------------------");
			
			int total = 0;
			
			for(Map.Entry<String, Integer> item : cartItems.entrySet()) {
				System.out.printf("%-12s | %-12s", item.getKey(), item.getValue());
				System.out.println("");
				total += item.getValue();
			}
			
			System.out.println("------------------------");
			System.out.printf("%-12s | %-12s", "Total items", total);
			System.out.println("");
			System.out.println("------------------------");
			System.out.println("Order succesful! Thank you....");
			
		}
	}

}
