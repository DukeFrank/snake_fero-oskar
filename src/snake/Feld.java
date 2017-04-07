package snake;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	private double locationX = 0;
	private double locationY = 0;
	private double snakeX = 300;
	private double snakeY = 300;
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
			Pane pane=new Pane();
	        Scene scene=new Scene(game(),800,600);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Snake");
	        primaryStage.show();
	        primaryStage.setResizable(false);
	        
	        
	}
	
	public Pane game(){
		Pane pane = new Pane();
		int snakeParts = 3;
		double xPos = snakeX;
		double yPos = snakeY;
		Circle c = new Circle(400,300,8);
		for(int i = 0; i < snakeParts; i++, yPos +=15){
			 
		        c.setTranslateX(xPos);
		        c.setTranslateY(yPos);
		        c.setRadius(10);
		        c.setFill(Color.GREEN);
		        
		        
		        
		}
		pane.getChildren().add(c);
//		c.setFill(Color.GREEN);
//		pane.getChildren().add(c);
		
		if(Up = true){
			snakeY -= 10;
		}
		
		
		
		final Button steuern=new Button();
		pane.getChildren().add(steuern);
		
        steuern.setOnKeyPressed(e->	{
            if(e.getCode()==KeyCode.RIGHT){
                Right=true;
                Left=false;
                Up=false;
                Down=false;
                locationX=snakeX;
                locationY=snakeY;
            }
            if(e.getCode()==KeyCode.LEFT){
                Left=true;
                Right=false;
                Down=false;
                Up=false;
                locationX=snakeX;
                locationY=snakeY;
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
                    snakeX+=1.2;
                    c.setTranslateX(snakeX);
                   
                
                }
                if(Left){
                    snakeX-=1.2;
                    c.setTranslateX(snakeX);
                 
                
                }
                if(Up){
                    snakeY-=1.2;
                    c.setTranslateY(snakeY);
                
                
                }
                if(Down){
                    snakeY+=1.2;
                    c.setTranslateY(snakeY);
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
