package Helper;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static char[][] ticTac ;
	public static boolean isWon;
	public static boolean isDraw;
	public static char currentPlayer;
	
	public TicTacToe(){
		ticTac= new char[3][3];
		isDraw=false;
		isWon=false;
		currentPlayer='x';
		intializeBoard();
	}
	
	public static void intializeBoard(){
		
		for(int i=0;i<ticTac.length;i++){
			for(int j=0;j<ticTac.length;j++){
				ticTac[i][j]='*';
				
			}
		}
	}
	public static void printBoard(){
		System.out.println("---------");
		for(int i=0;i<ticTac.length;i++){
			System.out.print("|");
			for(int j=0;j<ticTac.length;j++){
				System.out.print(ticTac[i][j]+" |");
				
			}
			System.out.println();
			System.out.println("---------");
		}
	}
	
	public static boolean isValid(int row, int col){
		if(row<0 || col < 0 || row >=ticTac.length || col >= ticTac.length || ticTac[row][col]!='*'){
			System.out.println("Enter proper row and col values");
			return false;
		}
		return true;
	}
	
	public static void changePlayer(){
		currentPlayer=currentPlayer=='x'? 'o':'x';
	}
	
	public static boolean checkIfWon(int row, int col){
		
		// check for row
		for(int j=0;j<ticTac.length;j++){
			if(ticTac[row][j]== currentPlayer){
				isWon=true;
			}else{
				isWon=false;
				break;
			}
		}
		if(!isWon){
			for(int i=0;i<ticTac.length;i++){
				if(ticTac[i][col]== currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		
		if(!isWon){
			for(int i=0,j=0;i<ticTac.length;i++,j++){
				if(ticTac[i][j]== currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		
		if(!isWon){
			for(int i=0,j=ticTac.length-1;i<ticTac.length;i++,j--){
				if(ticTac[i][j]== currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		return isWon;
	}
	
	public static boolean isDraw(){
		
		for(int i=0;i<ticTac.length;i++){
			for(int j=0;j<ticTac.length;j++){
				if(ticTac[i][j]=='*'){
					isDraw=false;
					return isDraw;
				}
				
			}
		}
		isDraw=true;
		return isDraw;
	}
	public static boolean MakeMove(int row,int col){
		ticTac[row][col]=currentPlayer;
		if(checkIfWon(row, col)){
			return true;
		}else if(isDraw()){
			return true;
		}
		changePlayer();
		printBoard();
		return false;
	}
	
	public static void main(String[] args) {
		TicTacToe ticTacToe = new TicTacToe();
		printBoard();
		int changeCounter =0;
		int row,col=0;
		Scanner sc = new Scanner(System.in);
		while(!isDraw && !isWon){
			if(changeCounter%2==0){
				String[] inp=sc.nextLine().split(" ");
				if(inp.length==2){
					row=Integer.valueOf(inp[0]);
					col=Integer.valueOf(inp[1]);
					if(isValid(row, col)){
						MakeMove(row, col);
						changeCounter++;
					}
				}
			}else{
				Random r = new Random();
				int num =r.nextInt(8);
				System.out.println(num);
				 row=((num+4)/3)-1;
				 col=((num+4)%3)-1;
//				row= r.nextInt(3);
//				col= r.nextInt(3);
				System.out.println(row+" "+col);
				if(isValid(row, col)){
					MakeMove(row, col);
					changeCounter++;
				}
			}
			
		}
		System.out.println(isDraw? "Match is Draw" : "Hurray!!!! match is won by "+currentPlayer);
		printBoard();
	}
}
