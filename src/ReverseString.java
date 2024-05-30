
public class ReverseString {

	public static void main(String[] args) {
		
	
		// using stringbuilder
		
		String original = "Hello, World!";
		String reversed = new StringBuilder(original).reverse().toString(); 
		
		System.out.println("Original: " + original);
		System.out.println("Reversed: " + reversed);
	
	
	// using a for loop
	for(int i = original.length() -1; i>=0; i--) {
		reversed+= original.charAt(i);
	}
	System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
    
}
}
