package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Program3 {

	public static void printString(String inp){
		
		int[] charVal= new int[26];
		int lastIndex=0;
		Arrays.fill(charVal, 0);
		for(char c : inp.toCharArray()){
			int charValue = (int) c - (int) 'a';
			charVal[charValue]=lastIndex;
			lastIndex++;
		}
		System.out.println(Arrays.toString(charVal));
		int startpos=0;
		int currentIndex=0;
		int lastpos=0;
		List<Integer> valList = new ArrayList<>();
		for(char ch : inp.toCharArray()){
			
			int val = (int) ch - (int) 'a';
			int lastInde= charVal[val];
			

			if(lastInde > lastpos){
				lastpos=lastInde;
			}
			if(currentIndex == lastpos){
				valList.add(currentIndex-startpos+1);
				startpos=currentIndex+1;
				lastpos=0;
			}
			currentIndex++;
		}
		
		System.out.println(valList);
	}
	
	public static void main(String[] args) {
		LinkedHashMap<K, V>
		List<Integer> val = new ArrayList<>();
		val.add(1);
		val.add(2);
		val.add(1);
		val.add(5);
		val.remove(1);
		System.out.println(Arrays.toString(val.toArray()));
		printString("abcdafghif");
	}
}
