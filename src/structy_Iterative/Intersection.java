package structy_Iterative;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Intersection {
	public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {

		HashSet<Integer> setA = new HashSet(listA); // creating a HashSet and adding listA to it as argument

		/*
		 * or we can write a for loop for(int ele : listA) { // going through listA and
		 * adding them to the HashSet setA.add(ele); }
		 */

		List<Integer> result = new ArrayList<>();
		for (int ele : listB) {
			if (setA.contains(ele)) {
				result.add(ele);
			}

		}

		return result;

	}

	public static void main(String[] args) {
		// List.of(4, 2, 1, 6) is a static factory method introduced in Java 9 that
		// returns an immutable list containing the specified elements. list is an
		// interface
		List<Integer> a = List.of(4, 2, 1, 6);
		List<Integer> b = List.of(3, 6, 9, 2, 10);

		System.out.println("This is the intersection for these two sets: " + Intersection.intersection(a, b));

	}
}
