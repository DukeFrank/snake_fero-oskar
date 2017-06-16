package snake;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Credits extends Application{

	@Override
	public void start(Stage stage) throws Exception {		
			
			Text text1 = new Text();
			Text text2 = new Text();
			Text text3 = new Text();
 			//Setting the text to be added. 
			text1.setText("Fero"); 
			text2.setText("Oskar");
			text3.setText("Made by:");
			
			
			text1.setStyle("-fx-font: 25 arial; -fx-text-fill: #FFFFFF;");
			text2.setStyle("-fx-font: 25 arial; -fx-text-fill: #FFFFFF;");
			text3.setStyle("-fx-font: 25 arial; -fx-text-fill: #FFFFFF;");
			
			
			text3.setTranslateY(-35); 
			text2.setTranslateY(+35); 
	               
			StackPane root = new StackPane();
			root.getChildren().add(text1);
			root.getChildren().add(text2);
			root.getChildren().add(text3);
			stage.setScene(new Scene(root, 300, 250)); 
			root.setStyle("-fx-background-color: #001E32");
	     	stage.setTitle("Credits");
	     	stage.centerOnScreen();
	     	stage.show(); 
	     
        
	}

}
