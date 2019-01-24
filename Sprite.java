
import java.awt.*;
import java.awt.event.*;
//import sun.java2d.*;
import javax.swing.*;

public class Sprite{
    int x, y, width, height;

    public void moveup(int distance){
        y -= distance;
    }
    public void moveleft(int distance){
        x -= distance;
    }
    public void moveRight(int distance){
        x += distance;
    }
    public void moveDown(int distance){
        x += distance;
    }
    Color color = Color.RED;
    public Sprite (int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color =  color;
    }

    public void paint(Gracics g){
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }

}
