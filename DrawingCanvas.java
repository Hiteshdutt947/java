import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawingCanvas extends JPanel {
    private int prevX, prevY;
    private boolean drawing = false;
    private Color currentColor = Color.BLACK;

    public DrawingCanvas() {
        setBackground(Color.WHITE);

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                drawing = true;
                prevX = e.getX();
                prevY = e.getY();
            }

            public void mouseReleased(MouseEvent e) {
                drawing = false;
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (drawing) {
                    Graphics g = getGraphics();
                    g.setColor(currentColor);
                    g.drawLine(prevX, prevY, e.getX(), e.getY());
                    prevX = e.getX();
                    prevY = e.getY();
                }
            }
        });
    }

    public void clearCanvas() {
        repaint();
    }

    public void setColor(Color color) {
        this.currentColor = color;
    }
}
