package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {

	public static void main(String[] args) {
		
		int[] states = {1,0,0,0,0,1,0,0};
		List<Integer> values=cellCompete(states, 2);
		values.forEach(System.out::print);
	}
	
	public static List<Integer> cellCompete(int[] states, int days)
    {
		int [] newStates = new int[states.length];
	while(days != 0){
		System.out.println("ran for day "+days);
	
    for(int i=0;i< states.length;i++){
    	System.out.println("ran for "+i);
    	if(i-1 < 0){
    		if((0 ^ states[i+1]) == 0){
    			newStates[i]=0;
    		}else{
    			newStates[i]=1;
    		}
    	}
    	else if((i+1) >= states.length){
    		if((0 ^ states[i-1]) == 0){
    			newStates[i]=0;
    		}else{
    			newStates[i]=1;
    		}
    	}
    	else{
    		if((states[i-1] ^ states[i+1]) == 0){
    			newStates[i]=0;
        }else{
        	newStates[i]=1;
        }
    	}
    }
    days--;
    states= Arrays.copyOf(newStates, newStates.length) ;
	}
	List<Integer> val = new ArrayList<>();
	 for(int state: newStates){
		 val.add(state);
	 }
	 return val;
    }
	
}
