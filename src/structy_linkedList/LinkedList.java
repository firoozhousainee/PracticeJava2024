package structy_linkedList;

class NodeFind<T> { // we put T generic to give T any value we want
	T value; // argument
	NodeFind next;

	public NodeFind(T value) { // constructor
		this.value = value;
		this.next = null;
	}
}

class LinkedList {
	/*
	 * public static void printList(Node head) { // starting with head and we know
	 * they are all connected and can traverse // from there Node current = head;
	 * while (current != null) { // this is iterative
	 * System.out.println(current.value); current = current.next; // update overtime
	 * as it loop }
	 */

	public static void printlistRecursive(NodeFind head1) {
		if (head1 == null) {
			return;
		}
		System.out.println(head1.value);
		printlistRecursive(head1.next);
	}

	public static void main(String[] args) {

		NodeFind<String> a = new NodeFind<String>("linked lis is fun"); // we have to define the type
		NodeFind<Integer> b = new NodeFind<Integer>(5); // we have to define the type
		NodeFind<Double> c = new NodeFind<Double>(11.56); // we have to define the type

		a.next = b;
		b.next = c;
		// printList(a); // we simply call the method, recursive.
		printlistRecursive(a);

	}
}
