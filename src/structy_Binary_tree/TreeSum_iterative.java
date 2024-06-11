package structy_Binary_tree;

import java.util.Stack;

class NodeSum<T> {
	T val;
	NodeSum<T> left;
	NodeSum<T> right;

	public NodeSum(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class TreeSum_iterative {

	// Method to calculate the sum of all values in the binary tree iteratively
	public static int treeSum(NodeSum<Integer> root) {
		if (root == null) {
			return 0; // If the tree is empty, return 0
		}

		Stack<NodeSum<Integer>> stack = new Stack<>();
		stack.push(root); // Push the root node to the stack
		int sum = 0;

		// Iterate until the stack is empty
		while (!stack.isEmpty()) {
			NodeSum<Integer> current = stack.pop(); // Pop a node from the stack
			sum += current.val; // Add the value of the node to the sum

			// If the right child exists, push it to the stack
			if (current.right != null) {
				stack.push(current.right);
			}

			// If the left child exists, push it to the stack
			if (current.left != null) {
				stack.push(current.left);
			}
		}

		return sum; // Return the total sum
	}

	public static void main(String[] args) {
		// Creating the nodes of the binary tree
		NodeSum<Integer> a = new NodeSum<>(3);
		NodeSum<Integer> b = new NodeSum<>(11);
		NodeSum<Integer> c = new NodeSum<>(4);
		NodeSum<Integer> d = new NodeSum<>(4);
		NodeSum<Integer> e = new NodeSum<>(-2);
		NodeSum<Integer> f = new NodeSum<>(1);

		// Setting up the tree structure
		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;

		// Calling the treeSum method and printing the result
		System.out.println(TreeSum_iterative.treeSum(a)); // Output the total sum of the tree
	}
}
