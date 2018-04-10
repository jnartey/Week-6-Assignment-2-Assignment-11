import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Jacob Nartey
 * 1. Key,Value Pairs
 *
 */
public class KeyValuePairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, String> colors = new HashMap<Integer, String>();
		colors.put(1, "Red");
		colors.put(2, "Yellow");
		colors.put(3, "Green");
		colors.put(4, "White");
		colors.put(5, "Blue");
		
		System.out.println("All keys in Colors HashMap" + colors.keySet());
		System.out.println("All values in Colors HashMap" + colors.values());
		System.out.println("");
		
		colors.put(3, "Orange");
		
		
		System.out.println("All keys in updated Colors HashMap" + colors.keySet());
		System.out.println("All values in updated Colors HashMap" + colors.values());
		System.out.println("");
		
		//Did anything change? Why?
		//Yes, Maps or HashMaps accept unique keys but can have unique keys with same values.
		//If the map previously contained a mapping for the key, the old value is replaced by the specified value.
		
		//2. Printing out one-by-one again
		//Using entrySet iterator.
		System.out.println("Printing out each key,value pair one by one using entrySet iterator");
		System.out.println(colors.entrySet());
		System.out.println("");
		
		//Using iterator and entrySet.
		System.out.println("Printing out each key,value pair one by one using iterator and entrySet");
		Iterator<Map.Entry<Integer, String>> iterator = colors.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Map.Entry<Integer, String> entry = iterator.next();
	        System.out.println("Key [" + entry.getKey() + "] -> Value [" + entry.getValue() + "]");
	    }
	    System.out.println("");
		
		//Using For-Each loop.
		System.out.println("Printing out each key,value pair one by one using For-Each loop");
		for(Map.Entry<Integer, String> color : colors.entrySet()) {
			System.out.println("Key [" + color.getKey() + "] -> Value [" + color.getValue() + "]");
		}
		System.out.println("");
		
		//Using For-Each method of HashMap
		System.out.println("Printing out each key,value pair one by one using For-Each method");
		colors.forEach((key, value) -> System.out.println(("Key [" + key + "] -> Value [" + value + "]")));
	}

}
