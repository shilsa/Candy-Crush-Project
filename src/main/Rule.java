package main;


import java.util.Random;

import javax.swing.JPanel;

import java.lang.Math;

public class Rule extends DrawBoard {
	final private int row = 5;
	final private int col = 5;
	final private int num = 3;
	
	Random random = new Random();
	
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
	public int getNum() {
		return num;
	}
/*	public int[][] candyBoard =  new int[row][col];
	public Rule() {

	}
	
	public void setRule()
	{
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {				
				candyBoard[i][j] = random.nextInt(5) + 0;
				while ((candyBoard[i][j] == candyBoard[i][j - 1] && candyBoard[i][j] == candyBoard[i][j - 2]) ||
						(candyBoard[i][j] == candyBoard[i - 1][j] && candyBoard[i][j] == candyBoard[i - 2][j])) {
					candyBoard[i][j] = random.nextInt(5) + 0;
				}
			}
		}
	}
	
	*/
	private int rand(int min, int max) {
		try {
			Random rn = new Random();
			int range = max - min + 1;
			int randomNum = min + rn.nextInt(range);
			return randomNum;
		}
		catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	public void checkRow(int y, int x) {
		final int value = java.lang.Math.abs(candyBoard[y][x]);
		int k = 0;
		int temp = 0;
		for (int i = col - 1; i >= 0; i--) {
			if (value != java.lang.Math.abs(candyBoard[y][i]) && temp >= 3) {
				break;
			}
			else if (value == java.lang.Math.abs(candyBoard[y][i])) {
				if (i < x) {
					x = i;
					temp++;
					k = 0;
				}
			}
			else if (temp >= 3 && k == 0) {
				continue;
			}
			else {
				temp = 0;
				k++;
				}
			}
		
		if (temp >= 3) {
			minusRow(y, x, temp);
		}
	}
	
	public void minusRow(int y, int x, int temp) {
		for (int i = 0; i < temp; i++) {
			candyBoard[y][i + x] = myMinus(candyBoard[y][i + x]);
		}
	}
	
	public int myMinus(int x) {
		return x > 0 ? - x : x;
	}
	
/*	public void checkCol(int y, int x) {
		final int value = java.lang.Math.abs(candyBoard[y][x]);
		int k = 0;
		int temp = 0;
		for (int i = row - 1; i >= 0; i--) {
			
		}
	}*/
}