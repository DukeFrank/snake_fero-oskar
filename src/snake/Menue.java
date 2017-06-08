package snake;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Menue extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Snake");
        primaryStage.setResizable(false);
        
        
        //Button
        Button btn = new Button();
        btn.setText("START");
        btn.setTranslateY(2-70);
        btn.setMinWidth(180);
        Button btn1 = new Button();
        btn1.setText("EXIT");
        btn1.setTranslateY(+35);
        btn1.setMinWidth(180);
        Button btn2 = new Button();
        btn2.setText("CREDITS");      
        btn2.setMinWidth(180);
        Button btn3 = new Button();
        btn3.setText("COLOR");
        btn3.setTranslateY(-35);
        btn3.setMinWidth(180);
        
        //design
        btn.setStyle("-fx-font: 15 arial; -fx-base: #36AFFF;-fx-text-fill: #FFFFFF;");
        btn1.setStyle("-fx-font: 15 arial; -fx-base: #C60000;-fx-text-fill: #FFFFFF;");
        btn2.setStyle("-fx-font: 15 arial; -fx-base: #36AFFF;-fx-text-fill: #FFFFFF;");
        btn3.setStyle("-fx-font: 15 arial; -fx-base: #36AFFF;-fx-text-fill: #FFFFFF;");
             
        
        
//        action for a Button 
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
            public void handle(ActionEvent event) {
                Feld f = new Feld();
                try {
                	primaryStage.centerOnScreen();
					f.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
				}
                
            }
        });
             
        btn1.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
            public void handle(ActionEvent event) {
                System.exit(0);                
        	}        	
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Credits c = new Credits();
				try {
					primaryStage.centerOnScreen();               	
					c.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
					}
				}
							
		
        });
            
        btn3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Settings s = new Settings();
				try {
                	primaryStage.centerOnScreen();
					s.start(primaryStage);
				} catch (Exception e) {
					e.printStackTrace();
					}
				}
			
        	
		});
        
        StackPane root = new StackPane();
        root.setStyle("-fx-background-color: #001E32");
        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
        
    }
}
