package structy_linkedList;

class Node<T> {
	T val;
	Node<T> next;

	public Node(T val) {
		this.val = val;
		this.next = null;
	}
}

class LinkedListFindTarget {
	public static <T> boolean linkedListFind(Node<T> head, T target) {
		if (head == null) { // base case
			return false;
		}

		if (head.val == target) {
			linkedListFind(head.next, target); // if the value of head equals to the target, return it true
			return true;
		}
		return linkedListFind(head.next, target);
	}

	public static void main(String[] args) {

		Node<String> a = new Node<>("a");
		Node<String> b = new Node<>("b");
		Node<String> c = new Node<>("c");
		Node<String> d = new Node<>("d");

		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(LinkedListFindTarget.linkedListFind(a, "g"));
		System.out.println(LinkedListFindTarget.linkedListFind(a, "c"));
		System.out.println(LinkedListFindTarget.linkedListFind(a, "d"));
	}

}
