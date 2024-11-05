import java.awt.*;
import java.awt.event.*;

public class MouseCoordinatesFrame15 extends Frame {
    private Label xLabel;
    private Label yLabel;

    public MouseCoordinatesFrame15() {
        setLayout(new FlowLayout());

        xLabel = new Label("X:");
        yLabel = new Label("Y:");
        add(xLabel);
        add(yLabel);

        TextField numericTextField = new TextField(10);
        numericTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (!Character.isDigit(e.getKeyChar()) || numericTextField.getText().length() >= 5) {
                    e.consume();
                }
            }
        });

        add(new Label("Enter Number:"));
        add(numericTextField);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                xLabel.setText("X: " + e.getX());
                yLabel.setText("Y: " + e.getY());
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseCoordinatesFrame15();
    }
}
