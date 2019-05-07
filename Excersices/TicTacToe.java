package excersices;

public class TicTacToe {

	public static void main(String[] args) {
		
		String[][] tictactoe = new String [3][3];
		//String player = "X";
		boolean flag = false;
		
		tictactoe[0][0] = "X";
		tictactoe[0][1] = "O";
		tictactoe[0][2] = "O";
		tictactoe[1][0] = "O";
		tictactoe[1][1] = "X";
		tictactoe[1][2] = "X";
		tictactoe[2][0] = "X";
		tictactoe[2][1] = "O";
		tictactoe[2][2] = "O";
		
		TicTacToe winner = new TicTacToe();
		
		flag = winner.checkRow(tictactoe, "X");
		
		if (!flag)
			flag = winner.checkColumn(tictactoe, "X");
		else{ 
			System.out.println("Player X won 1");
			System.exit(0);
		}
			
		if (!flag)
			flag = winner.checkDiagonal(tictactoe, "X");
		else{
			System.out.println("Player X won 2");
			System.exit(0);
		}
			
		if (!flag)
			flag = winner.checkRow(tictactoe, "O");
		else{
			System.out.println("Player X won 3");
			System.exit(0);
		}
		
		if (!flag)
			flag = winner.checkColumn(tictactoe, "O");
		else{
			System.out.println("Player O won 4");
			System.exit(0);
		}
		
		if (!flag)
			flag = winner.checkDiagonal(tictactoe, "O");
		else{
			System.out.println("Player O won 5");	
			System.exit(0);
		}
		
		if (!flag)
			System.out.println("It is a draw");
		else{
			System.out.println("Player O won 6");	
			System.exit(0);
		}
	}
	
	public boolean checkRow(String[][] tictactoe, String player) {
		
		if (tictactoe[0][0].equals(player) && tictactoe[0][1].equals(player) && tictactoe[0][2].equals(player))
			return true;
		else if (tictactoe[1][0].equals(player) && tictactoe[1][1].equals(player) && tictactoe[1][2].equals(player))
			return true;
		else if (tictactoe[2][0].equals(player) && tictactoe[2][1].equals(player) && tictactoe[2][2].equals(player))
			return true;
		else
			return false;
	}
	
	public boolean checkColumn(String[][] tictactoe, String player) {
		
		if (tictactoe[0][0].equals(player) && tictactoe[1][0].equals(player) && tictactoe[2][0].equals(player))
			return true;
		else if (tictactoe[0][1].equals(player) && tictactoe[1][1].equals(player) && tictactoe[2][1].equals(player))
			return true;
		else if (tictactoe[0][2].equals(player) && tictactoe[1][2].equals(player) && tictactoe[2][2].equals(player))
			return true;
		else
			return false;
	}
	
	public boolean checkDiagonal(String[][] tictactoe, String player) {
		
		if (tictactoe[0][0].equals(player) && tictactoe[1][1].equals(player) && tictactoe[2][2].equals(player))
			return true;
		else if (tictactoe[0][2].equals(player) && tictactoe[1][1].equals(player) && tictactoe[2][0].equals(player))
			return true;
		else
			return false;
		
	}

}
