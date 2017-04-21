package snake;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Feld extends Application {

	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub			
	        Scene scene=new Scene(game(),800,600);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Snake");
	        primaryStage.show();
	        primaryStage.setResizable(false);
	        
	        
	}
	
	public Pane game(){
		Pane pane = new Pane();
		ArrayList<SnakeSegment>snakeParts = new ArrayList<>();
Coordinates p = new Coordinates(100, 100);
		SnakeHead s = new SnakeHead(p, pane);
		snakeParts.add(s);
		
		SnakeSegment prev = s;

		for(int i = 0; i < 20; ++i) {
		SnakeSegment curr = new SnakeSegment(p, prev, pane);
		snakeParts.add(curr);
		prev = curr;
		}
	
		
		
		//food wird gezeichnet
		Random r = new Random();
		int randomX = r.nextInt(800);
		int randomY = r.nextInt(800);
		Circle food = new Circle();
		food.setFill(Color.RED);
		food.setRadius(10);
		food.setTranslateX(randomX);
		food.setTranslateY(randomY);
		
		pane.getChildren().add(food);
//		c.setFill(Color.GREEN);
//		pane.getChildren().add(c);
		

				
		
		//Button wird leider angezeigt
		final Button steuern=new Button();
		pane.getChildren().add(steuern);
		steuern.setTranslateX(5000);
		
		
		s.registerControls(steuern);
        
        AnimationTimer an=new AnimationTimer(){
            public void handle(long arg0) {
            	for (SnakeSegment s : snakeParts) {
                  	s.update();
                	s.render();
      				
				}
             }
            
        };
        
        an.start();

		return pane;	
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }
	
}
