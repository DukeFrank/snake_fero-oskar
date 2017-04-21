package snake;

import java.util.LinkedList;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SnakeSegment {
	protected Coordinates position;
	private int alter;
	LinkedList<Coordinates>c = new LinkedList<>();
	private SnakeSegment vordermann;
	private Circle circle;
	
	public SnakeSegment(Coordinates position, SnakeSegment vordermann, Pane pane) {
		super();
		this.position = position;
		this.vordermann = vordermann;
		
		circle = new Circle(400,300,8);
		pane.getChildren().add(circle);
		circle.setRadius(10);
		circle.setFill(Color.GREEN);
		
	}

	public void update(){
		if(alter > 60){
			//vordermann hinterherlaufen

				position = vordermann.c.getLast();
			
		}
		
		//c befüllen
		
		rememberPosition();
		
		alter++;
	}

	protected void rememberPosition() {
		c.addFirst(position);
		if(c.size() > 30){
			c.removeLast();
		}
	}
	
	public void render(){
		circle.setTranslateX(position.getSnakeX());
		circle.setTranslateY(position.getSnakeY());
		
	}
}
