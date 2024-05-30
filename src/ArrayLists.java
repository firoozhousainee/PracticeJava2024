import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Double> doubleNumberArrayList = new ArrayList<Double>();
		ArrayList<Character> charValesArrayList = new ArrayList<Character>(); 
		
		// adding values to the ArrayList
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(55);
		numbers.add(41);
		System.out.println(" printing arraylist size" + numbers);
		
		// removing values from an ArrayList by index
		numbers.remove(1); // by index
		System.out.println(numbers); 
		
		// remove by value 
		numbers.remove(Integer.valueOf(1));
		System.out.println(numbers); 
		
		// Retrieving an element by index
		int firstElement = numbers.get(0);
		System.out.println(firstElement);
		
		// Setting a value at a specific index
		numbers.set(1, 99);
		System.out.println("New Value at index 1 is: " + numbers); 
		
		 // Checking if an element exists
		boolean exist = numbers.contains(41);
		System.out.println(exist);
		
		// Sorting the ArrayList in ascending order
		Collections.sort(numbers);
		System.out.println("Sorted ArrayList: " + numbers);
		
		// Reversing the ArrayList 
		ArrayList<String> words = new ArrayList<String>(); 
		words.add("Book");
		words.add("Teeth"); 
		words.add("Zebra"); 
		words.add("Another"); 
		words.add("Dog"); 
		words.add("Cat"); 
		words.add("Yellow"); 
		System.out.println("Original list: " + words);
		
		Collections.reverse(words);
		System.out.println("Original list: " + words);
		
		
		
				
		
		

	}

}
