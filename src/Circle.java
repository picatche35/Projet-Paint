import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Figure {
    public Circle(int px, int py, Color c) {
        super(c, new Point(px, py));
    }

    @Override
    public void setBoundingBox(int diameter, int ignored) {
        setDiameter(diameter);
    }

    private void setDiameter(int diameter) {
        this.width = diameter;
        this.length = diameter;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(origin.getX(), origin.getY(), width, length);
        g.fillOval(origin.getX(), origin.getY(), width, length);
    }
}