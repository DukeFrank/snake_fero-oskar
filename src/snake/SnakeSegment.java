package snake;

import java.util.LinkedList;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SnakeSegment {
	protected Coordinates position;
	private int alter;
	LinkedList<Coordinates>c = new LinkedList<>();
	private SnakeSegment vordermann;
	protected Circle circle;
	
	public SnakeSegment(Coordinates position, SnakeSegment vordermann, Pane pane) {
		super();
		this.position = position;
		this.vordermann = vordermann;
		
		circle = new Circle(400,300,10);
		pane.getChildren().add(circle);
		circle.setFill(Color.GREEN);
		
	}
	
	public void update(){
		if(alter > 10){
			//vordermann hinterherlaufen

				position = vordermann.c.getLast();
			
		}
		
		//c befüllen
		
		rememberPosition();
		
		alter++;
	}

	protected void rememberPosition() {
		c.addFirst(position);
		if(c.size() > 10){
			c.removeLast();
		}
	}
	
	public void render(){
		circle.setTranslateX(position.getSnakeX());
		circle.setTranslateY(position.getSnakeY());
		
	}

	public Bounds getCircle() {
		return circle.getBoundsInLocal();
	}

	
	
	
}
