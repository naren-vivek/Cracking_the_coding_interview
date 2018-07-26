package Chapter1;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchExampleNeighbourList
{

	static class Node{
		
		int value;
		boolean isVisited;
		List<Node> neighbours;
		
		Node(int value){
			this.value=value;
			this.isVisited=false;
			neighbours= new ArrayList<>();
		}
		
		public void addneighbours(Node neighbours){
			this.neighbours.add(neighbours);
		}
		
		public void addneighboursList(List<Node> neighbours){
			this.neighbours=neighbours;
		}
		
		public List<Node> getNeighbours(){
			return this.neighbours;
		}
	}
	
	public void dfs(Node n){
		
		System.out.print(n.value+" ");
		n.isVisited=true;
		for(Node neighbours: n.getNeighbours()){
			if(neighbours!=null && neighbours.isVisited == false){
				dfs(neighbours);
			}
		}
	}
	
	public static void main(String[] args) {
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
 
		node40.addneighbours(node10);
		node40.addneighbours(node20);
		node10.addneighbours(node30);
		node20.addneighbours(node10);
		node20.addneighbours(node30);
		node20.addneighbours(node60);
		node20.addneighbours(node50);
		node30.addneighbours(node60);
		node60.addneighbours(node70);
		node50.addneighbours(node70);
 
		DepthFirstSearchExampleNeighbourList dfsExample = new DepthFirstSearchExampleNeighbourList();
 
		System.out.println("The DFS traversal of the graph using stack ");
		
		dfsExample.dfs(node40);
	}

}
