package structy_Iterative;

public class CompressChars {
	public static String compress(String s) {
		// implement two pointer
		int i = 0; // pointing to the index. i pointing at the start of a streak 
		int j = 0; // pointing to the value. j pointing at the end of a streak 
		s += '!'; // this is to make sure the loop ends with the last pointer,j, and index.
					// Otherwise, it will end without printing the last set of characters
		String result = "";

		while (j < s.length()) {
			if (s.charAt(j) == s.charAt(i)) {
				j += 1;
			} else {
				int count = j - i;
				if (count > 1) {
					result += "" + count + s.charAt(i); /* + "" we are forcing the integer to be converting into is
					 string representation. Java will convert the integer to a string when it detects that it is being concatenated with a string*/

				} else {
					result += s.charAt(i);
				}
				i = j;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(CompressChars.compress("aaabbbcccdddeeef")); // we are using the class name to call the static compress method

	}
}
