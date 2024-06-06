package structy_Iterative;

import java.util.List;

public class SumNumRecursive {

	// Method to iteratively sum the numbers in a list
	public static int sumNumbersIterative(List<Integer> numbers) {
		int sum = 0; // Initialize the sum to 0

		for (int num : numbers) { // Iterate over each number in the list

			sum += num; // Add the number to the sum
		}
		return sum; // Return the total sum
	}

	public static void main(String[] args) {
		System.out.println(SumNumRecursive.sumNumbersIterative(List.of(5, 2, 9, 10)));

	}
}