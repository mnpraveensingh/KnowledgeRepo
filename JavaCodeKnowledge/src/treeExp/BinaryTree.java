package treeExp;

public class BinaryTree {
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		/* create root */
		tree.root = new Node(1);

		/*
		 * following is the tree after above statement
		 * 
		 *	 	  1 
		 * 		/ 	\ 
		 * 	  null null
		 */

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/*
		 * 2 and 3 become left and right children of 1 
		 * 				 	1 
		 * 				/ 		\ 
		 * 			   2   		  3 
		 * 			/    \ 		/   \ 
		 * 		  null  null   null null
		 */

		tree.root.left.left = new Node(4);
		/*
		 * 4 becomes left child of 2 
		 * 						1 
		 * 				/             \ 
		 * 			   2 			   3 
		 * 			/ 	   \ 	    /     \ 
		 * 		   4      null    null   null 
		 * 		  / \ 
		 *     null null
		 */
		System.out.println("tree : " + tree);
		tree.printPreorder();
	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

	// Wrappers over above recursive functions
	void printPreorder() {
		printPreorder(root);
	}
	void printPostorder() {
		printPostorder(root);
	}
	void printInorder() {
		printInorder(root);
	}

	/* Given a binary tree, print its nodes in preorder */
	void printPreorder(Node node) {
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.key + " ");

		/* then recur on left subtree */
		printPreorder(node.left);

		/* now recur on right subtree */
		printPreorder(node.right);
	}

	/*
	 * Given a binary tree, print its nodes according to the "bottom-up" postorder
	 * traversal.
	 */
	void printPostorder(Node node) {
		if (node == null)
			return;

		// first recur on left subtree
		printPostorder(node.left);

		// then recur on right subtree
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.key + " ");
	}

	/* Given a binary tree, print its nodes in inorder */
	void printInorder(Node node) {
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.key + " ");

		/* now recur on right child */
		printInorder(node.right);
	}
}
