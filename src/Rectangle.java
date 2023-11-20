import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Figure {
    public Rectangle(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
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
    public void draw (Graphics g) {
        g.setColor(color);
        g.drawRect(origin.getX(), origin.getY(), width, length);
        g.fillRect(origin.getX(), origin.getY(), width, length);
    }
}

