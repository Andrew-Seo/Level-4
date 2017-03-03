package battleShip;

public class Model {
	boolean [][] playerData = new boolean[10][10];
	boolean [][] computerData = new boolean[10][10];
	boolean [][] playerMoves = new boolean[10][10];
	boolean wasHit;
	
	boolean attackShip(int x, int y){
		x = x/100;
		y = y/50;
		
	if(playerMoves[x][y] == false)	{
		
		
		
		return computerData[x][y];
	}
		return false;
	}
}
