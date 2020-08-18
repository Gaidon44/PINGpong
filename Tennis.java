package pongGcm;

import java.applet.applet; 
import java.awt.graphics;

public class tennis extends applet{
    final int WIDTH=700, HEIGHT=500;
    public void init(){
        this.resize (WIDTH, HEIGHT);

    }
public void paint(Graphic g){
g.setcolor(color.red);
g.fillrect(0, 0, WIDTH, HEIGHT);
}
public void update(Graphic g){
paint(g);
}

}