package snake;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Settings extends Application{

	private static int colorNR;
	
	public Settings(){
		setColorNR(colorNR);
	}
	
	/**
	 * @return the colorNR
	 */
	public int getColorNR() {
		return colorNR;
	}

	/**
	 * @param colorNR the colorNR to set
	 */
	public void setColorNR(int colorNR) {
		this.colorNR= colorNR;
	}
	
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 primaryStage.setTitle("Color Picker");
	     primaryStage.setResizable(false);
	     
	   //Buttons
	        Button btn = new Button();
	        btn.setText("Blue");
	        btn.setTranslateY(-70);
	        btn.setMinWidth(180);
	        Button btn1 = new Button();
	        btn1.setText("Red");
	        btn1.setTranslateY(+35);
	        btn1.setMinWidth(180);
	        Button btn2 = new Button();
	        btn2.setText("Green");	        
	        btn2.setMinWidth(180);
	        Button btn3 = new Button();
	        btn3.setText("Black");
	        btn3.setTranslateY(-35);
	        btn3.setMinWidth(180);
	        Button btn4 = new Button();
	        btn4.setText("Gelb");
	        btn4.setTranslateY(+70);
	        btn4.setMinWidth(180);
	        Button btn5 = new Button();
	        
	        //design
	        btn.setStyle("-fx-font: 15 arial; -fx-base: #1192fc;-fx-text-fill: #ffffff;");
	        btn1.setStyle("-fx-font: 15 arial; -fx-base: #e02104;-fx-text-fill: #ffffff;");
	        btn2.setStyle("-fx-font: 15 arial; -fx-base: #0cb700;-fx-text-fill: #ffffff;");
	        btn3.setStyle("-fx-font: 15 arial; -fx-base: #000000;-fx-text-fill: #ffffff;");
	        btn4.setStyle("-fx-font: 15 arial; -fx-base: #ffe438;-fx-text-fill: #ffffff;");
	        
	        
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent event) {
	                    setColorNR(1);     
	                    Menue m = new Menue();
		                try {
		                	primaryStage.centerOnScreen();
							m.start(primaryStage);
						} catch (Exception e) {
							e.printStackTrace();
						}
	        	}        	
	        });
	        
	        btn1.setOnAction(new EventHandler<ActionEvent>() {
	        	@Override
	            public void handle(ActionEvent event) {
	        		setColorNR(2);  
	        		Menue m = new Menue();
	                try {
	                	primaryStage.centerOnScreen();
						m.start(primaryStage);
					} catch (Exception e) {
						e.printStackTrace();
					}
	        	}        	
	        });
	        
	        
	        
	        btn2.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					setColorNR(3);
					Menue m = new Menue();
	                try {
	                	primaryStage.centerOnScreen();
						m.start(primaryStage);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
	        });
	            
	        btn3.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					setColorNR(4);
					Menue m = new Menue();
	                try {
	                	primaryStage.centerOnScreen();
						m.start(primaryStage);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	        
	        btn4.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					setColorNR(5);
					Menue m = new Menue();
	                try {
	                	primaryStage.centerOnScreen();
						m.start(primaryStage);
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
	     root.getChildren().add(btn4);
	     primaryStage.setScene(new Scene(root, 300, 250));
	     primaryStage.show();
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}
