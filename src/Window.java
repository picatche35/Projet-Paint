import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

    public Window(String title, int x, int y) {
        super(title);
        this.setSize(x, y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane();

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        menu1.add(open);
        menuBar.add(menu1);

        JButton okButton = new JButton("Que viva ENSEA!");
        contentPanel.add(okButton);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Window win = new Window("Paint it black", 800, 600);

    }
}