
public class Candy {
	int Candy[][];
	private int CandyX = 61;
	private int CandyY = 165;
	int col,row;
	public Candy(){
		for (row=0;row<5;row++){
			for(col=0;col<5;col++){
				Candy[row][col] = 1;
			}
		}
	}
}
