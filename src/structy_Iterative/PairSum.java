package structy_Iterative;

import java.util.HashMap;
import java.util.List;

public class PairSum {
	public static List<Integer> pairSum(List<Integer> numbers, int target) { // the first parameter is a list of integers. will be passed to the method when it is called.

		HashMap<Integer, Integer> previousNums = new HashMap<>();
		for (int i = 0; i < numbers.size(); i += 1) { // iterates over each element in the numbers list. The variable i serves as the index of the current element
			int num = numbers.get(i); //retrieves the element at the current index i and stores it in the variable num.
			int complement = target - num; //This calculates the complement of the current number. The complement is the value that, when added to num, equals the target. 
			//This checks if the previousNums map contains the complement as a key. If it does, it means we have found two numbers that add up to the target.
			if (previousNums.containsKey(complement)) { 
				return List.of(i, previousNums.get(complement));// return a list of index of number which is i as well as index of compliment which is complement													
			}
			previousNums.put(num, i); 
			//if the complement is not found, this line adds the current number and its index to the previousNums map. This way, it will be available for future iterations. 

		}
		return null;

	}

	public static void main(String[] args) {
		System.out.println(PairSum.pairSum(List.of(3, 2, 5, 4, 1), 8));
		System.out.println(PairSum.pairSum(List.of(4, 7, 9, 2, 5, 1), 5));
	}

}
