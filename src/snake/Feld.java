package snake;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
//import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Feld extends Application {
	private boolean Right = false;
	private boolean Left = false;
	private boolean Up = false;
	private boolean Down = false;
	private double locationX = 0;
	private double locationY = 0;
	private double snakeX = 0;
	private double snakeY = 0;
	
	

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
		int xPos = 0;
		int yPos = 0;
		
		for(int i = 0; i < snakeParts; i++, yPos +=10){
			Circle c = new Circle(xPos, yPos, 0);
			c.setFill(Color.GREEN);
			pane.getChildren().add(c);
		}
		
		
		Button steuern=new Button();
        steuern.relocate(-100, 200);
        pane.getChildren().add(steuern);
        steuern.setOnKeyPressed(e->{
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
		return pane;
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
