package Helper;

import java.util.Scanner;

public class checkClass {

	public boolean checkTwoClasses(String s1, String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		String clock= s2.substring(2)+ s2.substring(0, 2);
		
		String antiClock= s2.substring(s2.length()-2)+s2.substring(0,s2.length()-2);
		
		return (s1.equals(clock)|| s1.equals(antiClock));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.next().to
		checkClass c = new checkClass();
		System.out.println(c.checkTwoClasses("amazon", "zonam"));
	}
}
