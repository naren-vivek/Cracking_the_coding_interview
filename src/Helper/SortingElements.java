package Helper;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class SortingElements {
	
	int[] getSorted(int[] arr){
		
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		Collection<Integer> val= map.values();
		Object[] values = val.toArray();
		Arrays.sort(values);
		
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = new int[]{
				2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12
		};
		
	}
}
