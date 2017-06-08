package snake;

import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class SnakeHead extends SnakeSegment {
	private boolean Right = true;
	private boolean Left = false;
	private boolean Up = false;
	private boolean Down = false;
	private int halten = 0;
	//private long start = 0;
	public SnakeHead(Coordinates position, Pane pane) {
		super(position, null, pane);
	}
	
	
	/**
	 * 
	 * @param steuern
	 */
	void registerControls(Button steuern) {		
			
	        steuern.setOnKeyPressed(e->	{
	            if(e.getCode()==KeyCode.RIGHT && halten > 10){
	            	if(Left == true)
	            		return;
	                Right=true;
	                Left=false;
	                Up=false;
	                Down=false;
	                halten = 0;
	            }
	            
	            if(e.getCode()==KeyCode.LEFT  && halten > 10){
	            	if(Right == true)
	            		return;
	                Left=true;
	                Right=false;
	                Down=false;
	                Up=false;
	                halten = 0;
	            }
	            
	            if(e.getCode()==KeyCode.UP && halten > 10){
	            	if(Down == true)
	            		return;
	                Left=false;
	                Right=false;
	                Up=true;
	                Down=false;
	                halten = 0;
	            }
	            
	            if(e.getCode()==KeyCode.DOWN && halten > 10){
	            	if(Up == true)
	            		return;
	                Right=false;
	                Left=false;
	                Down=true;
	                Up=false; 
	                halten = 0;
	            }
	            
	      });
	};

	@Override		
	public void update() {
		halten++;	
		int snakeX = position.getSnakeX();
		int snakeY = position.getSnakeY();
		
		if(snakeX >= 795){
			snakeX = 5;
		}	else if(snakeX <= 5){
			snakeX = 795;
		}	else if(snakeY >= 595) {
			snakeY = 5;
		}	else if(snakeY <= 5){
			snakeY = 595;
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
