package structy;

import java.util.HashMap;

public class MostFrequentChar {
	private static HashMap<Character, Integer> charCount(String s) { // creating a HashMap "charCounty" that takes
																		// argument input as String 's'
		HashMap<Character, Integer> count = new HashMap<Character, Integer>(); // initializing an empty HashMap
		for (char c : s.toCharArray()) {
			if (!count.containsKey(c)) { // check if it does not contain that character key
				count.put(c, 0); // initializing the count to 0
			}
			count.put(c, count.get(c) + 1); // incrementing the current value stores inside count by one
		}
		return count;
	}

	public static char mostFrequentCharacter(String s) {
		HashMap<Character, Integer> count = charCount(s); // calling the helper method
		char mostFrequent = '\0';
		for (char ch : s.toCharArray()) {
			if (mostFrequent == '\0' || count.get(ch) > count.get(mostFrequent)) { // using these HashMap method "count.get()
				mostFrequent = ch;
			}

		}

		return mostFrequent;
	}

	public static void main(String[] args) {
		System.out.println(MostFrequentChar.mostFrequentCharacter("mississippi"));
	}
}