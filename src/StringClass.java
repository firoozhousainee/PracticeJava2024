import java.lang.String;
import java.util.Arrays; 
public class StringClass {

	public static void main(java.lang.String[] args) {
		// String is an object represents a sequence of characters. String is immutable, meaning values cant be changed. 
		String str = "Welcome"; 
		
		// methods of String
		System.out.println(str.length()); 
		System.out.println(str.charAt(5)); // find values at a given index
		System.out.println(str.indexOf('m')); // find index of a given value  
		System.out.println(str.indexOf("ome"));
		System.out.println(str.replace('m', 'Z'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.compareTo("welcome"));
		System.out.println(str.contains("Wel"));
		
		String langString = "Java is a good programming lanaguage"; 
		String [] langString2 = langString.split(" ");
		System.out.println(langString2[4]);
		
		String[] curseingStrings = {"What the fuck is this? " };
		String arrayString = Arrays.toString(curseingStrings); // Converting Array to String
		System.out.println(arrayString);
		

	}

}
