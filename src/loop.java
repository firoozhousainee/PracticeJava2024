import java.awt.image.AreaAveragingScaleFilter;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class loop {

	public static void main(String[] args) {
		
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("banana");
		linkedList.add("peache");
		linkedList.add("cherry");
		linkedList.add("Date");
		linkedList.add("orange");
		
		// 
		for(String fruitNames : linkedList) {
			System.out.println(fruitNames);
		}
		
		// Use a single loop to find a specific element
		String target = "orange";
		boolean found = false; 
		for(String item : linkedList) {
			if (item.equals(target)) {
				System.out.println("Found: " + target );
				found = true; 
					break; 
			
				
			}
			if(!found) {
				System.out.println("item Not found" + target);
			}
			// Use a single loop to count the elements
			int count = 0; 
			for(String itme : linkedList) {
				count++; 
			}
			System.out.println("Total number of elements in this linkedlist are: " + count);

	}
		Map<String,Integer> myMap = new HashMap();
		myMap.put("Firooz", 34);
		myMap.put("Nahid", 32);
		myMap.put("Yuki", 1);

		// need collection to get values
		Collection<Integer> values = myMap.values();
		// for each loop
		for(Integer names : values) {
			System.err.println("Hashmap's values are: " + names);
		}
		
		// a while loop 
		int count =1; 
		while(count <=10) {
			System.out.println(count);
			count++;
		}
			System.err.println("loop Has finished");
		}
		
		
		


	
}


