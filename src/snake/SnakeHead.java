package snake;

import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class SnakeHead extends SnakeSegment {
	private boolean Right = true;
	private boolean Left = false;
	private boolean Up = false;
	private boolean Down = false;
	public SnakeHead(Coordinates position, Pane pane) {
		super(position, null, pane);
	}
	
	void registerControls(Button steuern) {
        steuern.setOnKeyPressed(e->	{
            if(e.getCode()==KeyCode.RIGHT){
            	if(Left == true)
            		return;
                Right=true;
                Left=false;
                Up=false;
                Down=false;              
            }
            if(e.getCode()==KeyCode.LEFT){
            	if(Right == true)
            		return;
                Left=true;
                Right=false;
                Down=false;
                Up=false;
            }
            if(e.getCode()==KeyCode.UP){
            	if(Down == true)
            		return;
                Left=false;
                Right=false;
                Up=true;
                Down=false;
            }
            if(e.getCode()==KeyCode.DOWN){
            	if(Up == true)
            		return;
                Right=false;
                Left=false;
                Down=true;
                Up=false;
            }
        });
	}

	@Override
	public void update() {
		int snakeX = position.getSnakeX();
		int snakeY = position.getSnakeY();
		
		if(snakeX >= 400){
			snakeX = -400;
		}	else if(snakeX <= -400){
			snakeX = 400;
		}	else if(snakeY >= 300) {
			snakeY = -300;
		}	else if(snakeY <= -300){
			snakeY = 300;
		}
		
		
        if(Right){
            snakeX+=2;
        }
        
        if(Left){
            snakeX-=2;
        }
        
        if(Up){
            snakeY-=2;
        }
        
        if(Down){
            snakeY+=2;
        }

        position = new Coordinates(snakeX, snakeY);
        
        rememberPosition();
	}
}
