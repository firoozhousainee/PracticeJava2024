package structy_Iterative;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a method, fiveSort, that takes in an ArrayList of numbers as an argument. The method should rearrange elements of the ArrayList
 *  such that all 5s appear at the end. */
public class SortArray {
	public static List<Integer> fiveSort(List<Integer> array) {
		// Two pointers i and j are initialized. i starts at the beginning (0) of the
		// list, and j starts at the end (array.size() - 1) of the list.
		int i = 0;
		int j = array.size() - 1; // starts from the end of the array
		while (i < j) { // The loop continues until i is less than j
			if (array.get(j) == 5) { // If the element at the end pointer j is 5, decrement j by 1. This step moves j
										// leftward until it finds a non-5 element
				j -= 1;
			} else if (array.get(i) != 5) { // If the element at the start pointer i is not 5, increment i by 1. This
											// step moves i rightward until it finds a 5.
				i += 1; // increment i by 1
				// Action: If the element at i is 5 and the element at j is not 5, swap the
				// elements at indices i and j.
				// This moves the 5 to the end and a non-5 to the front.
			} else
				Collections.swap(array, i, j);
		}

		return array; // The modified list is returned.
	}

	public static void main(String[] args) {
		List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));

		System.out.println(SortArray.fiveSort(array));
	}

}
