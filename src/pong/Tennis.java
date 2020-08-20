package pong;
 
import java.applet.Applet;	
import java.awt.color;
import java.awt.Graphics;


public class Tennis  extends Applet implements Runnable, KeyListerner{
final int WIDTH=700, HEIGHT=500;
Thread thread;
Humanpadle p1;
ball b1;

	public void init() {
		this.resize(WIDTH, HEIGHT);

		this.addKeyListerner(this);
		p1= new Humanpadle(1);
		b1= new ball;
		thread= new Thread(this);
		thread.start();
	}
	public void paint(Graphics g){
		g.setColor(Color.orange)
		g.fillRect(0, 0, WIDTH, HEIGHT);
		p1.draw(g);	
		b1.draw(g);
	}
	public void update(Graphics g) {
		paint(g);
	} 
	public void run(){
	    for(;;){
		   p1.move();
		   b1.move();

			repaint();
			try {
				Thread.sleep(10);

			} catch (interruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void keyPressed(KeyEvent e) {
	    if(e.getkeycode()==Keyevent.VK_UP){
			p1.setUpAcce(true);
		}else if(e.getkeycode()==Keyevent.VK_DOWN){
			p1.setDownAccel(true);
		}
		
	}

	public void keyReleased(KeyEvent e) {
		if(e.getkeycode()==Keyevent.VK_UP){
			p1.setUpAcce(false);
		}else if(e.getkeycode()==Keyevent.VK_DOWN){
			p1.setDownAccel(false);
		}
		
	}
	public void keyTyped() {
		
		
	}

}
