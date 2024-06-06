package structy_Recursive;

import java.util.List;

public class SumOfLengths {
	public static int sumOfLength(List<String> strings) { // This method takes a list of strings and recursively
															// calculates the sum of their lengths.
		if (strings.size() == 0) { // This is the base case for the recursion. It checks if the list is empty
									// (strings.size() == 0). If it is, the method returns 0
			return 0;
		}
		return strings.get(0).length() + sumOfLength(strings.subList(1, strings.size())); // recursive method
		// strings.get(0).length(): Retrieves the length of the first string in the
		// list.
		// sumOfLength(strings.subList(1, strings.size())): Calls sumOfLength on a
		// sublist of strings that excludes the first element
	}

	public static void main(String[] args) {
		System.out.println(SumOfLengths.sumOfLength(List.of("goat", "purple", "cat")));
	}

}
