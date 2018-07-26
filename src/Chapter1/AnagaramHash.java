package Chapter1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class AnagaramHash{
	
	static class Data implements Comparable<Data>{
		int val;
		String inp;
		
		public Data(int val, String inp){
			this.val=val;
			this.inp=inp;
		}

		@Override
		public int compareTo(Data o) {
			// TODO Auto-generated method stub
			return o.val-this.val;
		}
	}

	public void printKthLargest(List<Data> inp, int k){
		
		PriorityQueue<Data> inpQueue = new PriorityQueue<>(k);/*, new Comparator<Data>() {

			@Override
			public int compare(Data o1, Data o2) {
				// TODO Auto-generated method stub
				return o1.val-o2.val;
			}
		});*/
		
		for(Data val: inp){
			inpQueue.add(val);
			
			if(inpQueue.size()> k){
				inpQueue.poll();
			}
		}
		
		Data d=inpQueue.poll();
		System.out.println(d.inp+" "+d.val);
	}

	public static void main(String[] args) {
		AnagaramHash hash = new AnagaramHash();
		Data d = new Data(20,"a");
		Data d2 = new Data(9,"b");
		Data d3= new Data(5,"c");
		Data d4 = new Data(11,"d");
		Data d5 = new Data(41,"e");
		Data d6 = new Data(16,"f");
		Data d7 = new Data(35,"g");
		
		List<Data> ll = new ArrayList<>();
		ll.add(d);
		ll.add(d2);
		ll.add(d3);
		ll.add(d4);
		ll.add(d5);
		ll.add(d6);
		ll.add(d7);
		
		
		int [] inp ={
			20,9,5,11,11,11,35	
		};
		hash.printKthLargest(ll, 3);
		
	}

	@Override
	public int compareTo(Data o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
