package Helper;

import java.util.Stack;

public class ParanthesisChecker {
	

	public boolean isValid(char[] inp){
		
		Stack<Character> val = new Stack<>();
		val.push(inp[0]);
		for(int i=1;i<inp.length;i++){
			if(inp[i]=='{' || inp[i]=='(' || inp[i]=='['){
				val.push(inp[i]);
			}
			else{
				switch(inp[i]){
				
				case'}': if(val.peek()!='{'){
					return false;
				}else{
					val.pop();
				}
				break;
				
				case')': if(val.peek()!='('){
					return false;
				}else{
					val.pop();
				}
				break;
				
				case']': if(val.peek()!='['){
					return false;
				}else{
					val.pop();
				}
				break;
				
				default: return false;
				
			}
		}
		
		}
		if(!val.isEmpty()){
			return false;
		}
			
		
		return true;
	}
	public static void main(String[] args) {
		
		ParanthesisChecker check = new ParanthesisChecker();
		String inp="[(])";
		
		char[] inpVal =inp.toCharArray();
		System.out.println(check.isValid(inpVal));
		
	}
}
