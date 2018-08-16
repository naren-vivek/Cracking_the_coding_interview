package Helper;

import java.util.Random;
import java.util.Scanner;

public class TicTacT {

	public static char[][] tic;
	public static boolean isWon;
	public static boolean isDraw;
	public static char currentPlayer;
	
	
	public TicTacT() {
		// TODO Auto-generated constructor stub
		tic= new char[3][3];
		isWon=false;
		isDraw=false;
		currentPlayer='x';
		intializeBoard();
		printBoard();
	}
	
	public  void printBoard(){
		for(int i=0;i<tic.length;i++){
			System.out.print("|");
			for(int j=0;j<tic.length;j++){
				System.out.print(tic[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	public  void intializeBoard(){
		for(int i=0;i<tic.length;i++){
			for(int j=0;j<tic.length;j++){
				tic[i][j]='*';
			}
			System.out.println();
		}
	}
	
	public  boolean isValid(int row, int col){
		if(row<0 || col <0 || row>=tic.length || col >= tic.length || tic[row][col]!='*'){
			System.out.println("Provide proper values for row and col");
			return false;
		}
		return true;
	}
	
	public  void changeCurrentPlayer(){
		currentPlayer=  currentPlayer=='x'? 'o':'x';
	}
	
	public  boolean checkIfWon(int row, int col){
		
		//row check
		for(int j=0;j<tic.length;j++){
			if(tic[row][j]==currentPlayer){
				isWon=true;
			}
			else{
				isWon=false;
				break;
			}
		}
		
		if(!isWon){
			for(int j=0;j<tic.length;j++){
				if(tic[j][col]==currentPlayer){
					isWon=true;
				}
				else{
					isWon=false;
					break;
				}
			}
		}
		
		if(!isWon){
			for(int i=0,j=0;j<tic.length;i++,j++){
				if(tic[i][j]==currentPlayer){
					isWon=true;
				}
				else{
					isWon=false;
					break;
				}
			}
		}
		
		if(!isWon){
			for(int i=0,j=tic.length-1;i<tic.length;i++,j--){
				if(tic[i][j]==currentPlayer){
					isWon=true;
				}
				else{
					isWon=false;
					break;
				}
			}
		}
		return isWon;
	}
	
	public static boolean checkIfDraw(){
		
		for(int i=0;i<tic.length;i++){
			for(int j=0;j<tic.length;j++){
				if(tic[i][j]!='*'){
					return false;
				}
			}
		}
		isDraw=true;
		return isDraw;
	}
	public  boolean makeMove(int row, int col){
		tic[row][col]= currentPlayer;
		if(checkIfWon(row, col)){
			return true;
		}
		if(checkIfDraw()){
			return true;
		}
		changeCurrentPlayer();
		printBoard();
		
		return false;
	}
	
	public static void main(String[] args) {
		TicTacT t = new TicTacT();
		int changeCOunter=0;
		Scanner sc = new Scanner(System.in);
		while(!isDraw && !isWon){
			if(changeCOunter%2==0){
				String[] inp = sc.nextLine().split(" ");
				if(inp.length==2){
					int row = Integer.valueOf(inp[0]);
					int col = Integer.valueOf(inp[1]);      //    0 1 2
					if(t.isValid(row, col)){					// 0  1 2 3
						t.makeMove(row, col);					// 1  4 5 6
						changeCOunter++;					// 2  7 8 9
					}
				}
			}
			else{
				Random r = new Random();
				int col=r.nextInt(3);
				int row=r.nextInt(3);
				System.out.println(row+" "+col);
				if(t.isValid(row, col)){
					t.makeMove(row, col);
					changeCOunter++;
				}
			}
			
		}
		
		System.out.println(isDraw? "Match is draw": " Match is won by "+currentPlayer);
		t.printBoard();
	}
}
