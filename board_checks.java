public class board_checks {
	private static String[][] boar;
	public board_checks(String[][] a) {
		boar = a;
	}
	
	
	
	public boolean fullCheck(){
		boolean check = false;
		if(checkStraight() || checkVertical() || checkDiagonal()) {
			check = true;
		}
		return check;
		
	}
	
	public boolean drawCheck() {
		int count = 0;
		boolean check = false;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++) {
				if(boar[i][j].equals("O")|| boar[i][j].equals("X")) {
					count++;
				}
			}
		}
		if(count == 42) {
			return true;
		}
		return false;
	}
	

	public boolean checkStraight() {
		boolean check = false;
		for(int i = 5; i >=0; i--) {
			if(boar[i][3].equals("X") || boar[i][3].equals("O")) {
				if(boar[i][3].equals(boar[i][2]) && boar[i][2].equals(boar[i][1]) && boar[i][1].equals(boar[i][0])) {
					check = true;
				}	
				if(boar[i][3].equals(boar[i][4]) && boar[i][4].equals(boar[i][5]) && boar[i][5].equals(boar[i][6])) {
					check = true;
				}
			}
		}
		return check;
	}
	
	public boolean checkVertical() {
		boolean check = false;
		for(int row = 5; row >= 3; row--) {
			for(int column = 6; column >= 0; column--) {
				if(boar[row][column].equals("O")|| boar[row][column].equals("X")) {
					if(boar[row][column].equals(boar[row-1][column]) && boar[row-1][column].equals(boar[row-2][column]) && boar[row-2][column].equals(boar[row-3][column])) {
						check = true;
					}
					
					
				}
			}
		}
		return check;
		
	}
	public boolean checkDiagonal() {
	    boolean check = false;
	    for(int row=0;row<3;row++) {
	    	for(int column = 0; column < 4; column++) {
	    		if(boar[row][column].equals("O")|| boar[row][column].equals("X")) {
	    			if(boar[row][column].equals(boar[row+1][column+1]) && boar[row+2][column+2].equals(boar[row+2][column+2]) && boar[row+2][column+2].equals(boar[row+3][column+3])) {
						check = true;
					}
	    		}
	    	}
	    }
	   
	    for(int row=0;row<3;row++) {
	    	for(int column = 6; column > 2; column--) {
	    		if(boar[row][column].equals("O")|| boar[row][column].equals("X")) {
	    			if(boar[row][column].equals(boar[row+1][column-1]) && boar[row+1][column-1].equals(boar[row+2][column-2]) && boar[row+2][column-2].equals(boar[row+3][column-3])) {
						check = true;
					}
	    		}
	    	}
	    	
	    }
	    return check;
	  
	}
	
	
}

