package Chapter1;

import java.util.LinkedList;
import java.util.Queue;

public class Node {

    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
     static class BinaryTree {
    	 
        Node root;
        Queue<Node> queue= new LinkedList<Node>();
        
        void printLevelOrder(){
        	
        	queue.add(root);
        	while(!queue.isEmpty()){
        		Node n= queue.poll();
        		
        		System.out.println(n.data);
        		
        		if(n.left!=null){
        			queue.add(n.left);
        		}
        		if(n.right!=null){
        			queue.add(n.right);
        		}
        	}
        }
	
	 public static void main(String args[]) 
	    {
	        /* creating a binary tree and entering 
	         the nodes */
	        BinaryTree tree_level = new BinaryTree();
	        tree_level.root = new Node(1);
	        tree_level.root.left = new Node(2);
	        tree_level.root.right = new Node(3);
	        tree_level.root.left.left = new Node(4);
	        tree_level.root.left.right = new Node(5);
	 
	        System.out.println("Level order traversal of binary tree is - ");
	        tree_level.printLevelOrder();
	    }
}

}