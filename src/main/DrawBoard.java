package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrawBoard{
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public void drawBoard(){
		JFrame frame = new JFrame("Candy Crush");
		JLabel label = new JLabel("");
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setText("Hello World");
		label.setToolTipText("Its basic stuff");
		frame.add(label);
	}

}
