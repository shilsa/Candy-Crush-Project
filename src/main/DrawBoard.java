package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class DrawBoard extends JPanel{
	private ImageIcon BG;
	private ImageIcon tittle;
	JLabel Score = new JLabel();
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g); 
		// draw BG
		BG = new ImageIcon("BG1.jpg");
		BG.paintIcon(this, g, 0, 0);
		// draw tittle
		tittle = new ImageIcon("TittleImage.png");
		tittle.paintIcon(this, g, 145, 5);
		// draw Score
		g.setColor(Color.WHITE);
		g.drawString("Score: ", 10, 100);
	}
}
