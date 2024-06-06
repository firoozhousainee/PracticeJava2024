package structy_Iterative;

import java.util.List;

public class SumOfLengths {
	public static int sumOfLengths(List<String> strings) {
		int sum = 0;
		for (String str : strings) { // Iterate over each string in the list
			sum += str.length(); // Add the length of the current string to the sum
		}
		return sum; // Return the total sum of lengths
	}

	public static void main(String[] args) {

		System.out.println(SumOfLengths.sumOfLengths(List.of("Purple", "stupid", "Command")));
	}

}
