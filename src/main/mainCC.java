package main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class mainCC {
	public static final int WIDTH = 600, HEIGHT = 800;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Candy Crush");
		DrawBoard draw = new DrawBoard();
		//frame.setBounds(0, 0, WIDTH, HEIGHT);
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(draw);
		
	}

}
