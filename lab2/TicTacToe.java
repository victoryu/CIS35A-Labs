import java.util.Scanner;

public class TicTacToe{
	
	public static void main(String[] args) {
	
	}
	
	private char[][] board;
	private char player; // 'X' or 'O'
	
	/* 
	 * Instantiate board to be a 3 by 3 char array of spaces.
	 * Set player to be 'X'.
	 */
	public TicTacToe() {
		/*
		* Step 1: create an empty board, with an initial value
		* of a space (' ')
		*/
	}
	
	/* 
	 * If s represents a valid move, add the current player's symbol to the board and return true.
	 * Otherwise return false.
	 */
	public boolean play(String s) {
		/* Step 2: Fill in here with your own
		* play logic, and replace the return with you
		* own.
		*/ 
		return false; 
	}
	
	/*
	 * Switches the current player from X to O, or O to X.
	 */
	public void switchTurn() {
		// Step 3: Fill in with your code to toggle between
		// 'X' and 'O'
	}
	
	/*
	 * Returns true if the current player has won the game.
	 * Three in a row, column or either diagonal.
	 * Otherwise, return false.
	 */
	public boolean won() {
		/* Step 5: Fill in the code for the won method. This method
        * should return true if the current player has 3 in-a-row 
		* in any row, column or diagonal. Otherwise, return false.
		*/
		return false; // TODO: replace with your own return statement.
	}
	
	/*
	 * Returns true if there are no places left to move
	 */
	public boolean stalemate() {
	    /*
		 * Step 4: Fill in the code for the stalemate method. It
         * should return true if there are no more places to move 
		 * on the board. Otherwise, return false return false; 
		 */
		 return true;   // replace with your own return 
	}
	public char getPlayer() {
		return player;
	}
	public void print() {
		System.out.println();
		System.out.println("\t  1 2 3");
		System.out.println();
		System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
		System.out.println("\t  -----");
		System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
		System.out.println("\t  "+"-----");
		System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
		System.out.println();
	}
	
	/* 
	 * Step 6: Main Method for Final Step - Delete your main method 
	 * and uncomment this one. 
	 * Runs the game by getting input from the user, making the 
	 * appropriate moves, and prints who won or if it was a stalemate. 
	*/ 
	/*
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		System.out.println("Welcome to tic-tac-toe");
		System.out.println("Enter coordinates for your move following the X and O prompts");
		
		while(!game.stalemate()) {
			//Print the game
			
			
			//Prompt player for their move
			
			
			//Loop while the method play does not return true when given their move.
			//Body of loop should ask for a different move

						
			//If the game is won, call break; 
			
						
			//Switch the turn
			
		}
		game.print();
		if(game.won()){
			System.out.println("Player "+game.getPlayer()+" Wins!!!!");
		} else {
			System.out.println("Stalemate");
		}
	} */
	
}
