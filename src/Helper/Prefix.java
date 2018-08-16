package Helper;

import java.util.Scanner;

public class Prefix {

	public Integer findLongestPrefix(String [] inp){
		String root = inp[0];
		int j=0;
		int len=0;
		for(int i=0;i<inp.length;i++){
			
			 int currlen =inp[i].length();
			 if()
		}
		for(int i=1;i<inp.length;i++){
			for(j=0;j<root.length();j++){
				if(inp[i].charAt(j)==root.charAt(j)){
					continue;
				}else{
					root= root.substring(j);
					if(j==0){
						return -1;
					}
				}
			}
		}
		return root.length();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] inp = sc.nextLine().split(" ");
		
		Prefix p = new Prefix();
		System.out.println(p.findLongestPrefix(inp));
		
	}
}
