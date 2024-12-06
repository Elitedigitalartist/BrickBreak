//
//  Class author:  David Sagoua
//  Date created:  December 4, 2024
//  General description: This class holds the information for the ball that the player hits in the Brick Break game
//

import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
public class Ball {
	private int x;
	private int y;
	private int size;
	private int YVelocity;
	private int XVelocity;

	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		YVelocity = 1;
		XVelocity = 0;
	}
	

	//
    //  Pre-condition: The arguemnt entered into this method must be of type Graphics
    //  Post-condition: A ball is drawn and ade visible in the game
    //

	public void draw(Graphics g){
		g.setColor(Color.white); // call first to set the desired color
        g.fillOval(x , y, size, size);

	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Return the y position of the ball
	//

	public int getYpos(){
		return y;
	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Return the x position of the ball
	//
	public int getXpos(){
		return x;
	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Return the size of the ball
	//
	public int getSize(){
		return size;
	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Reverses the direction of the ball on the y-axis
	//
	public void reverseY(){
		YVelocity = -YVelocity;
	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Reverses the direction of the ball on the x-axis
	//
	public void reverseX(){
		XVelocity = -XVelocity;
	}

	//
	//  Pre-condition: Arguement entered must be of type int
	//  Post-condition: Sets the velocity of y-component of velocity
	//
	public void setYVelocity(int YV){
		YVelocity = YV;
	}

	//
	//  Pre-condition: Arguement entered must be of type int
	//  Post-condition: Sets the velocity of x-component of velocity
	//
	public void setXVelocity(int XV){
		XVelocity = XV;
	}

	//
	//  Pre-condition: Arguement entered must be of type int
	//  Post-condition: Sets y-position of the ball
	//
	public void setY(int changedY){
		y = changedY;
	}

	//
	//  Pre-condition: Arguement entered must be of type int
	//  Post-condition: Sets x-position of the ball
	//
	public void setX(int changedX){
		x = changedX;
	}

	//
	//  Pre-condition: No pre-condition
	//  Post-condition: Move the ball on both the x and y axis
	//
	public void move(){
		y += YVelocity;
		x += XVelocity;
	}
	
}
