package main;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class mainCC {
	public static final int WIDTH = 600, HEIGHT = 750;
	public mainCC(){
		JFrame frame = new JFrame("Candy Crush");
		DrawBoard draw = new DrawBoard();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(draw);
		
	}
	public static void main(String[] args) {
		mainCC frame = new mainCC();
		System.out.println("hi");
	}

}
