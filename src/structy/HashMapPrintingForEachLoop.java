package structy;

import java.util.HashMap;
import java.util.Map;

public class HashMapPrintingForEachLoop {

	public static void main(String[] args) {
		HashMap<String, Integer> wordLengthMap = new HashMap<>();
		wordLengthMap.put("apple", 5);
		wordLengthMap.put("banana", 6);
		wordLengthMap.put("cherry", 6);
		wordLengthMap.put("date", 4);

		// Print the HashMap using the toString method
		System.out.println(wordLengthMap);
		
		// Print the HashMap using for each loop 
		for (Map.Entry<String, Integer> entry : wordLengthMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());

		}

	}

}
