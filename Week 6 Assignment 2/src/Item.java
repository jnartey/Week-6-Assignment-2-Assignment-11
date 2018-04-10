import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item {
	private String name;
	private Integer quantity;
	private Map<String, Integer> cart = new HashMap<String, Integer>();
	private Map<Integer, String> items = new HashMap<Integer, String>();
	
	private Map<String, Integer> cartItems = new HashMap<String, Integer>();
	private Map<Integer, String> allItems = new HashMap<Integer, String>();
	
	/**
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Item(String name, Integer quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public Item() {
		
	}
	
	public void addItem(Integer key, String item) {
		items.put(key, item);
	}
	
	public void addToCart(String key, Integer quantity) {
		cart.put(key, quantity);
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
	
	public Integer cart() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1-5 to add the items in menu to cart or enter 0 to checkout");
		System.out.print("> ");
		Integer response = input.nextInt();
		
		allItems = this.getItems();
		cartItems = this.getCartItems();
		String cartItem = allItems.get(response);
		
		if(response != 0) {
			if(cartItems.containsKey(cartItem)) {
				int quantity = cartItems.get(cartItem) + 1;
				this.addToCart(cartItem, quantity);
			}else {
				this.addToCart(cartItem, 1);
			}
		}else {
			input.close();
		}
		
		return response;
	}
	
	public void viewOrder() {
		Map<String, Integer> cartItems = this.getCartItems();
		
		if(cartItems.isEmpty()) {
			this.display("Cart is empty! No items to checkout");
		}else {
			System.out.println("Your Order");
			System.out.println("************************");
			System.out.printf("%-12s | %-12s", "Item", "Quantity");
			System.out.println("");
			System.out.println("------------------------");
			
			for(Map.Entry<String, Integer> item : cartItems.entrySet()) {
				System.out.printf("%-12s | %-12s", item.getKey(), item.getValue());
				System.out.println("");
			}
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Map<Integer, String> getItems(){
		return items;
	}
	
	public Map<String, Integer> getCartItems(){
		return cart;
	}
}
