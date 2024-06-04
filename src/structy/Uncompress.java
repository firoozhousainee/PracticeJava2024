package structy;

/* Write a method, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups.
 * The method should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively. 
 * You may assume that the input string is well-formed according to the previously mentioned pattern.*/
public class Uncompress {

	public static String uncompress(String s) {
		// two pointer
		int i = 0;
		int j = 0;

		String result = "";
		String inputs = "0123456789";
		while (j < s.length()) {
			if (inputs.contains(String.valueOf(s.charAt(j)))) {
				j += 1;
			} else {
				int num = Integer.parseInt(s.substring(i, j));
				for (int count = 0; count < num; count += 1) {
					result += s.charAt(j);
				}
				j = j + 1; // or we can write j += 1;
				i = j; // we are moving i which is from the index to the value j is pointing at
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Uncompress.uncompress("2a3b5c"));
		System.out.println(Uncompress.uncompress("5a5b5c"));
		System.out.println(Uncompress.uncompress("10a5b15c"));

	}
}
