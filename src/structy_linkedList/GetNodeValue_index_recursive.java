package structy_linkedList;

class DNode<T> {
	T val;
	DNode<T> next;

	public DNode(T val) {
		this.val = val;
		this.next = null;
	}
}

public class GetNodeValue_index_recursive {
	public static <T> T getNodeValue(DNode<T> head, int index) {
		if (head == null) {
			return null;
		}
		if (index == 0) {
			return head.val;
		}
		return getNodeValue(head.next, index - 1);
	}

	public static void main(String[] args) {
		DNode<String> a = new DNode<>("a");
		DNode<String> b = new DNode<>("b");
		DNode<String> c = new DNode<>("c");
		DNode<String> d = new DNode<>("d");

		a.next = b;
		b.next = c;
		c.next = d;

		System.out.println(GetNodeValue_index_recursive.getNodeValue(a, 3));
	}
}
