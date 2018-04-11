import java.util.HashMap;
import java.util.Map;

public class Item {
	private Integer key;
	private String name;
	static Map<Integer, String> items = new HashMap<Integer, String>();
	
	
	/**
	 * @param key
	 * @param name
	 * @param items
	 */
	public Item(Integer key, String name) {
		this.key = key;
		this.name = name;
	}
	

	public Item() {
		
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}
	
	public void addItem(Integer key, String name) {
		items.put(key, name);
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
	 * 
	 * @return Map
	 */
	public Map<Integer, String> getItems(){
		return items;
	}
}
