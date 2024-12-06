//
//  Class author:  David Sagoua
//  Date created:  December 4th, 2024
//  General description: This class holds the information for the paddle that the player controls in the Brick Break game
//
import java.awt.*;

public class Paddle {
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity = 1;
	Graphics g;

	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	//
    //  Pre-condition: The arguemnt entered into this method must be of type Graphics
    //  Post-condition: A paddle is drawn and ade visible in the game
    //
	public void draw(Graphics g){
		g.setColor(Color.white); // call first to set the desired color
        g.fillRect(x , y, width, height);
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Returns the x-position of the paddle
    //

	public int getX(){
		return x;
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Returns the y-position of the paddle
    //
	public int getY(){
		return y;
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Returns the width of the paddle
    //
	public int getWidth(){
		return width;
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Returns the height of the paddle
    //
	public int getHeight(){
		return height;
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Returns the velocity of the paddle
    //
	public int getVelocity(){
		return velocity;
	}

	//
    //  Pre-condition: Argument entered must be of type int
    //  Post-condition: Increases the velocity of the paddle
    //
	public void addVelocity(int vMore){
		velocity = vMore;
	}

	//
    //  Pre-condition: Argument entered must be of type int
    //  Post-condition: Sets the velocity of the paddle
    //
	public void setVelocity(int changedV){
		velocity = changedV;
	}

	//
    //  Pre-condition: Argument entered must be of type int
    //  Post-condition: Sets the x-position of the paddle
    //
	public void setX(int changedX){
		x = changedX;
	}

	//
    //  Pre-condition: No pre-condition
    //  Post-condition: Moves the paddle at the speed the velocity is set to
    //
	public void move(){
		x += velocity;
	}
	
}
