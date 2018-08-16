package Chapter_1;

public class IsUnique {

	public static void main(String[] args) {
	
		System.out.println(isUnique("aa"));
	}
	
	public static boolean isUnique(String input){
		
		int countCheck=0;
		
		for(char ch : input.toCharArray()){
			
			int inputChar = 0;
			inputChar = 1 << ('a'-ch);
			if((inputChar & countCheck) == 0){
				countCheck = countCheck | inputChar;
			}else{
				return false;
			}
		}
		return true;
	}
}
