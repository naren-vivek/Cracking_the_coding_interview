package Helper;

import java.util.Scanner;

public class TicTacToeBoard {

	public static char[][] board;
	public static char currentPlayer;
	public static boolean isWon=false;
	public static boolean isDraw=false;
	
	public TicTacToeBoard() {
		// TODO Auto-generated constructor stub
		 board = new char[3][3];
		 currentPlayer='x';
		 intializeBoard();
	}
	
	public static void intializeBoard(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				board[i][j]=' ';
			}
		}
	}
	
	public void printBoard(){
		
		System.out.println("----------------------");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
	}
	
	public void MakeMove(int row, int col){
		if(board[row][col]==' '){
			board[row][col]=currentPlayer;
			currentPlayer= getNextPlayer();
		}
		else{
			System.out.println("wrong move, please make a right one");
		}
	}
	
	public boolean checkIfSomeOneWon(){
	
		//Check for row equals
		for(int i=0;i<3;i++){
			if(board[i][0] == board[i][1] && board[i][1]== board[i][2] && board[i][0]!=' '){
				System.out.println(getNextPlayer()+" has won the match by crossing row: "+i);
				 isWon=true;
				 return true;
			}
		}
		
		//check for colum equals
		for(int j=0;j<3;j++){
			if(board[0][j] == board[1][j] && board[1][j]== board[2][j] && board[0][j]!=' '){
				System.out.println(getNextPlayer()+" has won the match by crossing column: "+j);
				 isWon=true;
				 return true;
			}
		}
		
		//Check if Diagonal is equals
		if(board[0][0] == board[1][1] && board[1][1]==board[2][2] && board[0][0]!=' '){
			System.out.println(getNextPlayer()+" has won the match by crossing diagonal: ");
			isWon=true;
			 return true;
		}
		
		if(board[2][0] == board[1][1] && board[1][1]==board[0][2] && board[2][0]!=' '){
			System.out.println(getNextPlayer()+" has won the match by crossing diagonal: ");
			isWon=true;
			 return true;
		}
		return false;
	}
	
	public boolean checkIfMatchIsDraw(){
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(board[i][j] ==' '){
					return false;
				}
			}
		}
		System.out.println("Match is draw");
		isDraw=true;
		return true;
	}
	
	public static char getNextPlayer(){
		if(currentPlayer == 'o'){
			return 'x';
		}
			return'o';
	}
	public static void main(String[] args) {
		TicTacToeBoard tb = new TicTacToeBoard();
		tb.printBoard();
		while(!isWon && !isDraw){
			
			//Read from user to play
			Scanner sc = new Scanner(System.in);
			String inputNum=sc.nextLine();
			String[] inputStr = inputNum.split(" ");
			int row = Integer.valueOf(inputStr[0]);
			int col= Integer.valueOf(inputStr[1]);
			
			//Automatic play by System
//			Random rn = new Random();
//			int row=rn.nextInt(3);
//			int col=rn.nextInt(3);
			
			System.out.println("row: "+row+" col: "+col);
			//MakeMove
			tb.MakeMove(row, col);
			if(tb.checkIfSomeOneWon()){
				tb.printBoard();
				break;
			}
			tb.checkIfMatchIsDraw();
			tb.printBoard();
		}
	}
}
