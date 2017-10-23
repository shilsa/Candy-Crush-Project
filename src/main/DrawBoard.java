package main;

import javax.swing.ImageIcon;
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
	private ImageIcon BG,Candy;
	private ImageIcon tittle;
	private int borderLocationX = 45;
	private int borderLocationY = 150;
	private int CandyX = 61;
	private int CandyY = 165;
	private static int CandyNumber = 25;
	// create random variable for the string name
	Random random = new Random();
	// declare string name
	List<String> Gemname = new ArrayList<String>();
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
		Gemname.get(0);
		System.out.println(Gemname.get(0));
	}
	JLabel Score = new JLabel();
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); 
		Gemsname();
		// draw BG
		BG = new ImageIcon("BG1.jpg");
		BG.paintIcon(this, g, 0, 0);
		// draw tittle
		tittle = new ImageIcon("TittleImage.png");
		tittle.paintIcon(this, g, 125, 20);
		// draw gameplay area
		for(int counter = 0; counter<5;counter++){
			for(int i = 0; i < 5; i++){
		g.setColor(Color.WHITE);
		g.drawRect(borderLocationX, borderLocationY, 100, 100);
		g.drawRect(borderLocationX+1, borderLocationY+1, 100, 100);
		borderLocationX = borderLocationX + 100;
		}
			borderLocationX = 45;
			borderLocationY = borderLocationY + 100;
		}
		// draw the Candy
		for(int k = 0; k < 5 ; k++ ){
			for(int k2 = 0; k2 < 5; k2++){
				int rand = random.nextInt(5) + 0;
				Candy = new ImageIcon(Gemname.get(rand).toString());
				Candy.paintIcon(this, g, CandyX, CandyY);
				CandyX = CandyX + 100;
			}
			CandyX = 61;
			CandyY = CandyY + 100;
		}
		
	}
}
