package snake;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Credits extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		
			
			Text text = new Text();
			Text text2 = new Text();
			Text text3 = new Text();
 			//Setting the text to be added. 
			text.setText("Fero"); 
			text2.setText("Oskar");
			text3.setText("Made by:");
			//setting the position of the text 
	     	text.setX(80); 
			text.setY(35); 
	        
			text2.setX(80); 
			text2.setY(55);
			
			text3.setX(5); 
			text3.setY(15);
			
			text.setStyle("-fx-font: 15 arial");
			text2.setStyle("-fx-font: 15 arial");
			text3.setStyle("-fx-font: 15 arial");
			//Creating a Group object  
			Group root = new Group(text, text2, text3);   
			
	               
			//Creating a scene object 
	     	Scene scene = new Scene(root, 150, 100);  
	     	
	     	//Setting title to the Stage 
	     	stage.setTitle("Credits"); 
	         
	     	//Adding scene to the stage 
	     	stage.setScene(scene); 
	         
	     	//Displaying the contents of the stage 
	     	stage.centerOnScreen();
	     	stage.show(); 
	     
        
	}

}
