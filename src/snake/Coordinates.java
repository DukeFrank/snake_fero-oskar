package snake;

public class Coordinates {
	private int snakeX;
	private int snakeY;
	
	public Coordinates(int x, int y){
		this.setSnakeX(x);
		this.setSnakeY(y);
	}

	public int getSnakeX() {
		return snakeX;
	}

	public void setSnakeX(int snakeX) {
		this.snakeX = snakeX;
	}

	public int getSnakeY() {
		return snakeY;
	}

	public void setSnakeY(int snakeY) {
		this.snakeY = snakeY;
	}
	
	
}	
