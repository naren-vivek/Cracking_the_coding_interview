package Helper;

import java.util.Stack;

public class NGE {

	void printNGE(int[] arr){
		Stack<Integer> st = new Stack<>();
		st.push(arr[0]);
		for(int i=1;i<arr.length;i++){
			while(true){
				if(!st.isEmpty() && arr[i] > st.peek()){
					st.pop();
					System.out.println(arr[i] +" ");
				}
				else{
					st.push(arr[i]);
					break;
				}
			}
		}
		
		while(!st.isEmpty()){
			System.out.println(-1);
			st.pop();
		}
	}
	public static void main(String[] args) {
		int [] arr = new int[]{
			1,3,1,5,7,1,6,4	
		};
		
		NGE ng = new NGE();
		ng.printNGE(arr);
	}
}
