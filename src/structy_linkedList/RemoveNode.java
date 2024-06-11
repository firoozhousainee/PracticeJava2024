package structy_linkedList;

//Write a method, removeNode, that takes in the head of a linked list and a target value as arguments. 
//The method should delete the node containing the target value from the linked list and return the head of the resulting linked list.
//If the target appears multiple times in the linked list, only remove the first instance of the target in the list.
class NodeR<T> {
	T val;
	NodeR<T> next;

	public NodeR(T val) {
		this.val = val;
		this.next = null;
	}
}

public class RemoveNode {
	public static <T> NodeR<T> removeNode(NodeR<T> head, T targetVal) {
		if (head.val == targetVal) { // edge case: because there is no previous node,
			return head.next;
		}

		NodeR<T> current = head;
		NodeR<T> prev = null;
		while (current != null) {
			if (current.val == targetVal) {
				prev.next = current.next; // escape over the current node and pointing to the one after it
				break;
			}
			prev = current;
			current = current.next;
		}

		return head;
	}

	public static void main(String[] args) {

		NodeR<String> a = new NodeR<String>("a");
		NodeR<String> b = new NodeR<String>("b");
		NodeR<String> c = new NodeR<String>("c");
		NodeR<String> d = new NodeR<String>("d");
		a.next = b;
		b.next = c;
		c.next = d;

		NodeR<String> newHead = RemoveNode.removeNode(a, "c");

		NodeR<String> current = newHead;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;

		}
	}
}
