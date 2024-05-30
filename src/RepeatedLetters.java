import java.util.Map;
import java.util.HashMap;

public class RepeatedLetters {

	public static void main(String[] args) {
	
	        String input = "Hello World"; // Example string
	        Map<Character, Integer> result = countLetterOccurrences(input); // Count letter occurrences

	        System.out.println("Letter occurrences:");
	        // Print each letter and its count
	        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
		
	}
	
	// Function to count the occurrences of each letter in a string
    public static Map<Character, Integer> countLetterOccurrences(String input) {
        Map<Character, Integer> letterCounts = new HashMap<>(); // Map to store letter frequencies

        // Convert the string to lowercase for case-insensitive counting
        input = input.toLowerCase();

        // Iterate through each character in the string
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Consider only letters, ignoring spaces, numbers, etc.
                // If the letter is already in the map, increment its count
                letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            }
        }

        return letterCounts; // Return the map with letter counts
    }

}