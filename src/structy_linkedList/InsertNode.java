package structy_linkedList;

//Write a method, insertNode, that takes in the head of a linked list, a value, and an index. 
//The method should insert a new node with the value into the list at the specified index. 
class NodeIns<T> {
	T val; // Value of the node
	NodeIns<T> next; // Reference to the next node

	// Constructor to initialize the node with a value
	public NodeIns(T val) {
		this.val = val;
		this.next = null;
	}
}

public class InsertNode {
	// Method to insert a node at a specific index
	public static <T> NodeIns<T> insertNode(NodeIns<T> head, T value, int index) {

		// If the insertion is at the head, create a new node and return it as the new
		// head
		if (index == 0) {
			NodeIns<T> newNode = new NodeIns<T>(value);
			newNode.next = head;
			return newNode;
		}
		NodeIns<T> current = head; // Pointer to traverse the list
		NodeIns<T> prev = null; // Pointer to keep track of the previous node
		int count = 0; // Counter to keep track of the current index

		// Traverse the list to find the position to insert the new node
		while (true) {
			if (count == index) {
				NodeIns<T> newNode = new NodeIns<>(value); // Create a new node
				newNode.next = current; // Point the new node to the current node
				prev.next = newNode; // Point the previous node to the new node
				return head; // Return the head of the list
			}
			count += 1; // Increment the counter
			prev = current; // Move the previous pointer to the current node
			current = current.next; // Move the current pointer to the next node
		}
	}

	public static void main(String[] args) {
		// Create the linked list: a -> b -> c -> d
		NodeIns<String> a = new NodeIns<>("a");
		NodeIns<String> b = new NodeIns<>("b");
		NodeIns<String> c = new NodeIns<>("c");
		NodeIns<String> d = new NodeIns<>("d");

		a.next = b;
		b.next = c;
		c.next = d;

		// Insert a node with value "x" at index 2
		// The list should become: a -> b -> x -> c -> d
		NodeIns<String> myNode = InsertNode.insertNode(a, "x", 2);

		// Print the modified linked list
		NodeIns<String> current = myNode;
		while (current != null) {
			System.out.println(current.val); // Print the value of the current node
			current = current.next; // Move to the next node
		}
	}
}
