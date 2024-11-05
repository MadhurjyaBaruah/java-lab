import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LinearEquation extends JPanel implements ActionListener {

    // Set scaling factor for the entire GUI
    private static final double SCALE_FACTOR = 1.5; // Scale everything by 1.5x

    // Set scaling factor where each large square is 5 units and divided into 25 smaller squares
    private static final int BIG_SQUARE_SIZE = 50; // Size of each large square in pixels
    private static final int SMALL_SQUARE_SIZE = BIG_SQUARE_SIZE / 5; // Each small square is 1/5th of the large square

    // Timer for animation
    private Timer timer;
    private int currentPointIndex = 0; // Track which point is currently being animated

    // Define the points to animate
    private final Point[] points = {
        new Point(-2, -4),
        new Point(-1, -2),
        new Point(1, 2),
        new Point(2, 4)
    };

    public LinearEquation() {
        // Initialize the timer to call actionPerformed every 1000 milliseconds (1 second)
        timer = new Timer(1000, this);
        timer.start(); // Start the animation
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Use Graphics2D for scaling
        Graphics2D g2d = (Graphics2D) g;
        g2d.scale(SCALE_FACTOR, SCALE_FACTOR); // Scale the whole drawing

        // Set color for light green small square grid
        g.setColor(new Color(144, 238, 144)); // Light green color

        // Draw grid lines for the small squares (each large square has 25 small squares)
        for (int x = 100; x <= 700; x += SMALL_SQUARE_SIZE) {
            g.drawLine(x, 50, x, 450); // Vertical small grid lines
        }
        for (int y = 50; y <= 450; y += SMALL_SQUARE_SIZE) {
            g.drawLine(100, y, 700, y); // Horizontal small grid lines
        }

        // Set color for dark green big square grid
        g.setColor(new Color(0, 194, 58)); // Dark green color

        // Draw the larger squares representing 5 units each
        for (int x = 100; x <= 700; x += BIG_SQUARE_SIZE) {
            g.drawLine(x, 50, x, 450); // Vertical big grid lines
        }
        for (int y = 50; y <= 450; y += BIG_SQUARE_SIZE) {
            g.drawLine(100, y, 700, y); // Horizontal big grid lines
        }

        // Set color back to black for axes and line
        g.setColor(Color.BLACK);

        // Draw axes
        g.drawLine(100, 250, 700, 250); // X-axis
        g.drawLine(400, 50, 400, 450);  // Y-axis

        // Add arrow to positive X-axis (x)
        g.drawLine(700, 250, 690, 245); 
        g.drawLine(700, 250, 690, 255); 
        g.drawString("x", 705, 245); 

        // Add arrow to negative X-axis (x')
        g.drawLine(100, 250, 110, 245); 
        g.drawLine(100, 250, 110, 255); 
        g.drawString("x'", 75, 245); 

        // Add arrow to positive Y-axis (y)
        g.drawLine(400, 50, 395, 60); 
        g.drawLine(400, 50, 405, 60); 
        g.drawString("y", 410, 55); 

        // Add arrow to negative Y-axis (y')
        g.drawLine(400, 450, 395, 440); 
        g.drawLine(400, 450, 405, 440); 
        g.drawString("y'", 410, 445); 

        // Draw the animated line and points if the index is valid
        g.setColor(Color.BLUE); // Set the color for the coordinate labels on the line
        
        for (int i = 0; i <= currentPointIndex; i++) {
            int x = points[i].x;
            int y = points[i].y;
            g.drawString("(" + x + ", " + y + ")", 400 + x * BIG_SQUARE_SIZE - 15, 250 - y * BIG_SQUARE_SIZE - 5);
        }

        // Draw the line connecting the points animatedly
        if (currentPointIndex > 0) {
            for (int i = 0; i < currentPointIndex; i++) {
                int x1 = points[i].x;
                int y1 = points[i].y;
                int x2 = points[i + 1].x;
                int y2 = points[i + 1].y;
                g.drawLine(400 + x1 * BIG_SQUARE_SIZE, 250 - y1 * BIG_SQUARE_SIZE,
                           400 + x2 * BIG_SQUARE_SIZE, 250 - y2 * BIG_SQUARE_SIZE);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Increment the point index for animation
        if (currentPointIndex < points.length - 1) {
            currentPointIndex++;
        } else {
            currentPointIndex = 0; // Reset the index to loop the animation
        }
        repaint(); // Repaint the panel to show the new point and line
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Linear Plotter");
        LinearEquation panel = new LinearEquation();

        frame.add(panel);
        frame.setSize(1920, 1080); // Set window size to match screen resolution
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
