import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shapes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dessinez la forme géométrique ici
                Figure ellipse = new Ellipse(150, 50, Color.RED);
                ellipse.setBoundingBox(150, 200);
                ellipse.draw(g);

                Figure rectangle = new Rectangle(200, 200, Color.BLUE);
                rectangle.setBoundingBox(200, 100);
                rectangle.draw(g);

                Figure circle = new Circle(20, 20, Color.GREEN);
                circle.setBoundingBox(100, 100);
                circle.draw(g);

                Figure square = new Square(00, 100, Color.YELLOW);
                square.setBoundingBox(50, 50);
                square.draw(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
        Point point1 = new Point();
        System.out.println("Point 1: " + point1);

        Point point2 = new Point(3, 5);
        System.out.println("Point 2: " + point2);

        point1.setX(2);
        point1.setY(4);
        System.out.println("Point 1 mis a jour : " + point1);

    }

}
