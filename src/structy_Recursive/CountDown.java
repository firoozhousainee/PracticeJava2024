package structy_Recursive;

public class CountDown {
	public static void countdown(int n) {
		if (n == 3) {
			return;
		}
		System.out.println(n); // printing the current n
		countdown(n - 1); // making a recursive call
	}

	public static void main(String[] args) {
		countdown(10);
	}

}
