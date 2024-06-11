package structy_linkedList;
///Write a method, longestStreak, that takes in the head of a linked list as an argument. The method should return the length of the longest 

// consecutive streak of the same value within the list./

class NodeLS<T> {
	T val;
	NodeLS<T> next;

	public NodeLS(T val) {
		this.val = val;
		this.next = null;
	}
}

public class LongestStreak {
	public static <T> int longestStreak(NodeLS<T> head) {
		NodeLS<T> current = head;
		T prevVal = null;
		int currentStreak = 0;
		int max_streak = 0;

		while (current != null) {
			if (prevVal == current.val) {
				currentStreak += 1;
			} else {
				currentStreak = 1;

			}
			if (currentStreak > max_streak) {
				max_streak = currentStreak;

			}
			prevVal = current.val;
			current = current.next;

		}

		return max_streak;
	}

	public static void main(String[] args) {
		NodeLS<Integer> a = new NodeLS<>(5);
		NodeLS<Integer> b = new NodeLS<>(5);
		NodeLS<Integer> c = new NodeLS<>(7);
		NodeLS<Integer> d = new NodeLS<>(7);
		NodeLS<Integer> e = new NodeLS<>(7);
		NodeLS<Integer> f = new NodeLS<>(6);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		System.out.println(LongestStreak.longestStreak(a));
	}

}
