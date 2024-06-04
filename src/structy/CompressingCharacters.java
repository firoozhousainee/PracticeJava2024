package structy;

public class CompressingCharacters {
	public static String compress(String s) {
		// implement two pointer
		int i = 0; // pointing to the index
		int j = 0; // pointing to the value
		s += '!'; // this is to make sure the loop ends with the last pointer,j, and index.
					// Otherwise, it will end without printing the last set of characters
		String result = "";

		while (j < s.length()) {
			if (s.charAt(j) == s.charAt(i)) {
				j += 1;
			} else {
				int count = j - i;
				if (count > 1) {
					result += "" + count + s.charAt(i);

				} else {
					result += s.charAt(i);
				}
				i = j;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(CompressingCharacters.compress("aaabbbcccdddeee"));

	}
}
