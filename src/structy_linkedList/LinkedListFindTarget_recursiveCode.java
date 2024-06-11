package structy_linkedList;

//Write a method, getNodeValue, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.
//If there is no node at the given index, then return null.
class BNode<T> {
	T val;
	BNode<T> next;

	public BNode(T val) {
		this.val = val;
		this.next = null;
	}
}

class LinkedListFindTarget_recursiveCode {
	public static <T> boolean linkedListFind(BNode<T> head, T target) {
		BNode current = head;
		while (current != null) {
			if (target == current.val) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public static void main(String[] args) {

		BNode<String> a = new BNode<>("a");
		BNode<String> b = new BNode<>("b");
		BNode<String> c = new BNode<>("c");
		BNode<String> d = new BNode<>("d");

		a.next = b;
		b.next = c;
		c.next = d;
		System.out.println(LinkedListFindTarget_recursiveCode.linkedListFind(a, "g"));
		System.out.println(LinkedListFindTarget_recursiveCode.linkedListFind(a, "c"));
		System.out.println(LinkedListFindTarget_recursiveCode.linkedListFind(a, "d"));
	}

}
