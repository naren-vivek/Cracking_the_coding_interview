package Helper;

public class SmallestKthElement {

	static class Node{
		int data;
		Node left;
		Node right;
		boolean isVisited;

		Node(int data){
			this.data= data;
			isVisited=false;
			left=null;
			right=null;
		}

		public void addNode(Node left, Node right){
			this.left=left;
			this.right=right;
		}
		
	}

public static int countNode(Node n){
	if(n==null){
		return 0;
	}
	
	return 1+ countNode(n.left)+ countNode(n.right);
}

public static int kthSmallestElement(Node n, int k){
	int count = countNode(n);
	if(count < k){
		return kthSmallestElement(n.right, k);
	}
	else if(count > k){
		return kthSmallestElement(n.left, k);
	}
	else if(count ==k){
		return n.data;
	}
	return 0;
}
	
	public static void main(String[] args){

		Node node15 = new Node(15);
		Node node10 = new Node(10);
		Node node11 = new Node(11);
		Node node7 = new Node(7);
		Node node5 = new Node(5);
		Node node8 = new Node(8);
		Node node20 = new Node(20);

		node15.addNode(node10, node20);
		node10.addNode(node7, node11);
		node7.addNode(node5, node8);

		System.out.println(kthSmallestElement(node15, 3));
	}

}
