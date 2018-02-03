//Tyler Angelier && Rick Boles

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Angelier_Boles implements ActionListener {
	static TicTacToeAi ai = new TicTacToeAi();
	JFrame window = new JFrame("TicTacToe");
	JButton button1 = new JButton("");
	JButton button2 = new JButton("");
	JButton button3 = new JButton("");
	JButton button4 = new JButton("");
	JButton button5 = new JButton("");
	JButton button6 = new JButton("");
	JButton button7 = new JButton("");
	JButton button8 = new JButton("");
	JButton button9 = new JButton("");
	JButton button10 = new JButton("Single-Player");
	JButton[][] buttons = {{button1,button2,button3},{button4,button5,button6},{button7,button8,button9}};


	String Letters = "";
	int count = 0;
	boolean single = true;
	boolean newgame = true;


	Color blue = new Color(0, 0, 255);
	Color green= new Color(0, 255, 0);
	Color red= new Color(255, 0, 0);
	Color player = new Color(0,0,0);

	public Angelier_Boles() {
		setup();

	}
	public void setup(){
		window.setSize(600, 600);
		window.setVisible(true);
		window.setLayout(new GridLayout(2, 1));
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 3, 5, 5));

		button10.addActionListener(this);
		button10.setFont(new Font("Times New Roman", Font.BOLD, 50));
		button10.setPreferredSize(new Dimension(50, 50));
		window.add(button10);

		for(int i =0; i<3; i++){
			for(int j =0; j<3; j++){
				buttons[i][j].addActionListener(this);
				buttons[i][j].setFont(new Font("Times New Roman", Font.BOLD, 50));
				buttons[i][j].setPreferredSize(new Dimension(50, 50));
				buttonPanel.add(buttons[i][j]);
				}
		}

		window.add(buttonPanel);

	}

	public void actionPerformed(ActionEvent a) {
		newgame = false;
		count++;
		if (single){
			singlePlayerGame(a);
		}
		else{
			multiPlayerGame(a);
		}

	}


	public void multiPlayerGame(ActionEvent a){

		if (count % 2 == 1){
			Letters = "X";
			player = blue;
		}
		else{
			Letters = "O";
			player = red;
		}
		for(int i =0; i<3; i++){
			for(int j =0; j<3; j++){
					if(a.getSource() == buttons[i][j]){
					buttons[i][j].setText(Letters);
					buttons[i][j].setEnabled(false);
					buttons[i][j].setBackground(player);
					ai.gameBoard[i][j] = Letters.charAt(0);
					}
				}
		}

		checkForSwitchGameMode(a);
		winCheck();

	}

	public void singlePlayerGame(ActionEvent a){
		Letters = "X";
		player = blue;

		for(int i =0; i<3; i++){
			for(int j =0; j<3; j++){
					if(a.getSource() == buttons[i][j]){
					buttons[i][j].setText(Letters);
					buttons[i][j].setEnabled(false);
					buttons[i][j].setBackground(player);
					ai.gameBoard[i][j] = Letters.charAt(0);
					}
				}
		}

		checkForSwitchGameMode(a);
		winCheck();

		if(single && !newgame){
			count++;
			Letters = "O";
			player = red;
			int[] move = aiMove();

			buttons[move[0]][move[1]].setText(Letters);
			buttons[move[0]][move[1]].setEnabled(false);
			buttons[move[0]][move[1]].setBackground(player);

			winCheck();


		}


	}
	public void checkForSwitchGameMode(ActionEvent a){
	if (a.getSource() == button10) {
		if(single){
			JOptionPane.showMessageDialog(null,"Switching to Multiplayer");
			button10.setText("Multi-Player");
			single = false;
			newgame = true;
			ai.cleanBoard();
			reset();
		}else{
			JOptionPane.showMessageDialog(null,"Switching to Singleplayer");
			button10.setText("Single-Player");
			ai.cleanBoard();
			single = true;
			newgame = true;
			reset();
		}
	}

}

	public void winCheck(){
	if (ai.checkForWin()) {
		JOptionPane.showMessageDialog(null, Letters + " WINS!");
		ai.cleanBoard();
		newgame=true;
		reset();
	} else if (ai.isTie()) {
		JOptionPane.showMessageDialog(null, "Tie Game!");
		ai.cleanBoard();
		reset();
		newgame=true;
	}
}


	public static int[] aiMove() {
		boolean isPreferred = false;
		int[] preferredMoves = { 1, 1, 0, 0, 0, 2, 2, 0, 2, 2, 0, 1, 1, 0, 1, 2, 2, 1 };
		int[] allMoves =       { 0, 0, 0, 1, 0, 2, 1, 0, 1, 1, 1, 2, 2, 0, 2, 1, 2, 2 };
		int[] temp = new int[2];

		// this checks through the list of preferredMoves
		// while there should be some sort of check to see if the player is
		// about to win, I have not/didn't get to that
		for (int i = 0; i < 18; i += 2) {
			if (ai.makeMove(preferredMoves[i], preferredMoves[i + 1]) == true) {
				ai.makeMove(preferredMoves[i], preferredMoves[i + 1]);
				isPreferred = true;
				//System.out.println("AI ran a preferred move at position: " + preferredMoves[i] + "," + preferredMoves[i + 1]);
				temp[0] = preferredMoves[i];
				temp[1] = preferredMoves[i+1];
				return temp;
			}
		}

		// runs if no preferred moves can be made
		// this just checks every game cell for the closest empty cell and fills
		// it
		if (!isPreferred) {
			// checks every possible slot
			System.out.println("Ran Default Move");
			for (int i = 0; i < 18; i += 2) {
				System.out.println("Ran loop"+ (i/2+1));
				ai.printGameBoard();
				if (ai.makeMove(allMoves[i], allMoves[i + 1]) == true) {
					ai.makeMove(i, i + 1);
					//System.out.println("AI ran a standard move at position: " + allMoves[i] + "," + allMoves[i + 1]);
					temp[0] = allMoves[i];
					temp[1] = allMoves[i+1];
					ai.printGameBoard();
					return temp;
				}

			}

		}
		ai.printGameBoard();
		return temp;
	}
	public  void reset(){
			Letters = "";
			count = 0;
			for(int i =0; i<3; i++){
				for(int j =0; j<3; j++){
					buttons[i][j].setText(Letters);
					buttons[i][j].setEnabled(true);
					buttons[i][j].setBackground(null);
					}
			}

	}
	public static void main(String[] args) {
		new Angelier_Boles();
	}
}
