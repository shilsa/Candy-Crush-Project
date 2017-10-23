package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawBoard extends JPanel{
	private ImageIcon BG;
	public void painter(Graphics g){
		// draw Background
	/*	BG = new ImageIcon("BG1.jpg");
		BG.paintIcon(this, g, 20, 20);
		g.setColor(Color.blue);
		g.fillRect(24,74, 20, 20);*/
		g.setColor(Color.blue);
		g.drawRect(25,30, 200, 50);
	}
}
