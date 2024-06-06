package structy_Recursive;

// whether or not the string is the same forwards and backwards is called palindome
public class Palindome_recursive {
	public static boolean palindrome(String s) {
		if (s.length() == 0 || s.length() == 1) { // check if the length of string is empty or 1 which it one character,
													// its palindrome
			return true;
		}

		if (s.charAt(0) != s.charAt(s.length() - 1)) { // Recursive case: compare the first and last characters
			return false;
		}
		// Recursively check the substring excluding the first and last characters
		return palindrome(s.substring(1, s.length() - 1));
	}

	public static void main(String[] args) {

		System.out.println(Palindome_recursive.palindrome("kayak"));
		System.out.println(Palindome_recursive.palindrome("pops"));
	}
}
