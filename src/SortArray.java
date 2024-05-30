import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 4, 1, 2}; // Unsorted array

         // Sorts the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array in ascending order:");
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]
        
             
        // reverse the sorted array to get descending order 
        
     // reverse array using collections
        int [] arr = {1,5,3,4,6,8,9,7,1};
        Arrays.sort(arr);
        Integer[] numsBoxed = {1,5,3,4,6,8,9,7,1};
        Arrays.sort(numsBoxed, Collections.reverseOrder());
        System.out.println("Is this array reversed order?:" + numsBoxed);
        
        
        // sort/reverse arrays using for loop  
        int [] reversed = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
        	reversed[i] = numbers[numbers.length -1 -i];
        }
       
        System.out.println("Sorted array in descending order:");
        System.out.println(Arrays.toString(reversed));
        int firstNumber = numbers[0]; 
        int secondNumber = numbers[1]; 
        int fourthNumber = numbers[4]; 
        System.out.println("First value of this array is: " + firstNumber);
        System.out.println("second value of this array is: " + secondNumber);
        System.out.println("Fifth value of this array is: " + fourthNumber);
    }
    
    
    
 
}