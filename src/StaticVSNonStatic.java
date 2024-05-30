
public class StaticVSNonStatic {

	public static void main(String[] args) {
		
		System.out.println(myString  + " " + num); 
		 

	}
	// Static Block: to initialize static variables 
	static int num;
	static String myString;
	static {num=97; myString = "static keyword in java";}

}

