

public class Sprite{
    int x, y, width, height;

    public moveup(int distance){
        y -= distance;
    }
    public moveleft(int distance){
        x -= distance;
    }
    public moveRight(int distance){
        x += distance;
    }
    public moveDown(int distance){
        x += distance
    }

    public sprite (int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void paint(Gracics g){
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }

}
