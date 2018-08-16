package Helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		isPermutationPossible("abcabaghijfg");


	}

	public static List<Integer> isPermutationPossible(String inp){

		int [] lastIndex= new int[26];
		int currIndex=0;

		for(char c: inp.toCharArray()){
			int charIndex= (int) c- (int)'a';
			lastIndex[charIndex]=currIndex;
			currIndex++;
		}
		System.out.println(Arrays.toString(lastIndex));
		currIndex=0;
		int startPos=0;
		int lastPos=0;

		List<Integer> result = new LinkedList<>();

		for(char c: inp.toCharArray()){
			int charIndex= (int) c- (int) 'a';
			if(lastPos < lastIndex[charIndex]){
				lastPos=lastIndex[charIndex];
			}
			if(currIndex==lastPos){
				result.add(lastPos-startPos+1);
				startPos=currIndex+1;
			}
			currIndex++;
		}

		System.out.println(result);
		return result;
	}
}