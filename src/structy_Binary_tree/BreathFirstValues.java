package structy_Binary_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//Write a method, breadthFirstValues, that takes in the root of a binary tree. 
//The method should return an array containing all values of the tree in breadth-first order
class NodeB<T> {
	T val;
	NodeB<T> left;
	NodeB<T> right;

	public NodeB(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class BreathFirstValues {
	public static List<String> breathFirstValues(NodeB<String> root) {
		if (root == null) {
			return List.of();
		}
		// Queue interface with ArrayDeque to manage the traversal
		List<String> values = new ArrayList<>(); // List to store the values
		Queue<NodeB<String>> queue = new ArrayDeque<>();
		queue.add(root); // Start with the root node
		// Continue until the queue is empty
		while (!queue.isEmpty()) {
			NodeB<String> node = queue.remove(); // Get the current node from the queue
			values.add(node.val); // Add its value to the list
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return values;
	}

	public static void main(String[] args) {

		NodeB<String> a = new NodeB<String>("A");
		NodeB<String> b = new NodeB<String>("B");
		NodeB<String> c = new NodeB<String>("C");
		NodeB<String> d = new NodeB<String>("D");
		NodeB<String> e = new NodeB<String>("e");
		NodeB<String> f = new NodeB<String>("F");

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		System.out.println(BreathFirstValues.breathFirstValues(a));

	}

}
