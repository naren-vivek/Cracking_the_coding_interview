package Helper;

public class WordReversal {

	public String rev(String word){
		String[] inpVal= word.split("\\.");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i< inpVal.length;i++){
			char[] ch = inpVal[i].toCharArray();
			int start =0;
			int end=ch.length-1;
			
			while(start < end){
				char temp = ch[end];
				ch[end]=ch[start];
				ch[start]=temp;
				start++;
				end--;
			}
			sb.append(ch);
			
			if(i!=inpVal.length-1){
				sb.append(".");
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		WordReversal wr = new WordReversal();
		System.out.println(wr.rev("Hi.This.is.Naren"));
	}
}
