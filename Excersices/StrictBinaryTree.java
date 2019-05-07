package excersices;

import excersices.TreeNode;
import excersices.TreeNode.Node;

public class StrictBinaryTree {

	Node root;
	
	public class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
	
	public void add(int value) {
        root = addRecursive(root, value);
    }
	
	private Node addRecursive(Node current, int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current;
    }
	
	public static void main(String[] args) {
		
		StrictBinaryTree bt = new StrictBinaryTree();
		//TreeNode tree = new TreeNode();
		 
		//tree = 
		
		bt.add(6);
		bt.add(4);
		bt.add(8);
		bt.add(3);
		bt.add(5);
		bt.add(7);
		bt.add(9);
		bt.add(10);
		
		bt.isStrictTree(bt.root);
		//isStrictTree(bt);

	}
	
	public Boolean isStrictTree(Node node) {
		
		boolean flag = true;
		System.out.println("initialazing");
		
		if (node != null){
			
			if (node.left != null && node.right != null) {
				return true;				
			} 
			
			if ((node.left == null && node.right != null) || (node.left != null && node.right == null)){
				return false;
			} else if (node.left == null && node.right == null){
				System.out.println("Node : " + node.value + " is leaf");
				//return true;
			} else if (node.right == null) {
				System.out.println("Node : " + node.value + " has child : " + node.left.value);
				System.out.println("Not strict binary three");
				flag = false;
			} else if (node.left == null) {
				System.out.println("Node : " + node.value + " has child : " + node.right.value);
				System.out.println("Not strict binary three");
				flag = false;
			} 
			
		} else {
		
			System.out.println("terminating");
			return flag;
		}
		
		return flag;
		
	}
		
}
