package structy_linkedList;

//Define a generic Node class to represent elements in the linked list
class NodeAdd<T> {
	T val; // Value of the node
	NodeAdd<T> next; // Reference to the next node

	// Constructor to initialize the node with a value
	public NodeAdd(T val) {
		this.val = val;
		this.next = null;
	}
}

public class AddLists {
	// Method to add two linked lists representing numbers and return the result as
	// a linked list
	public static NodeAdd<Integer> addLists(NodeAdd<Integer> head1, NodeAdd<Integer> head2) {
		NodeAdd<Integer> dummyHead = new NodeAdd<>(0); // Dummy node to simplify handling of the head
		NodeAdd<Integer> tail = dummyHead; // Tail to build the result list
		NodeAdd<Integer> current1 = head1; // Pointer for the first list
		NodeAdd<Integer> current2 = head2; // Pointer for the second list
		int carry = 0; // Carry for the sum of digits

		// Loop until both lists are fully traversed and no carry remains
		while (current1 != null || current2 != null || carry > 0) {
			// Get the current values, or 0 if the list has ended
			int value1 = (current1 == null) ? 0 : current1.val;
			int value2 = (current2 == null) ? 0 : current2.val;

			// Calculate the sum and carry
			int sum = value1 + value2 + carry;
			int digit = sum % 10; // Get the current digit to store in the new list
			carry = sum / 10; // Calculate the new carry

			// Create a new node with the digit and append it to the result list
			tail.next = new NodeAdd<>(digit);
			tail = tail.next; // Move the tail to the new last node

			// Move to the next nodes in the input lists if available
			if (current1 != null) {
				current1 = current1.next;
			}
			if (current2 != null) {
				current2 = current2.next;
			}
		}
		return dummyHead.next; // Return the result list, skipping the dummy head
	}

	// Main method to test the addLists method
	public static void main(String[] args) {
		// Create two sample linked lists representing the numbers 243 (3 -> 4 -> 2) and
		// 564 (4 -> 6 -> 5)
		NodeAdd<Integer> a1 = new NodeAdd<>(2);
		NodeAdd<Integer> a2 = new NodeAdd<>(4);
		NodeAdd<Integer> a3 = new NodeAdd<>(3);
		a1.next = a2;
		a2.next = a3;

		NodeAdd<Integer> b1 = new NodeAdd<>(5);
		NodeAdd<Integer> b2 = new NodeAdd<>(6);
		NodeAdd<Integer> b3 = new NodeAdd<>(4);
		b1.next = b2;
		b2.next = b3;

		// Call the addLists method and store the result
		NodeAdd<Integer> result = AddLists.addLists(a1, b1);

		// Print the result list
		NodeAdd<Integer> current = result;
		while (current != null) {
			System.out.print(current.val);
			if (current.next != null) {
				System.out.print(" -> ");
			}
			current = current.next;
		}
	}
}
