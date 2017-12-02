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

	static final protected int row = 6;
	static final protected int col = 8;
	static protected int  mouseClicked = -1;
	static protected int mouseX = 0;
	static protected int mouseY = 0;
	private ImageIcon BG,Candy;
	private ImageIcon tittle;
	private int X = 61;
	private int Y = 165;
	private static int CandyNumber = 25;
	public static int[][] candyBoard = new int[row][col];
	static int t = 0;
	int space = 100;
	
	
	static int a = 0;
	static int b = 0;
	static int value = 0;
	static int temp = 0;
	

	// create random variable for the string name
	Random random = new Random();
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
		    	mouseY = (e.getY() - Y) / 100;
		    	
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
		String gem1 = new String("Gblue.png");
		String gem2 = new String("Gdiamond.png");
		String gem3 = new String("Ggreen.png");
		String gem4 = new String("Gred.png");
		String gem5 = new String("Gyellow.png");
		Gemname.add(gem1);
		Gemname.add(gem2);
		Gemname.add(gem3);
		Gemname.add(gem4);
		Gemname.add(gem5);
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
	void CandyMoving(Graphics p){
		int CandyMovingX = 61;
		int CandyMovingY = 719;
		int CandyYSpeed = 2;
		
		if(CandyMovingY = Y) 
		
	}

	
	JLabel Score = new JLabel();
	
	
	protected void paintComponent(Graphics g) {
		Rule rule = new Rule();
		while (rule.check()) rule.update();
		int CandyX = X;
		int CandyY = Y;
		int borderLocationX = 45;
		int borderLocationY = 150;
		int ttx = 270;
		int tty = 20;
		super.paintComponent(g); 
		Gemsname();
		// draw BG
				this.BG = new ImageIcon("BG1.png");
				BG.paintIcon(this, g, 0, 0);
		//draw TITTLE
		this.tittle = new ImageIcon("TImg.png");
		tittle.paintIcon(this, g, ttx, tty);
		//draw GRID
		for(int counter = 0; counter<row;counter++){
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
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(candyBoard[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < row ; i++ ){
			for(int j = 0; j < col; j++){
				Candy = new ImageIcon(Gemname.get(candyBoard[i][j]-1).toString());
				
				Candy.paintIcon(this, g, CandyX, CandyY);
				CandyX = CandyX + space;
				
			}
			CandyX = 61;
			CandyY = CandyY + space;
		}
		repaint();
	}

	//	rule.set();

//		candyBoard[0][0] = 1;
//		for(int i = 0; i < row ; i++ ){
	//		for(int j = 0; j < col; j++){
//				Candy = new ImageIcon(Gemname.get(candyBoard[i][j]).toString());
//				Candy.paintIcon(this, g, CandyX, CandyY);
//				g.drawRect(borderLocationX, borderLocationY, 100, 100);
//				CandyX = CandyX + 100;
	//			System.out.print(candyBoard[i][j] + " ");
				
		//	}
			//System.out.println();
	//		CandyX = 61;
		//	CandyY = CandyY + 100;
//		}
	
	
//		rule.attạch();
	//	repaint();
	//}	

}


