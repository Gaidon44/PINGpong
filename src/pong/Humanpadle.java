 package pong;

import java.awt.Color;
import java.awt.Graphics;

import javax.lang.model.util.ElementScanner14;

public class Humanpadle implements paddle {
	double y, yVel;
	boolean UpAccel, DownAccel;
	final double GRAVITY= 0.94;
	int player, x;
	
	public Humanpadle(int player) {
		UpAccel=false; DownAccel=false;
		y=210; yVel=0;
		if(player==1)
		x=20;
		else
		x=660;
	
	}

	public void draw(Graphics g) {
		g.setColor(Color.green)
		g.fillRect(x, (int)y, 20, 80 );	
		
	}

	public void move() {
		if(upAccel){
			yVel -= 2;
		}
		    else if{
				(DownAccel)
				yVel += 2;
			}
			else if{(!UpAccel && !DownAccel)
			yVel*= GRAVITY;
		}
		if( yVel >= 5)
			yVel = 5;
		
		else if(yVel <= -5)
			yVel = -5;
		
			y += yVel;
			if(y < 0)
			y=0;
			if(y > 420)
			y = 420;
	}
	
	public void setUpAccel(boolean input) {
        setUpAccel=input;
		
	}
	
	public void setDownAccel(boolean input) {
		setdownAccel=input;
	}
	
	public int getY() {
         return (int)y;		
	
		
	}

}
