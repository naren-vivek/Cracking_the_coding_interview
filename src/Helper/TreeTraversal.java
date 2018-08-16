package Helper;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TreeTraversal {

	static HashMap<Integer, Integer> counterMap = new HashMap<>();
	
	static int counter=0;
	
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
	
	public static int setCounterMapValues(Node n){
		if(n==null){
			return 0;
		}
		setCounterMapValues(n.left);
		counterMap.put(++counter, n.data );
		setCounterMapValues(n.right);
		return 1;
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
		setCounterMapValues(node15);
		
		Iterator it= counterMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Integer> map = (Entry<Integer, Integer>) it.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}
	}
}

