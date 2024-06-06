
public class FibonacciExample {

	public static void main(String[] args) {

		int n = 12;
		int first = 0;
		int second = 1;

		System.out.println("Fibonacci Sequence:");
		// System.out.println(first + "" + second);

		for (int i = 3; i <= n; i++) {
			int next = first + second;
			System.out.println(next + " ");
			first = second;
			second = next;

		}

	}

}
