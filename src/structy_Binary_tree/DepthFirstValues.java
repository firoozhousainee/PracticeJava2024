package structy_Binary_tree;

import java.util.ArrayList;
// Write a method, depthFirstValues, that takes in the root of a binary tree. 
// The method should return a List containing all values of the tree in depth-first order.
import java.util.List;
import java.util.Stack;

class NodeA<T> {
	T val;
	NodeA<T> left;
	NodeA<T> right;

	public NodeA(T val) {

		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class DepthFirstValues {
	// Method to perform depth-first traversal on a binary tree and return the
	// values in a list
	public static List<String> depthFirstValues(NodeA<String> root) {
		Stack<NodeA<String>> stack = new Stack<>(); // Stack to manage the traversal
		stack.push(root); // Start with the root node
		List<String> values = new ArrayList<>(); // List to store the values

		// Continue until the stack is empty
		while (!stack.isEmpty()) {
			NodeA<String> current = stack.pop(); // Get the current node from the stack
			values.add(current.val); // Add its value to the list

			// If the current node has a right child, push it onto the stack
			if (current.right != null) {
				stack.push(current.right);
			}
			// If the current node has a left child, push it onto the stack
			if (current.left != null) {
				stack.push(current.left);
			}
		}
		return values; // Return the list of values
	}

	public static void main(String[] args) {
		// Create nodes for the binary tree
		NodeA<String> a = new NodeA<>("a");
		NodeA<String> b = new NodeA<>("b");
		NodeA<String> c = new NodeA<>("c");
		NodeA<String> d = new NodeA<>("d");
		NodeA<String> e = new NodeA<>("e");
		NodeA<String> f = new NodeA<>("f");

		// Establish the structure of the binary tree
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;

		// Perform depth-first traversal and print the result
		System.out.println(DepthFirstValues.depthFirstValues(a));
	}
}
