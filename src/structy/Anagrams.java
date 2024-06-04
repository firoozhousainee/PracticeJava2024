package structy;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

	public static boolean anagrams(String s1, String s2) {
		// If lengths are not the same, they cannot be anagrams
		if (s1.length() != s2.length()) {
			return false;
		}
		// Create frequency maps for both strings
		Map<Character, Integer> frequencyMap1 = getFrequencyMap(s1);
		Map<Character, Integer> frequencMap2 = getFrequencyMap(s2);

		// Compare the frequency maps
		return frequencyMap1.equals(frequencMap2);

	}

	// Helper method to create a frequency map of characters in a string
	private static Map<Character, Integer> getFrequencyMap(String str) {
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for (char c : str.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
		}
		return frequencyMap;
	}

	public static void main(String[] args) {
		// Test cases
		System.out.println(anagrams("listen", "silent"));
		System.out.println(anagrams("apple", "pale"));
		System.out.println(anagrams("itoot", "tooti"));
	}

}
