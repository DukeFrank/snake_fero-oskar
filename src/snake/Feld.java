package snake;

import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Feld extends Application {
	private boolean Right = false;
	private boolean Left = false;
	private boolean Up = false;
	private boolean Down = false;
	
	

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
		
		int snakeParts = 1;
		
		for(int i = -1; i < snakeParts; i++){
			 SnakeSegment s = new SnakeSegment();       
		        
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
		
		
        steuern.setOnKeyPressed(e->	{
            if(e.getCode()==KeyCode.RIGHT){
                Right=true;
                Left=false;
                Up=false;
                Down=false;              
            }
            if(e.getCode()==KeyCode.LEFT){
                Left=true;
                Right=false;
                Down=false;
                Up=false;
            }
            if(e.getCode()==KeyCode.UP){
                Left=false;
                Right=false;
                Up=true;
                Down=false;
            }
            if(e.getCode()==KeyCode.DOWN){
                Right=false;
                Left=false;
                Down=true;
                Up=false;
            }
        });
        
        AnimationTimer an=new AnimationTimer(){
            public void handle(long arg0) {
                if(Right){
                    //snakeX+=1.2;
                    //c.setTranslateX(snakeX);
                }
                
                if(Left){
                    //snakeX-=1.2;
                    //c.setTranslateX(snakeX);
                }
                
                if(Up){
                   // snakeY-=1.2;
                    //c.setTranslateY(snakeY);
                }
                
                if(Down){
                    //snakeY+=1.2;
                    //c.setTranslateY(snakeY);
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
