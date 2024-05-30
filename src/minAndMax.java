import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minAndMax {

	public static void main(String[] args) {
		
		// Finding Min and Max in a List Using Collections
		List<Integer> numberss = Arrays.asList(12, 35, 7, 55, 42, 9, 18);

        int minimum = Collections.min(numberss); // Find minimum using Collections
        int maximum = Collections.max(numberss); // Find maximum using Collections		
        
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        
        // using array and a loop
        int [] numbers = {1,3,5,4,9,6};
		
		// Assuming first element is both min and max
		int min = numbers[0];
		int max = numbers[0];
		
		// iterate over array to find min and max
		for(int number : numbers) {
			if(number < min) {
				min = number;
			}
			if(number > max) {
				max = number;
			}
				
		}
		System.out.println("Minimum number is: " + min);
		System.out.println("Maximum number is: " + max);
	}
	
		

}
