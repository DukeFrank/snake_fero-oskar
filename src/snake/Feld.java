package snake;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Feld extends Application{

	public Feld(){
		
		
	}
	
	 

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		StackPane root = new StackPane();
        
        primaryStage.show();
		primaryStage.setTitle("Snake");
		Scene scene = new Scene(root, 600, 500);  
	    scene.setFill(Color.BLACK);  
	    primaryStage.setScene(scene); 
	    
	     
		
		
	}
	
	
	public static void main(String[] args) {
        launch(args);
    }
	 
	
    
}
