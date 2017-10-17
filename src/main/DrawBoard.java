package main;

import javax.swing.JFrame;

public class DrawBoard {
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public void drawBoard(){
		JFrame frame = new JFrame("Candy Crush");
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
