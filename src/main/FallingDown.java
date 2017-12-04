package main;

public class FallingDown extends DrawBoard {
	public static int Temp[] = new int[col];
	public static int candyStatus[][] = new int[row][col];
	public FallingDown() {
		this.setTemp();
		this.setUpCandyStatus();
		for (int i = row - 1; i >- 0; i--) {
			for (int j = 0; j < col; j++) {
				if (candyBoard[i][j] < 0) {
					candyStatus[i][j] = -1;
					int temp = 0;
					for (int k = i; k >= 0; k--) {
						if (candyBoard[k][j] < 0) temp++;
						if (Temp[i] < temp) Temp[i] = temp;
					}
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
		for (int i = row - 1; i >= 0; i++) {
			for (int j = 0; j < col; j++) {
				if (candyStatus[i][j] == -1);
				else if (candyBoard[i][j] < 0) {
					candyStatus[i][j] = -1;
					for (int k = i; k >= 0; i--) {
						if (candyStatus[k][j] == -1);
						else if (candyBoard[k][j] < 0);
						else candyStatus[k][j] = space * Temp[j];
					}
				}
			}
		}
	}
}
