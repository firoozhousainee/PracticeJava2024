package structy_Iterative;

public class Palendrome_iterative {
	// Method to check if the given string is a palindrome
	public static boolean palindrome(String s) {
		int left = 0; // Initialize left pointer
		int right = s.length() - 1; // Initialize right pointer

		// Loop until the pointers meet in the middle
		while (left < right) {
			// If the characters at the pointers do not match, it's not a palindrome
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			// Move the pointers towards the middle
			left++;
			right--;
		}

		// If all characters matched, it is a palindrome
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Palendrome_iterative.palindrome("racecar"));
		System.out.println(Palendrome_iterative.palindrome("madam"));
		System.out.println(Palendrome_iterative.palindrome("hello"));

	}

}
