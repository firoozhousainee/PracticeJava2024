
public class EvenOddNum {

	public static void main(String[] args) {
		
		
		// The enhanced for-loop simplifies iteration over arrays and collections without needing to worry about indices.
		
		int m = 2;
		int n = m--; 
		System.out.println("what? + n");

		int evenNum = 2;
		while (evenNum <= 100) {
			System.out.println("This is printing even numbers " + evenNum);
			evenNum += 2;

		}

		int oddNum = 1;
		while (oddNum <= 100) {
			if (oddNum % 2 != 0) {
				System.out.println("Odd numbers printing " + oddNum);
			}
			oddNum++;
		}

	}

}
