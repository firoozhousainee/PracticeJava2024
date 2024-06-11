package structy_linkedList;

// Write a method, mergeLists, that takes in the head of two sorted linked lists as arguments. 
// The method should merge the two lists together into single sorted linked list. 
// The method should return the head of the merged linked list.
class MLNode<T> {
	T val;
	MLNode<T> next;

	public MLNode(T val) {

		this.val = val;
		this.next = null;
	}
}

public class MergeLists {
//	public static MLNode<Integer> mergeLists(MLNode<Integer> head1, MLNode<Integer> head2){
//		MLNode<Integer> dummyHead = new MLNode<>(0); // creating a dummy/fake head to store integers in these nodes
//		MLNode<Integer> current1 = head1; 
//		MLNode<Integer> current2 = head2; 
//		MLNode<Integer> tail = dummyHead;
//		while(current1 != null && current2 != null) {
//			if(current1.val < current2.val) {
//				tail.next = current1; // 
//				current1 = current1.next; // to progress to the next node
//			}
//			else {
//				tail.next = current2; 
//				current2 = current2.next; 
//			}
//			if(current1 != null) { // for the leftover nodes from any list, we need to handle here with this if statement
//				tail.next = current1; 
//			}
//			if(current2 != null) {
//				tail.next = current2; 
//			}
//			
//		}
//	
//		return dummyHead.next; 
//	}
	public static MLNode<Integer> mergeLists(MLNode<Integer> head1, MLNode<Integer> head2) {

		if (head1 == null) { // base case
			return head2;
		}
		if (head2 == null) { // base case
			return head1;
		}

		if (head1.val < head2.val) {
			head1.next = mergeLists(head1.next, head2);
			return head1;
		} else {
			head2.next = mergeLists(head2.next, head1);
			return head2;
		}
	}

	public static void main(String[] args) {

	}
}
