package structy_linkedList;

//Write a method, removeNode, that takes in the head of a linked list and a target value as arguments. 
//The method should delete the node containing the target value from the linked list and return the head of the resulting linked list.
//If the target appears multiple times in the linked list, only remove the first instance of the target in the list.
class NodeRec<T> {
	T val; // The value stored in the node
	NodeRec<T> next; // Reference to the next node in the list

	// Constructor to initialize the node with a value
	public NodeRec(T val) {
		this.val = val;
		this.next = null;
	}
}

public class RemoveNode_Recursive {

	// Recursive method to remove a node with the specified target value
	public static <T> NodeRec<T> removeNode(NodeRec<T> head, T targetVal) {
		// Base case: if the current node is the one to be removed
		if (head.val.equals(targetVal)) {
			return head.next; // Return the next node, effectively removing the current node
		}

		// Recursive case: set the next node of the current node to the result of the
		// recursive call
		head.next = removeNode(head.next, targetVal);
		return head; // Return the current node
	}

	public static void main(String[] args) {
		// Create the linked list: a -> b -> c -> d
		NodeRec<String> a = new NodeRec<String>("a");
		NodeRec<String> b = new NodeRec<String>("b");
		NodeRec<String> c = new NodeRec<String>("c");
		NodeRec<String> d = new NodeRec<String>("d");
		a.next = b;
		b.next = c;
		c.next = d;

		// Remove the node with value "c"
		NodeRec<String> newHead = RemoveNode_Recursive.removeNode(a, "c");

		// Print the modified linked list
		NodeRec<String> current = newHead;
		while (current != null) {
			System.out.println(current.val); // Print the value of the current node
			current = current.next; // Move to the next node
		}
	}
}
