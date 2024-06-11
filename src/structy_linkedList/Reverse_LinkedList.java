package structy_linkedList;

//Write a method, reverseList, that takes in the head of a linked list as an argument. 
//The method should reverse the order of the nodes in the linked list in-place and return the new head of the reversed linked list.
class FNode<T> {
	T val;
	FNode<T> next;

	public FNode(T val) {
		this.val = val;
		this.next = null;
	}
}

public class Reverse_LinkedList { // iterative method

	public static <T> FNode<T> reveseList(FNode<T> head) {

		FNode<T> current = head;
		FNode<T> previous = null;

		while (current != null) { // it checks is current not equal to null, Node<T>
			FNode<T> next = current.next; // creating a temp node. it reference current.next =
			current.next = previous;
			// this changing the direction of the arrow pointer

			previous = current; // update the next current to become current previous
			current = next; // current to be the next
		}
		return previous;
	}

	public static void main(String[] args) {

		FNode<String> a = new FNode<>("a");
		FNode<String> b = new FNode<>("b");
		FNode<String> c = new FNode<>("c");
		FNode<String> d = new FNode<>("d");
		FNode<String> e = new FNode<>("e");
		FNode<String> f = new FNode<>("f");

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		FNode<String> reversedHead = Reverse_LinkedList.reveseList(a);

		// Print the reversed list
		FNode<String> current = reversedHead;
		while (current != null) {
			System.out.print(current.val + " ");
			current = current.next;
			System.out.println();
		}
	}
}