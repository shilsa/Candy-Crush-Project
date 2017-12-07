package main;

public class FallingDown extends DrawBoard {
	public static int Temp[] = new int[col];
	public static int candyStatus[][] = new int[row][col];
	public FallingDown() {
		this.setTemp();
		this.setUpCandyStatus();
		for (int j = 0; j < col; j++) {
			int temp = 0;
			for (int i = row - 1; i >= 0; i--) {
				if (candyBoard[i][j] < 0) {
					temp++;
					candyStatus[i][j] = -1;
				}
				else if (candyBoard[i][j] > 0 && temp == 0);
				else if (candyBoard[i][j] > 0 && temp > 0) {
					candyStatus[i][j] = temp * space;
				}

			}
			
		}
		
		
	}
	public void setTemp() {
		for (int i = 0; i < col; i++) Temp[i] = 0;
	}
	public void setUpCandyStatus() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				candyStatus[i][j] = -2;
			}
		}
	}
	public void setCandyStatus() {
/*		for (int i = row - 1; i >= 0; i--) {
			for (int j = 0; j < col; j++) {
				if (candyStatus[i][j] == -1) {
					for (int k = i; k >= 0; k--) {
						if (candyStatus[k][j] == -1);
						else if (candyBoard[k][j] < 0);
						else candyStatus[k][j] = space * Temp[j];
					}
				}
			}
		}*/
	}
	public int maxCandyStatus() {
		int temp = -2;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (temp < candyStatus[i][j]) temp = candyStatus[i][j];
			}
		}
		return temp;
	}
	public boolean checkCandyStatus() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (temp3[i][j] < maxCandyStatus()) return false;
			}
		}
		return true;
	}
	public boolean check2() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (candyStatus[i][j] > 0) return false;
			}
		}
		return true;
	}
}
