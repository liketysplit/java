//Tyler Angelier && Rick Boles

public class TicTacToeAi {

	// variables
	public char[][] gameBoard;
	private char mark;

	public TicTacToeAi() {
		mark = 'O';
		gameBoard = new char[3][3];
		cleanBoard();
	}



	// loop through row + columns to give empty board
	public void cleanBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				gameBoard[i][j] = '-';
			}
		}
	}


	// loop through row + columns to check if any gameBoard spaces are still
	// empty value
	public boolean isTie() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (gameBoard[i][j] == '-')
					return false;
			}
		}
		return true;
	}

	// Places mark at the row col in gameBoard
	// returns false if space is occupied
	public boolean makeMove(int row, int col) {
		// make sure row + col are inbounds
		if ((row >= 0) && (row < 3) && (col >= 0) && (col < 3))
			// checks to see if space is empty
			if (gameBoard[row][col] == '-') {
				gameBoard[row][col] = 'O';
				return true;
			}
		return false;
	}

	// ***********
	// WINNING *
	// ***********

	// this checks the entire board
	public boolean checkForWin() {
		return (rowWin() || columnWin() || diagonalWin());
	}

	// creates the board in console
		public void printGameBoard() {
			System.out.println("-------------");
			for (int i = 0; i < 3; i++) {
				System.out.print("| ");
				for (int j = 0; j < 3; j++) {
					System.out.print(gameBoard[i][j] + " | ");
				}
				System.out.println();
				System.out.println("-------------");
			}
		}

	// checks for three row win possibilities
	public boolean rowWin() {
		if (rcChecker(gameBoard[0][0], gameBoard[0][1], gameBoard[0][2]) == true)
			return true;
		else if (rcChecker(gameBoard[1][0], gameBoard[1][1], gameBoard[1][2]) == true)
			return true;
		else if (rcChecker(gameBoard[2][0], gameBoard[2][1], gameBoard[2][2]) == true)
			return true;
		else
			return false;
	}

	// checks for three column win possibilities
	public boolean columnWin() {
		if (rcChecker(gameBoard[0][0], gameBoard[1][0], gameBoard[2][0]) == true)
			return true;
		else if (rcChecker(gameBoard[0][1], gameBoard[1][1], gameBoard[2][1]) == true)
			return true;
		else if (rcChecker(gameBoard[0][2], gameBoard[1][2], gameBoard[2][2]) == true)
			return true;
		else
			return false;
	}

	// checks for two possible diagonal win possibilities
	public boolean diagonalWin() {
		return ((rcChecker(gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]) == true)
				|| (rcChecker(gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]) == true));
	}

	// checks three specified character slots for win
	public boolean rcChecker(char x, char y, char z) {
		return ((x != '-') && (x == y) && (y == z));
	}

}
