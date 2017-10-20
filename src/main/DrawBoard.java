package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawBoard{
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public void drawBoard(){
		JFrame frame = new JFrame("Candy Crush");
		JLabel label = new JLabel("");
		ImageIcon image = new ImageIcon("BG.jgp");
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setIcon(image);
		frame.add(label);
	}

}
