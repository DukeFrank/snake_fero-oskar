package snake;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Snake {
	
	//snake-body
	private Circle snakeBody;
	private int lastPart;
	
	private ArrayList<Circle>snakeParts;
	
	public Snake(){
		snakeParts = new ArrayList<Circle>();
		snakeBody = new Circle(40,30,8);
		snakeBody.setFill(Color.GREEN);
		snakeParts.add(snakeBody);
		snakeParts.add(snakeBody);
		
	}
	
	public void addBodyPart(){
		snakeParts.add(snakeBody);
		lastPart = snakeParts.size();
	}

	public int getLastPart() {
		return lastPart;
	}

	public void setLastPart(int lastPart) {
		this.lastPart = lastPart;
	}

	@Override
	public String toString() {
		return "snake [lastPart=" + lastPart + "]";
	}
	
	
}
