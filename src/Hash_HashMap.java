import java.security.KeyStore.Entry;
import java.util.HashMap;

public class Hash_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> ageMap = new HashMap<>();
		
		ageMap.put("Alice", 30);
		ageMap.put("Bob", 25);
		ageMap.put("Charlie", 28);
		
		
		 int aliceAge = ageMap.get("Alice"); 
		 System.out.println("Alice's age: " +  aliceAge);
		 
		 ageMap.remove("Bob");
		 boolean hasValue30 = ageMap.containsKey(30);
		 System.err.println("Contains value 30: " + hasValue30);
		 
		// Iterate over key-value pairs
	        System.out.println("All ages:");
		 for (HashMap.Entry<String, Integer> entry : ageMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
		 
		 
		/* String str1 = "example";
		 String str2 = "example"; 
		 int hash1 = str1.hashCode();
		 int hash2 = str2.hashCode();
		 System.out.println("one hash for both example: "+  str1);*/
		 
		
		 
	}

}
