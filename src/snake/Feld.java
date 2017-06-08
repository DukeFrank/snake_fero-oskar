
package snake;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Feld extends Application {
	
	private SnakeSegment prev;
	

	@Override
	public void start(Stage primaryStage) throws Exception {		
	        Scene scene=new Scene(game(),800,600);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Snake");
	        primaryStage.show();
	        primaryStage.setResizable(false);
	       
	        
	        
	        
	}
	
	public  Pane game(){
		Pane pane = new Pane();
		
		pane.setStyle(" -fx-background-image: url('RockBG.png'); ");
		pane.setStyle(" -fx-background-repeat: repeat-y repeat-x; ");
		pane.setStyle(" -fx-background-position: center center; ");	  
			     
			   
			
		
		ArrayList<SnakeSegment>snakeParts = new ArrayList<>();
		Coordinates p = new Coordinates(100, 100);
		SnakeHead snakeHead = new SnakeHead(p, pane);
		snakeParts.add(snakeHead);
		
		prev = snakeHead;
		
		Media gameMusic = new Media(new File("game_on_0.mp3").toURI().toString());
		MediaPlayer mediaPlayerGame = new MediaPlayer(gameMusic);
		mediaPlayerGame.setVolume(0.5);
		mediaPlayerGame.setAutoPlay(true);
		
		Label scoreTable = new Label();
		
		
		for(int i = 0; i < 3; ++i) {
			SnakeSegment curr = new SnakeSegment(p, prev, pane);
			snakeParts.add(curr);
			prev = curr;
		}
	
		
		//create food
		Random r = new Random();
		int randomX = r.nextInt(795);
		int randomY = r.nextInt(595);
		Coordinates foodPos = new Coordinates(randomX, randomY);
		Food food = new Food(foodPos, pane);
		
				
		
		final Button steuern=new Button();
		pane.getChildren().add(steuern);
		pane.getChildren().add(scoreTable);
		steuern.setTranslateX(5000);
		
		
		snakeHead.registerControls(steuern);
        
        AnimationTimer an=new AnimationTimer(){
            public void handle(long arg0) {

            	// update all
            	for (SnakeSegment s : snakeParts) {
                  	s.update();
				}
            	

            	if(snakeHead.getCircle().intersects(food.getFood())){
            		
            		Media eat = new Media(new File("Pickup_00.mp3").toURI().toString());
            		MediaPlayer mediaPlayer = new MediaPlayer(eat);
            		mediaPlayer.play();
            		Random r = new Random();
            		int foodRandomX = r.nextInt(795);
            		int foodRandomY = r.nextInt(595);
            		Coordinates newFoodPos = new Coordinates(foodRandomX, foodRandomY);
            		food.setPosition(newFoodPos);
            		food.render();
            		SnakeSegment sNew = new SnakeSegment(prev.getPosition(), prev, pane);
                	snakeParts.add(sNew);
                	prev = sNew;
            	}
            	for(int i = 4; i < snakeParts.size(); ++i){
            		if(snakeHead.getCircle().intersects(snakeParts.get(i).getCircle())){
            			System.exit(0);
            		}
            	}
            	
            	// render all
            	for (SnakeSegment s : snakeParts) {
                	s.render();
				}
            	int score = snakeParts.size()-4;
            	scoreTable.setText("  SCORE: "+score);
             }
            
        };
        
        an.start();

		return pane;	
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }
	
}
