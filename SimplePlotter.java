import javax.swing.*;
import java.awt.*;

public class SimplePlotter extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw axes
        g.drawLine(100, 250, 700, 250); // X-axis
        g.drawLine(400, 50, 400, 450);  // Y-axis

        // Draw the line for y = 2x + 1
        for (int x = -300; x < 300; x++) {
            int y = 2 * x + 1; // y = 2x + 1
            g.drawLine(400 + x, 250 - y, 400 + x + 1, 250 - (2 * (x + 1) + 1));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Linear Plotter");
        SimplePlotter panel = new SimplePlotter();
        
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}