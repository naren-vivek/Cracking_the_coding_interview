package Chapter1;


public class checkIfBst {

static boolean isDone= false;
static BinaryTree prev=null;
	static class BinaryTree{
		BinaryTree left;
		BinaryTree right;
		int maxRight;
		int maxLeft;
		int val;
		
		public BinaryTree(BinaryTree left,BinaryTree right, int val) {
			this.left=left;
			this.right=right;
			this.val=val;
			// TODO Auto-generated constructor stub
		}
	}
	
	static boolean checkIfBst(BinaryTree root){
		
		if(root==null){
			return true;
		}
		if(checkIfBst(root.left)){
			
			if(prev!=null){
				System.out.println("root "+root.val+" prev val "+prev.val);
			}
			
			if(prev!=null && root.val<= prev.val)
				return false;
			
			prev=root;
			
			return checkIfBst(root.right);
		}
		else{
			return false;
		}
	}
	
public static void main(String[] args) {
		
		BinaryTree tree8 = new  BinaryTree(null, null, 8);
		BinaryTree tree6 = new  BinaryTree(null, null, 6);
		BinaryTree tree7 = new  BinaryTree(tree6, tree8, 7);
		BinaryTree tree5 = new  BinaryTree(null, null, 5);

		
		System.out.println(checkIfBst(tree7));
		
	}
}
