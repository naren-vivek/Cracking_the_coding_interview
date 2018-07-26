package Chapter1;

import java.util.HashMap;
import java.util.HashSet;

public class BalanceedTree {

	static boolean isDone=false;
	static class BinaryTree{
		BinaryTree left;
		BinaryTree right;
		int val;
		
		public BinaryTree(BinaryTree left,BinaryTree right, int val) {
			this.left=left;
			this.right=right;
			this.val=val;
			// TODO Auto-generated constructor stub
		}
		
	}
	
	static Integer checkIfBalanced(BinaryTree root){
		
		if(root==null || isDone){
			return 0;
		}
		
		checkIfBalanced(root.left);
		System.out.println("val is :"+root.val);
		int lr=height(root.left);
		int lh=height(root.right);
		System.out.println("left :"+lr+" right : "+lh);
		if(Math.abs(lr-lh)>=2){
			System.out.println("It is not balanced");
			isDone=true;
			return 0;
		}
		
		checkIfBalanced(root.right);
		return 1;
		
	}
	
	static Integer height(BinaryTree n){
		if(n==null)
			return 0;
		
		return 1+(Math.max(height(n.left),height(n.right)));
	}
	public static void main(String[] args) {
		
		//BinaryTree tree9 = new  BinaryTree(null, null, 8);
		BinaryTree tree8 = new  BinaryTree(null, null, 8);
		BinaryTree tree7 = new  BinaryTree(null, null, 7);
		BinaryTree tree6 = new  BinaryTree(null, null, 6);
		BinaryTree tree5 = new  BinaryTree(null, null, 5);
		BinaryTree tree4 = new  BinaryTree(null,tree8 , 4);
		BinaryTree tree3 = new  BinaryTree(tree6, tree7, 3);
		BinaryTree tree2 = new  BinaryTree(tree4, null, 2);
		BinaryTree tree1 = new  BinaryTree(tree2, tree3, 1);
		HashSet<E>
		 
		System.out.println(checkIfBalanced(tree1));
		
	}
}
