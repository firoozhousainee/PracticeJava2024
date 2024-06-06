package structy_Iterative;

import java.util.List;

public class MultiplyNumRecursive {
	// Method to iteratively multiply the numbers in a list
	public static int multiplyNumberIterative(List<Integer> numbers) {
		// If the list is empty, return 1 as the neutral element for multiplication
		if (numbers.isEmpty()) {
			return 1;
		}
		int product = 1; // Initialize the product to 1
		for (int num : numbers) { // Iterate over each number in the list
			product *= num; // Multiply the number to the product
		}
		return product; // Return the total product
	}

	public static void main(String[] args) {
		System.out.println(MultiplyNumRecursive.multiplyNumberIterative(List.of(5, 2, 9, 1))); // must return 90
		System.out.println(MultiplyNumRecursive.multiplyNumberIterative(List.of())); // should return 1
	}

}
