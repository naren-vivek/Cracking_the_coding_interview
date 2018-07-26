package Chapter1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Palindorme {

	public static boolean checkIfPalindrome(String input){
		int start =0;
		int end = input.length()-1;
		
		while(start < end){
			if(input.charAt(start)== input.charAt(end)){
				start++;
				end--;
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		queue.add(7);
		queue.add(5);
		queue.add(8);
		System.out.println(queue.poll());
		System.out.println(checkIfPalindrome("geeeg"));
	}
}
