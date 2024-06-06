package structy_Recursive;

public class Factorial {
	public static long factorial(int n) {
		if (n == 0) { // factorial 0 = 1 mathematical
			return 1;
		}
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		System.out.println(Factorial.factorial(4));
		System.out.println(Factorial.factorial(5));

	}

}
