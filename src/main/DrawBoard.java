package main;

import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawBoard extends JPanel{
	int candySpeed = 10;
	int candySpeed2 =10;
	static int i = 0, j = 0, t = 0, m = 0;
	static final protected int row = 12;
	static final protected int col = 8;
	static protected int  mouseClicked = -1;
	static protected int mouseX = 0;
	static protected int mouseY = 0;
    ImageIcon BG = new ImageIcon("BG1.png");
	ImageIcon tittle = new ImageIcon("TImg.png");
	private ImageIcon Candy;
	private ImageIcon candy;
	private int X = 60;
	private int Y = 165;
	private int MovingY = 815;
	private static int CandyNumber = row * col;
	public static int[][] candyBoard = new int[row][col];
	int space = 100;
	int CandyMovingX = X;
	int CandyMovingY = MovingY;
	static int a = 0;
	static int b = 0;
	static int value = 0;
	static int temp = 0;
	static double A = a;
	static double B = b;
	static double MouseX = mouseX;
	static double MouseY = mouseY;
	static int temp3[][] = new int[row][col];
	static int time = 0;
	// create random variable for the string name
	Random random = new Random();
	public void setTemp3() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				temp3[i][j] = 0;
			}
		}
	}
	// declare string name
	List<String> Gemname = new ArrayList<String>();
	DrawBoard(){
		addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		//    	Rule rule = new Rule();
			//	while (rule.check() == true) rule.update();
		    	mouseClicked++;
		    	mouseX = (e.getX() - X) / 100;
		    	mouseY = (e.getY() - Y) / 100 + row / 2;
		    	
		    	if (mouseClicked % 2 == 0) mouseClicked = 0;
		    	else mouseClicked = 1;
		    	System.out.println("MOUSE CLICKED " + mouseClicked );
		    	System.out.println(candyBoard[mouseY][mouseX]);
		    	
				if (mouseClicked == 0) {
					value = candyBoard[mouseY][mouseX];
					b = mouseY;
					a = mouseX;
					System.out.println("AHIHI " +  value);
				}
				else if (mouseClicked == 1) {
					System.out.println("AHIHI " + candyBoard[mouseY][mouseX]);
					candyBoard[b][a] =  getCandyBoard(mouseY, mouseX);
					candyBoard[mouseY][mouseX] = value;
				}
		//		Rule rule = new Rule();
	//			while (rule.check() == true) rule.update();
		    }
		});
	}
	
	public int getCandyBoard(int i, int j) {
		return candyBoard[i][j];
	}
	public void setCandyBoard(int i, int j, int value) {
		candyBoard[i][j] = value;
	}
	
	// input gems name
	public void Gemsname(){
		String gem1 = new String("Gblue");
		String gem2 = new String("Gdiamond");
		String gem3 = new String("Ggreen");
		String gem4 = new String("Gred");
		String gem5 = new String("Gyellow");
		String png = new String(".png");
		String br = new String("Brighter");
		Gemname.add(gem1 + png);
		Gemname.add(gem2 + png);
		Gemname.add(gem3 + png);
		Gemname.add(gem4 + png);
		Gemname.add(gem5 + png);
		Gemname.add(gem1+br+png);
		Gemname.add(gem2+br+png);
		Gemname.add(gem3+br+png);
		Gemname.add(gem4+br+png);
		Gemname.add(gem5+br+png);
		System.out.println("Hello");
	}
	// Assign BlockLocation to an array
	void BlockLocation(){	
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				int rand = random.nextInt(5) + 1;
				candyBoard[i][j] = rand;
	//			while ((candyBoard[i][j] == candyBoard[i][j - 1] && candyBoard[i][j] == candyBoard[i][j - 2]) ||
		//				(candyBoard[i][j] == candyBoard[i - 1][j] && candyBoard[i][j] == candyBoard[i - 2][j])) {
			//		candyBoard[i][j] = random.nextInt(5) + 0;
	//		}
		}
	}
		
	}
	// Make the Candy moving transition at first

	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Rule rule = new Rule();
/*		while (rule.check()) {
			rule.update();
		};*/
//		if(rule.check());

		int CandyX = X;
		int CandyY = Y;
		int borderLocationX = 45;
		int borderLocationY = 150;
		int ttx = 270;
		int tty = 20;
		Gemsname();
		// draw BG
		BG.paintIcon(this, g, 0, 0);
		//draw TITTLE
		tittle.paintIcon(this, g, ttx, tty);
		//draw GRID
		for(int counter = row / 2; counter<row;counter++){
			for(int i = 0; i < col; i++){
		g.setColor(Color.WHITE);
		g.drawRect(borderLocationX, borderLocationY, 100, 100);
		g.drawRect(borderLocationX+1, borderLocationY+1, 100, 100);
		borderLocationX = borderLocationX + space;
		}
			borderLocationX = 45;
			borderLocationY = borderLocationY + space;
		}
	
		// draw the Candy
		if (i == row - 1 && j == col - 1) Animation(g);
		else {
			CandyMoving(g);
			CandyPrinting(g);
			System.out.println("I = " + i + " J = " + j );
		}
//		if (mouseClicked == 1) fallingDown(g);
		repaint();
	}

	

	void CandyMoving(Graphics p){
		super.paintComponents(p);
		int CandyX = X;
		int CandyY = Y;
		int CandyYSpeed = 40;
		if (i < row){
		Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[i][j]-1)).toString());
		Candy.paintIcon(this, p, (CandyMovingX + (j*space)), CandyMovingY);
		CandyMovingY = CandyMovingY - CandyYSpeed;
		}
		if(t < CandyNumber){
		//	if(CandyMovingY != Y){
	//			try {
//					Thread.sleep(1);
//					repaint();
	//			} catch (InterruptedException e) {
	//				e.printStackTrace();
		//		}
	//		}
			if(CandyMovingY <= (Y + (i*space))){
				CandyMovingY = MovingY;
				t++;
				j++;
			
				if(((t % col ) == 0) && (t != 0)){
					if(t != CandyNumber) j = 0;
					if (j == col) j--;
					i++;
					if(i == row){
						i--;
					}
				//System.out.println(i);
			}
	//		repaint();
		}
	}
		
//		repaint
			
	}
	public void CandyPrinting(Graphics g) {
		int CandyX = X;
		int CandyY = Y;
		for (int i = row / 2; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(candyBoard[i][j] + " ");
			}
			System.out.println();
		}
		for(int k = 0; k <= i; k++ ){
			for(int l = 0; l < col; l++){
		//		Candy = new ImageIcon(Gemname.get(candyBoard[k][l]-1).toString());
				Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[k][l]-1)).toString());
				if (l < j) {
					Candy.paintIcon(this, g, CandyX, CandyY);
				}
				else if (l == j) {
					if (i - k >= 1) Candy.paintIcon(this, g, CandyX, CandyY);
					else if (CandyMovingY <= Y) Candy.paintIcon(this, g, CandyX, CandyY);
					m = 0;
				}
				else if (l > j) {
					if (i - k >= 1) Candy.paintIcon(this, g, CandyX, CandyY);
				}
				
				else continue;
				
				CandyX = CandyX + space;
				
			}
		//	if (k == i) Candy.paintIcon(this, g, CandyX, CandyY);
			CandyX = X;
			CandyY = CandyY + space;
		}
	}
	

	
	public void Animation(Graphics g) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FallingDown fallingDown = new FallingDown();
		if (fallingDown.checkCandyStatus() == true) {
			fallingDown = new FallingDown();
	//		System.out.println("TIME " + time);
			time += 1;
			fallingDown.setCandyStatus();
		}
	
		Rule rule = new Rule();
		int CandyX = X;
		int CandyY = Y - space * (row / 2);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(candyBoard[i][j] + " ");
				Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[i][j]-1)).toString());
				if (mouseClicked < 1) {	
				if (i == mouseY && j == mouseX) {
					candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[i][j]-1 + 5)).toString());
					candy.paintIcon(this, g, CandyX, CandyY);
				}
					
				else if (CandyY >= Y)	Candy.paintIcon(this, g, CandyX, CandyY);
					CandyX += space;
					candySpeed = 0;
					candySpeed2 = 0;
			if (rule.check())		rule.update();
					setTemp3();
				}
				else {
					
					if(rule.check()) ;
					
					if (i == mouseY && j == mouseX) CandyX += space ;
					else if ((i == b)  && (j == a)) CandyX += space;
					else if (fallingDown.candyStatus[i][j] == -1) CandyX += space;
					else if (fallingDown.candyStatus[i][j] == -2) {
		if (CandyY >= Y)				Candy.paintIcon(this, g, CandyX, CandyY);
						CandyX += space;
					}
					
					else if (fallingDown.candyStatus[i][j] > 0) {
						if (temp3[i][j] < fallingDown.candyStatus[i][j]){
				/*		if (!fallingDown.checkCandyStatus()) */{
						Candy.paintIcon(this, g, CandyX, CandyY + temp3[i][j]);
							CandyX += space;
							temp3[i][j] += 5;
			//				System.out.println("TEMP3  " + temp3[i][j] );
							for (int a = 0; a < row; a++) {
								for (int b = 0; b < col; b++) {
									if (fallingDown.check2()) {
				//						if (rule.check()) rule.update();
									}
									if (temp3[a][b] >= fallingDown.maxCandyStatus()) {
					//					System.out.println("HAS UPDATED");
										if (rule.check()) rule.update();
									}
										
								}
							}
						}
						}
					}
				
						A = a;
						B = b;
						MouseX = mouseX;
						MouseY = mouseY;	
						if (A == mouseX) {
							if (java.lang.Math.abs(candySpeed) != 100) {
								Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[mouseY][mouseX] - 1)).toString());
								Candy.paintIcon(this, g,X + (int) A * space,Y + (int) B * space + (int)candySpeed - space * (row /2));
								if (Y + B * space + (int)candySpeed < Y + MouseY * space) candySpeed += 1;
								else candySpeed -= 1;
							}
							else if (java.lang.Math.abs(candySpeed) == 100) {
								Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[mouseY][mouseX] - 1)).toString());
//					if (rule.check()) {
						if (candyBoard[mouseY][mouseX] > 0) {
							Candy.paintIcon(this, g,X + (int) A * space,Y + (int) B * space + (int)candySpeed - space * (row / 2));
	//					}
					}
				//				rule.update();
							}
							if (java.lang.Math.abs(candySpeed2) != 100) {
								Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[(int)B][(int)A] - 1)).toString());
							Candy.paintIcon(this, g,X + (int) MouseX * space,Y + (int) MouseY * space + (int)candySpeed2 - space * (row / 2));
							if (Y + MouseY * space + (int)candySpeed2 < Y + B * space) candySpeed2 += 1;
							else candySpeed2 -= 1;
						}
						else if (java.lang.Math.abs(candySpeed2) == 100) {
							Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[(int)B][(int)A] - 1)).toString());
					//		if (rule.check()) {
								if (candyBoard[(int)B][(int)A] > 0) {
									Candy.paintIcon(this, g,X + (int) MouseX * space,Y + (int) MouseY * space + (int)candySpeed2 - space * (row / 2));
						//		}
							}
							
					//		rule.update();
						}
					}
					
						else if (B == mouseY) {
					if (java.lang.Math.abs(candySpeed) != 100) {
						Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[mouseY][mouseX] - 1)).toString());
						Candy.paintIcon(this, g,X + (int) A * space + (int)candySpeed,Y + (int) B * space - space * (row / 2));
						if (Y + A * space + (int)candySpeed < Y + MouseX * space) candySpeed += 1;
						else candySpeed -= 1;
					}
					else if (java.lang.Math.abs(candySpeed) == 100) {
						Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[mouseY][mouseX] - 1)).toString());
//						if (rule.check()) {
							if (candyBoard[mouseY][mouseX] > 0) {
								Candy.paintIcon(this, g,X + (int) A * space + (int)candySpeed,Y + (int) B * space - space * (row / 2));
	//						}
						}
				
					//	Thread.sleep(1000);
					}
					if (java.lang.Math.abs(candySpeed2) != 100) {
						Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[(int)B][(int)A] - 1)).toString());
						Candy.paintIcon(this, g,X + (int) MouseX * space + (int)candySpeed2,Y + (int) MouseY * space - space * (row / 2));
						if (Y + MouseX * space + (int)candySpeed2 < Y + A * space) candySpeed2 += 1;
						else candySpeed2 -= 1;
					}
					else if (java.lang.Math.abs(candySpeed2) == 100) {
						Candy = new ImageIcon(Gemname.get(java.lang.Math.abs(candyBoard[(int)B][(int)A] - 1)).toString());
		//				if (rule.check()) {
							if (candyBoard[(int)B][(int)A] > 0) {
								Candy.paintIcon(this, g,X + (int) MouseX * space +(int)candySpeed2,Y + (int) MouseY * space - space * (row / 2));
			//				}
						}
						
				//		Thread.sleep(1000);
					}
				}
					
				}
		//		fallingDown(g);
			}
			CandyX = X;
			CandyY += space;
			System.out.println();
		}
		
		System.out.println("TEMP3 " + temp3[i][j]);
	//	repaint()
		
		}
	
}