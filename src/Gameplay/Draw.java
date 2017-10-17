package Gameplay;

import DrawBoard.BackGround;

public class Draw {

	public static void main(String[] args) {
		BackGround t = new BackGround();
		t.setI(5);
		t.set();
		t.getI();
		System.out.println(t.getI());
	}

}
