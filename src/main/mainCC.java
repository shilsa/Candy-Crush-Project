package main;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class mainCC extends Applet {   
	public static final int WIDTH = 890, HEIGHT = 820;
        public static JFrame frame = new JFrame("Candy Crush");
	public mainCC() {
		
		DrawBoard draw = new DrawBoard();
		draw.BlockLocation();
	//	draw.setTemp2();
	//	draw.paintComponent(g);
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(draw);
		Rule rule = new Rule();
		while(rule.check()) rule.update();
		FallingDown fallingDown = new FallingDown();
		fallingDown.setCandyStatus();
		draw.setTemp3();
                
	}

	//public static void main() {
	//	new mainCC();
	//}

}