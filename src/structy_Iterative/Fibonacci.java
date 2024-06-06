package structy_Iterative;

public class Fibonacci {
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i <= n; i++) {
			c = a + b; // Fibonacci(i)
			a = b; // Update a to the next value
			b = c; // Update b to the next value

		}
		return c;

	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacci(11)); // Output: 89
	}

}
