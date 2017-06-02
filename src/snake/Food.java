package snake;

import javafx.geometry.Bounds;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Food{
	
	public Circle food;
	private Coordinates position;
	public Food(Coordinates position, Pane pane){
		this.position = position;
		food = new Circle(position.getSnakeX(),position.getSnakeY(),8);
		food.setRadius(8);
		food.setFill(Color.CORAL);
		pane.getChildren().add(food);						
	}
	
	

	public Coordinates getPosition() {
		return position;
	}

	public void setPosition(Coordinates position) {
		this.position = position;
	}

	public Bounds getFood() {
		return food.getBoundsInLocal();
	}
	
	
	public void render(){
		food.setCenterX(position.getSnakeX());
		food.setCenterY(position.getSnakeY());
		
	}
	
	
}
 