package myPackage;

public class Calculator {
	// Public method that uses a private method
    public int add(int a, int b) {
        return a + b;
    }

    // Public method that uses a private method
    public int multiply(int a, int b) {
        return a * b;
    }

    // Private method for internal use
    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive calculation of factorial
        }
    }

    // Public method that uses the private method to get a result
    public int factorialOf(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        return factorial(n); // Calling the private method
    }
}


