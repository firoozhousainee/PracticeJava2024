package structy_linkedList;

import java.util.List;

// write a method, createLinkedList, that takes in a list of values as an argument. The method should create a linked list containing
//each element of the list as values of nodes. the method should return head of the linked list. 
class NodeCre<T> {
	T val; // The value of the node
	NodeCre<T> next; // Reference to the next node in the linked list

	// Constructor to initialize the node with a value
	public NodeCre(T val) {
		this.val = val;
		this.next = null;
	}
}

public class CreateLinkedList {
	// Method to create a linked list from a list of values
	public static <T> NodeCre<T> createLinkedList(List<T> values) {
		NodeCre<T> dummyHead = new NodeCre<>(null); // Dummy head to simplify list construction
		NodeCre<T> tail = dummyHead; // Tail pointer to keep track of the last node in the list
		for (T value : values) {
			tail.next = new NodeCre<>(value); // Create a new node and attach it to the tail
			tail = tail.next; // Move the tail to the newly created node
		}
		return dummyHead.next; // Return the head of the constructed list (skipping the dummy head)
	}

	public static void main(String[] args) {
		// Create a linked list using the createLinkedList method
		NodeCre<String> myList = CreateLinkedList.createLinkedList(List.of("h", "e", "y", "dude!"));

		// Print the constructed linked list
		NodeCre<String> print = myList;
		while (print != null) {
			System.out.println(print.val); // Print the value of the current node
			print = print.next; // Move to the next node
		}
	}
}
