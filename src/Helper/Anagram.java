package Helper;

public class Anagram {

	public boolean checkIfAnangram(String s1, String s2){
		
		char[] c1=s1.toCharArray();
		char[] c2 =s2.toCharArray();
		int check =0;
		for(int i=0;i<c1.length;i++){
			int test=0;
			int test2=0;
			test =1 << c1[i];
			test2= 1<< c2[i];
			if((check ^ test) != 0){
				check= 1<< c1[i];
			}else{
				check= 0 << c1[i];
			}
			
			if((check ^ test2) != 0){
				check= 1<< c2[i];
			}else{
				check= 0 << c2[i];
			}
		}
		
		if(check==0){
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		Anagram g = new Anagram();
		System.out.println(g.checkIfAnangram("caaaat", "aactaa"));
	}
}
