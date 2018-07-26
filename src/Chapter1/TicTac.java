package Chapter1;

import java.util.Random;
import java.util.Scanner;

public class TicTac {
	public static char[][] ticTacToe;
	public static boolean isWon;
	public static boolean isDraw;
	public static char currentPlayer;
	
	public static final int HO =0;
	public static final int VE =1;
	public static final int CR =2;
	public static final int RC =3;

	public TicTac(){
		ticTacToe= new  char[3][3];
		isWon=false;
		isDraw=false;
		currentPlayer='x';

		for(int i=0;i<ticTacToe.length;i++){
			for(int j=0;j<ticTacToe.length;j++){
				ticTacToe[i][j]='*';
			}
		}
		printBoard();
	}

	public static void changePlayer(){
		currentPlayer= currentPlayer == 'x' ? 'o':'x';
	}
	public static void printBoard(){

		for(int i=0;i<ticTacToe.length;i++){
			System.out.print("| ");
			for(int j=0;j<ticTacToe.length;j++){
				System.out.print( ticTacToe[i][j]+" |");
			}
			System.out.println();
		}
	}
	public static boolean validate(int row, int col){
		if(row < 0 || col < 0 || row >= ticTacToe.length || col >=ticTacToe.length){
			System.out.println("provide input within the range o to "+(ticTacToe.length-1));
			return true;
		}
		else if(ticTacToe[row][col]!='*'){
			System.out.println("Select an unmarked place");
			return true;
		}
		return false;
	}

	public static boolean checkIfDraw(){
		for(int i=0;i<ticTacToe.length;i++){
			for(int j=0;j<ticTacToe.length;j++){
				if(ticTacToe[i][j]=='*'){
					return false;
				}
			}
		}
		return true;
	}
	/*public static int checkIfWon(int row, int col, int dir){
		if(row <0 || col < 0 || row >= ticTacToe.length || col >=ticTacToe.length || ticTacToe[row][col]!=currentPlayer){
			return 0;
		}
		int result =0;
		
		char temp = ticTacToe[row][col];
		ticTacToe[row][col]='V';
		if(dir==HO){
			result=1+ checkIfWon(row, col+1, dir);
		}
		else if(dir==VE){
			result = 1+checkIfWon(row+1, col, dir);
		}
		else if(dir==CR){
			result = 1+checkIfWon(row+1, col+1, dir);
		}
		else if(dir ==RC){
			result=1+ checkIfWon(row+1, col-1, dir)+checkIfWon(row-1, col+1, dir);
		}
		
		ticTacToe[row][col]=temp;
		return result;
	}
	public static boolean isWon(int row, int col){
		return(checkIfWon(row, 0, HO)==3 ||
				checkIfWon(0, col, VE)==3 ||
				checkIfWon(0, 0, CR)==3 ||
				checkIfWon(row, col, RC)==3);
	}*/
	
	//check if won
	public static boolean checkifwon(int row, int col){
		
		//row check
		for(int j=0;j<3;j++){
			if(ticTacToe[row][j]==currentPlayer){
				isWon=true;
			}else{
				isWon=false;
				break;
			}
		}
		
		//col check
		if(!isWon){
			for(int i=0;i<3;i++){
				if(ticTacToe[i][col]==currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		
		//Dia check
		if(!isWon){
			for(int i=0;i<3;i++){
				if(ticTacToe[i][i]==currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		
		
		//cross dia
		if(!isWon){
			for(int i=0,j=ticTacToe.length -1;i<ticTacToe.length && j>=0;i++,j--){
				if(ticTacToe[i][j]==currentPlayer){
					isWon=true;
				}else{
					isWon=false;
					break;
				}
			}
		}
		return isWon;
	}
	
	public static boolean checkifDraw(){
		for(int i=0;i<ticTacToe.length;i++){
			for(int j=0;j<ticTacToe.length;j++){
				if(ticTacToe[i][j]=='*'){
					isDraw=false;
					return false;
				}
			}
		}
		isDraw=true;
		return true;
	}
	public static void makeMove(int row, int col){
		
		ticTacToe[row][col]=currentPlayer;
		if(checkifwon(row, col)){
			isWon=true;
		}
		else if(checkIfDraw()){
			isDraw=true;
		}
		if(!isDraw && !isWon){
			changePlayer();
		}
		printBoard();
	}
	public static void main(String[] args) {
		TicTac ticTac = new TicTac();
		int row,col=0;
		int changeCounter =0;
		while(!isDraw && !isWon){
			//if(changeCounter%2==0){
				Scanner sc = new Scanner(System.in);
				String[] input=sc.nextLine().split(" ");
				if(input.length ==2){
				row=Integer.valueOf(input[0]);
				col=Integer.valueOf(input[1]);
					if(!validate(row, col)){
						makeMove(row, col);
						changeCounter++;
					}
				}else{
					System.out.println("provide two numbers");
				}
			/*}
			else{
				Random r = new Random();
				 col=r.nextInt(3);
				row = r.nextInt(3);
				System.out.println(row+" "+col);
				if(!validate(row, col)){
					makeMove(row, col);
					changeCounter++;
				}
				
			}*/

		}
		System.out.println(isWon? "Match is won by "+currentPlayer : "Match is draw");
	}
}
