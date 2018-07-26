package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {

		isStringUnique("aaaglknaagawunagwkwagl", 4);
	}

	public static List<String> isStringUnique(String inputStr, int num){
		
		int[] charCount = new int[26];
		int numberOfInvalids=0;
		Set<String> resultSet = new HashSet<>();
		List<String> result= new LinkedList<>();
		for(int i=0;i< num;i++){
			int charIndex= (int) inputStr.charAt(i)-(int) 'a';
			if(charCount[charIndex]==1){
				numberOfInvalids++;
			}
			charCount[charIndex]++;
		}
		
		if(numberOfInvalids == 0){
			String s = inputStr.substring(0, num);
			result.add(s);
			resultSet.add(s);
			
		}
		for(int i=num;i<inputStr.length();i++){
			int charIndex= (int) inputStr.charAt(i)-(int) 'a';
			if(charCount[charIndex]==1){
				numberOfInvalids++;
			}
			charCount[charIndex]++;
			
			
			 charIndex= (int) inputStr.charAt(i-num)-(int) 'a';
			 if(charCount[charIndex]==2){
				 numberOfInvalids--;
		}
			 charCount[charIndex]--;
			 
		
		if(numberOfInvalids == 0){
			String s = inputStr.substring(i-num+1, i+1);
			if(!resultSet.contains(s)){
				result.add(s);
				resultSet.add(s);
			}
		}
		}
		System.out.println(Arrays.toString(result.toArray()));
		return result;
	}
}
