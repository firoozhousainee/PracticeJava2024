
public class Arrays {

	public static void main(String[] args) {
		
		int [] age = {12, 15, 28, 10, 86, 36};
		
		System.out.println("Using an enhanced for-loop:");
				for(int num : age) {
					System.out.println(num);
									}
		
		// find the length of an array 
		int [] arrayLenght = new int [5]; 
		
		System.out.println("Lenth of this array is: " + arrayLenght.length);
	
		
		// print array values using traditional for loop
		int [] numbers = {1,3,4,5,6,8,9,7};
		
		System.out.println("Using a traditional for-loop:");
		for(int i=0; i<=numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
	}
	

}
