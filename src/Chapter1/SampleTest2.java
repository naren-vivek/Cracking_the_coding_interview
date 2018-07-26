package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SampleTest2 {

	public static void main(String[] args) {
		
		removeDuplicates("awaglknagawunagwkwagl",4);
		removeDuplicates("abab",3);
	}
	
	public static List<String> removeDuplicates( String input, int num){
		
	Set<String> inputVal = new HashSet<>();
	List<String> outputString = new ArrayList<>();
		for(int i=0;i<input.length();i++){
			StringBuilder sb = new StringBuilder();
			Set<Integer> checkVal = new HashSet<>();
			boolean checkIsValid=true;
			if(i== input.length()-num+1){
				break;
			}
			for(int j=i;j<i+num;j++){
				int a=input.charAt(j);
				if(!checkVal.contains(a)){
					checkVal.add(a);
					sb.append(input.charAt(j));
					checkIsValid=true;
				}else{
					checkIsValid=false;
					break;
				}
				
			}
			if(checkIsValid &&!inputVal.contains(sb.toString())){
				outputString.add(sb.toString());
			}
	
		}
		System.out.println(Arrays.toString(outputString.toArray()));
		return outputString;
	}

	
}
