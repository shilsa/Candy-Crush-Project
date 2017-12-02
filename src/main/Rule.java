package main;


import java.util.Random;

import javax.swing.JPanel;

import java.lang.Math;

public class Rule extends DrawBoard {
	static int a = 0;
	static int b = 0;
	static int value = 0;
	static int temp = 0;
	
	Random random = new Random();
	

	
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
	public void checkRow(int y, int x) {
		int value = java.lang.Math.abs(candyBoard[y][x]);
		int k = 0;
		int temp = 0;
		for (int i = 0; i < col; i++) {
			if (value != java.lang.Math.abs(candyBoard[y][i]) && temp >= 3) {
				k++;
				break;
			}
			else if (value == java.lang.Math.abs(candyBoard[y][i])) {
				if (i < x) {
					x = i;
				}
				temp++;
				k = 0;
			}
			else if (value != java.lang.Math.abs(candyBoard[y][i]) && temp < 3) {
				k++;
				temp = 0;
				continue;
			}
			else if (value == java.lang.Math.abs(candyBoard[y][i]) &&  temp >= 3 && k == 0) {
				temp++;
				continue;
			}
			else {
				temp = 0;
				k++;
				}
			}
		
		if (temp >= 3) {
			System.out.println("FOUND");
			this.minusRow(y, x, temp);
		}
	}
	
	public void minusRow(int y, int x, int temp) {
		for (int i = 0; i < temp; i++) {
			System.out.println("HAS MINUS ROW");
			candyBoard[y][i + x] = myMinus(candyBoard[y][i + x]);
		}
	}
	
	public int myMinus(int x) {
		if (x > 0) {
			return -x;
		}
		else {
			return x;
		}
	}
	
	public void checkCol(int y, int x) {
		int value = java.lang.Math.abs(candyBoard[y][x]);
		int k = 0;
		int temp = 0;
		for (int i = 0; i < row; i++) {
			if (value != java.lang.Math.abs(candyBoard[i][x]) && temp >= 3) {
				k++;
				break;
			}
			else if (value == java.lang.Math.abs(candyBoard[i][x])) {
				if (i < y) {
					y = i;
				}
				temp++;
				k = 0;
				continue;
			}
			else if (value != java.lang.Math.abs(candyBoard[i][x]) && temp < 3) {
				k++;
				temp = 0;
				continue;
			}
			else if (value == java.lang.Math.abs(candyBoard[i][x]) && temp >= 3 && k == 0) {
				temp++;
				continue;
			}
			else {
				temp = 0;
				k++;
				continue;
			}
		}
		if (temp >= 3) {
			System.out.println("FOUND");
			this.minusCol(y, x, temp);
		}
	}
	public void minusCol(int y, int x, int temp) {
		for (int i = 0; i < temp; i++) {
			System.out.println("HAD MINUS COL");
			candyBoard[y + i][x] = myMinus(candyBoard[y + i][x]);
		}
	}
	
	public void update() {
		for (int i = row - 1; i >= 0; i--) {
			for (int j = 0; j < col; j++) {
				while (candyBoard[i][j] < 0) {
					System.out.println("HAS UPDATE");
					updateCandyBoard(i, j);
		//	candyBoard[i][j] = 5;
				}
			}
		}
	}
	
	public void updateCandyBoard(int i, int j) {
		while (i > 0) {
			
			candyBoard[i][j] = candyBoard[i - 1][j];
			i--;
		}
		candyBoard[0][j] = random.nextInt(5) + 1;
	}
	public boolean check() {
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				checkRow(i, j);
				checkCol(i, j);
			}
		}
		
			
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{	
				if (candyBoard[i][j] < 0)
					return true;
			}
		}	
	return false;
	}
	
	public void set() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				candyBoard[i][j] = 1;
			}
		}
	}
	
	public void attach() {	
	//	repaint();
//		System.out.println("AHIHI");
	//	System.out.println(super.mouseClicked);
//		if (mouseClicked == 0) {
	//		value = candyBoard[mouseY][mouseX];
//			b = mouseY;
	//		a = mouseX;
/*			System.out.println("AHIHI " +  value);
		}
		else if (mouseClicked == 1) {
			System.out.println("AHIHI " + candyBoard[mouseY][mouseX]);
			candyBoard[b][a] =  getCandyBoard(mouseY, mouseX);
			candyBoard[mouseY][mouseX] = value;
		}
		System.out.println("AHIHI " +  value);
		candyBoard[mouseY][mouseX] = value;
//		super.paintComponent(null);*/
//		while (check() == true) update();
		repaint();
	}
}
