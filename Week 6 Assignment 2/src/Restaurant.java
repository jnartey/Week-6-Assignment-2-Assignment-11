import java.util.Scanner;

/**
 * @author Jacob Nartey
 *
 */
public class Restaurant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instantiating Item class
		Item items = new Item();
		
		//Instantiating Order class
		Order order = new Order();
		
		//Instantiating Cart class
		Cart cart = new Cart();
		
		int menuKey = 1, count = 0;
		char response =' ';
		
		Scanner read = new Scanner(System.in);
		
		items.addItem(1, "Hamburgers");
		items.addItem(2, "Hot Dogs");
		items.addItem(3, "Sandwiches");
		items.addItem(4, "Soda");
		items.addItem(5, "Fries");
		
		order.display(
				"Simple Restaurant Ordering Menu & Cart\n"
				+ "**************************************");
		
		while(menuKey != 0) {
			if(count > 0) {
				order.display("Do you want to add more items to cart? y or n");
				System.out.print("> ");
				response = read.nextLine().charAt(0);
				
				if(response == 'y' || response == 'Y') {
					//continue;
				}else if(response == 'n' || response == 'N') {
					order.display("");
					break;
				}else {
					continue;
				}
				order.display("");
			}
			
			order.displayMenu(items.getItems());
			menuKey = cart.cart();
			order.display("");
			
			count++;
		}
		
		order.viewOrder();
	}

}
