import java.awt.*;

public abstract class Figure {
    protected Color color;
    protected Point origin;
    protected int length; // Ajout de la variable length
    protected int width;  // Ajout de la variable width
// constructeurs
    public Figure(Color color, Point origin) {
        this.color = color;
        this.origin = origin;
    }
//get
    public Color getColor() {
        return color;
    }
    public Point getOrigin() {
        return origin;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
//La méthode setBoundingBox est déclarée comme abstraite et sera implémentée dans les sous-classes pour définir les valeurs de la largeur et de la longueur
    public abstract void setBoundingBox(int heightBB, int widthBB);
//toString est remplacée pour afficher les informations appropriées sur l'état de l'objet Figure
    @Override
    public String toString() {
        return "Figure: color=" + color + ", origin=" + origin + ", width=" + width + ", length=" + length;
    }

    public abstract void draw (Graphics g);
}