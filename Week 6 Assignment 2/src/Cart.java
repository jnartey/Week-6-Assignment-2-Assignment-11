import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Jacob Nartey
 *
 */
public class Cart extends Item {
	private String name;
	private Integer quantity;
	
	static Map<String, Integer> cart = new HashMap<String, Integer>();
	private Map<String, Integer> cartItems = new HashMap<String, Integer>();
	private Map<Integer, String> allItems = new HashMap<Integer, String>();
	
	//Instantiating Item class
	Item items = new Item();
	
	public Cart() {
		super();
	}
	
	public Cart(String name, Integer quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public void addToCart(String name, Integer quantity) {
		cart.put(name, quantity);
	}
	
	public Integer cart() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1-5 to add the items in menu to cart or enter 0 to checkout");
		System.out.print("> ");
		Integer response = input.nextInt();
				
		allItems = items.getItems();
		cartItems = this.getCartItems();
		String cartItem = allItems.get(response);
		if(response != 0) {
			System.out.println("Enter quantity");
			System.out.print("> ");
			Integer quantity = input.nextInt();
			
			if(cartItems.containsKey(cartItem)) {
				if(quantity == 0) {
					int qty = cartItems.get(cartItem) + 1;
					this.addToCart(cartItem, qty);
				}else {
					int qty = cartItems.get(cartItem) + quantity;
					this.addToCart(cartItem, qty);
				}
			}else {
				if(quantity == 0) {
					this.addToCart(cartItem, 1);
				}else {
					this.addToCart(cartItem, quantity);
				}
			}
		}else {
			input.close();
		}
		
		return response;
	}
	
	
	/**
	 * 
	 * @return Map
	 */
	public Map<String, Integer> getCartItems(){
		return cart;
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
}
