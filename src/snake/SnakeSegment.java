package snake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SnakeSegment {
	private int xPos;
	private int yPos;
	private int alter;
	Coordinates[]c = new Coordinates[30];
	private SnakeSegment vordermann;
	
	public SnakeSegment(){
		Circle c = new Circle(400,300,8);
		c.setTranslateX(100);
        c.setTranslateY(100);
        c.setRadius(10);
        c.setFill(Color.GREEN);
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	public void update(){
		
	}
	
	public void render(){
	}
}
