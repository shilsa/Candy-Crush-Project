package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class DrawBoard extends JPanel{
	private ImageIcon BG;
	private ImageIcon tittle;
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g); 
		BG = new ImageIcon("BG1.jpg");
		BG.paintIcon(this, g, 0, 0);
		tittle = new ImageIcon("TittleImage.png");
		tittle.paintIcon(this, g, 145, 5);
	}
}
