package structy_linkedList;

class ANode<T> {
	T val;
	ANode<T> next;

	public ANode(T val) {
		this.val = val;
		this.next = null;
	}
}

public class GetNodeValue_atIndex_iterative {
	public static <T> T getNodeValue(ANode<T> head, int index) {
		ANode<T> current = head; // creating a node current that update overtime and starting at head. Bases to
									// start always
		int count = 0;
		while (current != null) {
			if (count == index) {
				return current.val; // return the value of that current node
			}
			current = current.next;
			count += 1; // on each iteration, we want the count to iterate by one
		}
		return null; // if you never find your index, you return null then
	}

	public static void main(String[] args) {

		ANode<String> a = new ANode<>("a");
		ANode<String> b = new ANode<>("b");
		ANode<String> c = new ANode<>("c");
		ANode<String> d = new ANode<>("d");

		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(GetNodeValue_atIndex_iterative.getNodeValue(a, 3));
	}

}
