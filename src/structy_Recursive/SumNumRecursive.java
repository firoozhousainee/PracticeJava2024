package structy_Recursive;

import java.util.List;

public class SumNumRecursive {
	public static int sumNumbersRecursive(List<Integer> numbers) {
		// Base Case: This checks if the list is empty (numbers.size() == 0). If the
		// list is empty, it returns 0. This is the base case for the recursion,
		// stopping the recursion when there are no more elements to sum. */
		if (numbers.size() == 0) { // starting with the smallest piece
			return 0;
		}
		// Recursive Case
		// numbers.get(0) retrieves the first element of the list
		// sumNumbersRecursive(numbers.subList(1, numbers.size())): Calls
		// sumNumbersRecursive on the sublist that excludes the first element.
		// This effectively reduces the problem size by one element each time the method
		// is called.
		return numbers.get(0) + sumNumbersRecursive(numbers.subList(1, numbers.size())); // return the first element;
																							// going with the index 0

	}

	public static void main(String[] args) {

		System.out.println(SumNumRecursive.sumNumbersRecursive(List.of(5, 2, 9, 10)));
		/*
		 * Execution Flow First Call: sumNumbersRecursive(List.of(5, 2, 9, 10))
		 * numbers.size() != 0, so it returns 5 + sumNumbersRecursive(List.of(2, 9, 10))
		 * 
		 * Second Call: sumNumbersRecursive(List.of(2, 9, 10)) numbers.size() != 0, so
		 * it returns 2 + sumNumbersRecursive(List.of(9, 10))
		 * 
		 * Third Call: sumNumbersRecursive(List.of(9, 10)) numbers.size() != 0, so it
		 * returns 9 + sumNumbersRecursive(List.of(10))
		 * 
		 * Fourth Call: sumNumbersRecursive(List.of(10)) numbers.size() != 0, so it
		 * returns 10 + sumNumbersRecursive(List.of())
		 * 
		 * Fifth Call: sumNumbersRecursive(List.of()) numbers.size() == 0, so it returns
		 * 0
		 */
	}

}
