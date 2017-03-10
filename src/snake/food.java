package snake;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class food extends Application{
	
	
	private ImageView cherry;
	
	public food(){
	Image img = new Image("cherry.gif");
	cherry.setImage(img);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public void generatePos(int x, int y){
		cherry.setTranslateX(x);
		cherry.setTranslateY(y);
		cherry.setVisible(true);
	}
}
