import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Figure {

    public Ellipse(int px, int py, Color c) {

        super(c, new Point(px, py));
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        setLength(heightBB);
        setWidth(widthBB);
    }
    private void setLength(int length) {
        this.length = length;
    }

    private void setWidth(int width) {
        this.width = width;
    }

   @Override
    public void draw(Graphics g) {
       g.setColor(color);
       g.drawOval(origin.getX(), origin.getY(), width, length);
       g.fillOval(origin.getX(), origin.getY(), width, length);
    }
}
