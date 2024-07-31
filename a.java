import java.util.Scanner;
public class a {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		board newGame = new board();
		

		int playerTurn = 0;
		while(newGame.gameState() == true) {
			newGame.showBoard();
			System.out.println(" ");
			if(playerTurn%2 ==0) {
				System.out.println("Player One's Turn");
	
			}else {
				System.out.println("Player Two's Turn");
	
			}
			
			
			
			
			
			newGame.turn(playerTurn);
				
			
			
			
			
			
			board_checks newCheck = new board_checks(newGame.getBoard());
			if(newCheck.fullCheck()) {
				newGame.changeState();
				if(playerTurn % 2 ==0 ) {
					System.out.println("Player One has won");
					newGame.showBoard();
				}else {
					System.out.println("Player Two has won");
					newGame.showBoard();
				}
				break;
			}else if (newCheck.drawCheck()) {
				newGame.changeState();
				System.out.println("The game has ended in a draw");
			}
			
			playerTurn++;
			
		}
	}
}
