package Chapter1;

public class RemoveDuplicates {

	public String removeDup(String inp){
		
		StringBuilder sb = new StringBuilder();
		
		char[] ch = inp.toCharArray();
		char prev='-';
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]== prev){
				prev=ch[i];
				continue;
			}
			else if(i+1 < ch.length && ch[i+1]==ch[i]){
				prev=ch[i];
				continue;
			}
			System.out.println(i+ " "+ch[i]);
			prev=ch[i];
			sb.append(ch[i]);
			System.out.println(sb.toString());
		}
		
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		RemoveDuplicates dup = new RemoveDuplicates();
		System.out.println(dup.removeDup("geeksforgeek"));
	}
}
