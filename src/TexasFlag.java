import java.awt.*;
import javax.swing.*;

public class TexasFlag extends JComponent {

    JFrame frame = new JFrame("Texas Flag");
    Container content = frame.getContentPane();

    public static void main(String[] args) {
        TexasFlag drawing = new TexasFlag();
        drawing.setUp();
    }

    public void setUp() {
        content.setBackground(Color.WHITE);
        content.add(this);

        frame.setSize(615, 435);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE); // Blue stripe
        g.fillRect(0, 0, 200, 400);

        g.setColor(Color.RED); // Red stripe
        g.fillRect(200, 200, 600, 400);

        g.setColor(Color.WHITE); // Lone star
        int xpoints[] = {100, 114, 165, 125, 140, 100, 60, 75, 35, 86, 100};
        int ypoints[] = {124, 175, 175, 202, 250, 216, 250, 202, 175, 175, 124};
        g.fillPolygon(xpoints, ypoints, 11);
    }
}
