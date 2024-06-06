package structy_Recursive;

public class Fibonacci {
	public static int fibonacci(int n) {

		if (n == 0 || n == 1) { // Base cases: if n is 0 or 1, return n (Fibonacci(0) = 0, Fibonacci(1) = 1)
			return n;

		}
		// Recursive case: sum of the two preceding Fibonacci numbers
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(Fibonacci.fibonacci(11));

	}

}
