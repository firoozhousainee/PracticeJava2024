package structy_Binary_tree;

class NodeTs<T> {

	T val;
	NodeTs<T> left;
	NodeTs<T> right;

	public NodeTs(T val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class TreeSum_recursive {
	public static int treeSum(NodeTs<Integer> root) {
		if (root == null) { // base case
			return 0;
		}
		return root.val + treeSum(root.left) + treeSum(root.right); // recursive case

	}

	public static void main(String[] args) {

		NodeTs<Integer> a = new NodeTs<>(3);
		NodeTs<Integer> b = new NodeTs<>(11);
		NodeTs<Integer> c = new NodeTs<>(4);
		NodeTs<Integer> d = new NodeTs<>(4);
		NodeTs<Integer> e = new NodeTs<>(-2);
		NodeTs<Integer> f = new NodeTs<>(1);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.right = f;
		System.out.println(TreeSum_recursive.treeSum(a)); // must calculate the total sum
	}

}
