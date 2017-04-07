package snake;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Food{
	private Circle food;
	
	public Food(int x, int y){
		food.setTranslateX(x);
		food.setTranslateY(y);
		food.setFill(Color.RED);
		food.setRadius(10);
	}
	
}
