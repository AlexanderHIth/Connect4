import java.util.Scanner;
public class board {
	private String[][] a;
	private boolean gamestate;
	
	
	
	Scanner input = new Scanner(System.in);
	
	public board() {
		gamestate = true;
		a = new String[6][7];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				a[i][j] = "-";
			}
		}
	}
	public void showBoard() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	public void turn(int i) {
		int y;
		String token = "";
		System.out.println("Put in the column you want to put the token in(1-7)");
		y = input.nextInt();
		if(i%2==0) {
			token = "O";
			
			for(int j = 5; j >= 0; j--) {
				if(a[j][y-1]=="-") {
					a[j][y-1] =  token;
					break;
				}
				
			}
		}else {
			token = "X";
			
		
			for(int j = 5; j >= 0; j--) {
				if(a[j][y-1]=="-") {
					a[j][y-1] =  token;
					break;
				}
			}
		}
		
	}
	public boolean gameState() {
		return gamestate;
	}
	public String[][] getBoard(){
		return a;
	}
	public void changeState() {
		gamestate = false;
	}
}
