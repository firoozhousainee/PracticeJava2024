
public class ReverseString2 {
    public static void main(String[] args) {
        String original = "Hello, World!"; // Original string to reverse
        String reversed = ""; // Variable to hold the reversed string

        // Loop through the original string in reverse order
       for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // Concatenate each character in reverse order
        }
        
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
