package Chapter1;

public class TreeEdgesPrint {

	static class Node{
		int val;
		Node left;
		Node right;
		
		Node(int val){
			this.val=val;
		}
		
		Node(int val,Node left, Node right){
			this.val=val;
			this.left=left;
			this.right= right;
		}
	}
	public boolean printTreeLeft(Node root){
		
		if(root==null){
			return true;
		}
		if(root.left !=null){
			System.out.println("left "+root.val);
			printTreeLeft(root.left);
		}
		else if(root.left == null && root.right!=null){
			System.out.println("left "+root.val);
			printTreeLeft(root.right);
		}
		
		return true;
	}
	
public boolean printTreeRight(Node root){
		
		if(root==null){
			return true;
		}
		if(root.right !=null){
			System.out.println("right "+root.val);
			printTreeRight(root.right);
		}
		else if(root.right == null && root.left!=null){
			System.out.println("right "+root.val);
			printTreeRight(root.left);
		}
		
		return true;
	}

public boolean printLeaf(Node root){
	if(root==null){
		return true;
	}
	if(root.left==null && root.right==null){
		System.out.println(root.val);
	}
	printLeaf(root.left);
	printLeaf(root.right);
	return true;
}

public void printTree(Node root){
	System.out.println("root "+root.val);
	printTreeLeft(root.left);
	printLeaf(root);
	printTreeRight(root.right);
}
	public static void main(String[] args) {
		Node n3 = new Node(3);
		Node n6 = new Node(6);
		Node n14 = new Node(4);
		Node n16	= new Node(6);
		Node n4 = new Node(4,n3,null);
		Node n7 = new Node(7,n6,n4);
		Node n8 = new Node(8,null,n7);
		Node n5 = new Node(5,n8,n14);
		Node n17 = new Node(7,n16,null);
		Node n2 = new Node(2, n5,n17);
		
		TreeEdgesPrint e = new TreeEdgesPrint();
		e.printTree(n2);
		
	}
}
