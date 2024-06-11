package structy_linkedList;

//Write a method, zipperLists, that takes in the head of two linked lists as arguments. 
//The method should zipper the two lists together into single linked list by alternating nodes. 
//If one of the linked lists is longer than the other, the resulting list should terminate with the remaining nodes.
//The method should return the head of the zippered linked list.
//Definition of the ZNode class, a generic node for the linked list
class ZNode<T> {
	T val; // The value stored in the node
	ZNode<T> next; // The reference to the next node in the list

	// Constructor to initialize the node with a value and set the next node to null
	public ZNode(T val) {
		this.val = val;
		this.next = null;
	}
}

public class ZipplerList {

	// Method to zipper merge two linked lists
	public static <T> ZNode<T> zipperLists(ZNode<T> head1, ZNode<T> head2) {
		// If one of the lists is empty, return the other list
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		ZNode<T> head = head1; // Initialize the head of the new list as the head of the first list
		ZNode<T> tail = head; // Initialize the tail of the new list as the head of the first list
		ZNode<T> current1 = head1.next; // Pointer to the current node in the first list, starting from the second node
		ZNode<T> current2 = head2; // Pointer to the current node in the second list
		int count = 0; // Counter to alternate between lists

		// Iterate as long as there are nodes in both lists
		while (current1 != null && current2 != null) {
			if (count % 2 == 0) { // If count is even, add a node from the second list
				tail.next = current2; // Link the current node from the second list to the tail
				current2 = current2.next; // Move to the next node in the second list
			} else { // If count is odd, add a node from the first list
				tail.next = current1; // Link the current node from the first list to the tail
				current1 = current1.next; // Move to the next node in the first list
			}
			tail = tail.next; // Move the tail to the last added node
			count += 1; // Increment the counter
		}

		// If there are remaining nodes in the first list, link them to the tail
		if (current1 != null) {
			tail.next = current1;
		}
		// If there are remaining nodes in the second list, link them to the tail
		if (current2 != null) {
			tail.next = current2;
		}

		return head; // Return the head of the new zipper merged list
	}

	public static void main(String[] args) {
		// Create the first linked list: a -> b -> c
		ZNode<String> a = new ZNode<>("a");
		ZNode<String> b = new ZNode<>("b");
		ZNode<String> c = new ZNode<>("c");
		a.next = b;
		b.next = c;
		// Create the second linked list: x -> y -> z
		ZNode<String> x = new ZNode<>("x");
		ZNode<String> y = new ZNode<>("y");
		ZNode<String> z = new ZNode<>("z");
		x.next = y;
		y.next = z;

		// Zipper merge the two lists
		ZNode<String> result = ZipplerList.zipperLists(a, x);

		// Print the result of the merged list
		ZNode<String> current = result;
		while (current != null) { // Traverse the merged list
			System.out.print(current.val + " "); // Print the value of the current node
			current = current.next; // Move to the next node
		}
	}
}
