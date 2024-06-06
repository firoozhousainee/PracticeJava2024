package structy_Iterative;

public class ReversString_Iterative {
	public static String reversString(String s) {
		// Initialize a StringBuilder to build the reversed string
		StringBuilder reversed = new StringBuilder();
		// Iterate over the string from the last character to the first character
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed.append(s.charAt(i)); // Append each character to the StringBuilder
		}
		return reversed.toString(); // Convert the StringBuilder to a string and return it
	}

	public static void main(String[] args) {
		String rev = "reversed";
		System.out.println(ReversString_Iterative.reversString(rev));
	}
}
