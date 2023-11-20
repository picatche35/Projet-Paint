import java.awt.Color;
import java.awt.Graphics;

public class Square extends Figure {
    public Square(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public void setBoundingBox(int length, int ignored) {
        setLength(length);
        setWidth(length);
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
        g.drawRect(origin.getX(), origin.getY(), width, length);
        g.fillRect(origin.getX(), origin.getY(), width, length);
    }
}