package structy_linkedList;

import java.util.ArrayList;
import java.util.List;

//Define a generic LinkedListNode class to represent each node in the linked list
class LinkedListNode<T> {
	T val; // The value stored in the node
	LinkedListNode<T> next; // The reference to the next node in the list

	// Constructor to initialize the node with a value
	public LinkedListNode(T val) {
		this.val = val;
		this.next = null; // Initially, the next node is null
	}
}

public class LinkedListValues {
	// Method to traverse the linked list and collect its values into a list
	public static List<String> linkedListValues(LinkedListNode<String> head) {
		List<String> values = new ArrayList<>(); // List to store the values
		LinkedListNode<String> current = head; // Start from the head of the list

		// Traverse the list until the end
		while (current != null) {
			values.add(current.val); // Add the current node's value to the list
			current = current.next; // Move to the next node
		}

		return values; // Return the list of values
	}

	public static void main(String[] args) {
		// Create nodes for the linked list
		LinkedListNode<String> a = new LinkedListNode<>("a");
		LinkedListNode<String> b = new LinkedListNode<>("b");
		LinkedListNode<String> c = new LinkedListNode<>("c");
		LinkedListNode<String> d = new LinkedListNode<>("d");
		// Link the nodes together to form the linked list: a -> b -> c -> d
		a.next = b;
		b.next = c;
		c.next = d;

		// Call the linkedListValues method to get the values from the linked list and
		// print them
		List<String> values = LinkedListValues.linkedListValues(a);
		System.out.println(values); // Output: [a, b, c, d]
	}
}