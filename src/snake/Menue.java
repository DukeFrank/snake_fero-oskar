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
        Button btn = new Button();
        btn.setText("Start");
        Button btn1 = new Button();
        btn1.setText("Exit");
        btn.setTranslateY(-30);
        btn.setMinWidth(100);
        btn1.setMinWidth(100);
        
       
        
      
//        Aktion für den Button setzen 
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
            public void handle(ActionEvent event) {
                Feld f = new Feld();
               // f.main(null);
            }
        });
        
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
        	@Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        root.getChildren().add(btn1);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
