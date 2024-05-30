import java.util.Arrays;
import java.util.Collections;
public class ArraysMethods {

	public static void main(String[] args) {
			// lenght
			int [ ] numbers = {1,2,3,5,4,1,8,9,6}; 
			System.out.println(numbers.length-1);
		
			// Sort (ascending)
			Arrays.sort(numbers); 
			for(int i=0; i<= numbers.length-1; i++) {
			System.out.println( " Sorting in ascending order: "+ numbers[i]);
			
			//Sort (descending)
			Integer[] numBoxed = {1,2,3,5,4,1,8,9,6};
			Arrays.sort(numBoxed, Collections.reverseOrder());
			for(int p=0; p<= numBoxed.length-1; p++) {
				System.out.println( "Sorting in descending order " + numBoxed[p]);
			
			// Searching Arrays
			int [] searchValues = {1,3,5,8,2,4};
			int index = Arrays.binarySearch(searchValues, 3);
			System.out.println("Index value 3 is: " + index);
			
			// Filling Arrays 
			double [] doubleNumbers = new double[5];
			Arrays.fill(doubleNumbers, 16.3);
			// printing the filled array 
			for(int a=0; a<= doubleNumbers.length-1; p++) {
				System.out.println( "Double array: " + doubleNumbers[a]);
		}

	}

}
}
}
