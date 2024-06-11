package structy_linkedList;
// Write a method, isUnivalueList, that takes in the head of a linked list as an argument. The method should return a boolean indicating 

// whether or not the linked list contains exactly one unique value.

//Definition of the ZNode class, a generic node for the linked list
class gNode<T> {
	T val; // The value stored in the node
	gNode<T> next; // The reference to the next node in the list

	// Constructor to initialize the node with a value and set the next node to null
	public gNode(T val) {
		this.val = val;
		this.next = null;
	}
}

public class IsUniValueList {

	// Method to check if all the values in the linked list are the same
	public static <T> boolean isUnivalueList(gNode<T> head) {
		if (head == null)
			return true; // An empty list is considered a univalue list

		T value = head.val; // Store the value of the head node
		gNode<T> current = head; // Initialize current node to head
		while (current != null) {
			// If the current node's value is not equal to the stored value, return false
			if (current.val != value) {
				return false;
			}
			current = current.next; // Move to the next node
		}

		return true; // If all nodes have the same value, return true
	}

	public static void main(String[] args) {
		// Create the first linked list: 1 -> 1 -> 1
		gNode<Integer> a = new gNode<>(1);
		gNode<Integer> b = new gNode<>(1);
		gNode<Integer> c = new gNode<>(1);

		// Link the nodes
		a.next = b;
		b.next = c;

		// Check if the first list is a univalue list
		System.out.println(IsUniValueList.isUnivalueList(a)); // Should print true

		// Create the second linked list: 1 -> 2 -> 1
		gNode<Integer> d = new gNode<>(1);
		gNode<Integer> e = new gNode<>(2);
		gNode<Integer> f = new gNode<>(1);

		// Link the nodes
		d.next = e;
		e.next = f;

		// Check if the second list is a univalue list
		System.out.println(IsUniValueList.isUnivalueList(d)); // Should print false
	}
}
