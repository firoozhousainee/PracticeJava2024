package structy_Recursive;

public class ReverseString_Recursive {
	public static String reversString(String s) {

		if (s.isEmpty()) {
			return " ";
		}
		return reversString(s.substring(1)) + s.charAt(0); // passing a substring in our reversString method that is
															// missing the first index. Then, concatinating
		// the character at index 0 after the return value to get that reverse

	}

	public static void main(String[] argss) {
		System.out.println(ReverseString_Recursive.reversString(("Hello my name is John")));
	}
}
