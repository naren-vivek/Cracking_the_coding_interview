package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Regex {

	public void printRegex(String inp){
		
		String[] words = inp.replaceAll("[^a-zA-Z ]", "").split(" ");
		String[] words1 = inp.replaceAll("[^a-zA-Z ]", "").split(" ");
		
		for(String w: words){
			
			char[] arr = w.toCharArray();
			for(char a : arr)
			System.out.println((int)a);
		}
		System.out.println(Arrays.toString(words));
		System.out.println(Arrays.toString(words1));

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		Regex r = new Regex();
		r.printRegex(inp);
	}
}
