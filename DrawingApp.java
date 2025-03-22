import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DrawingApp extends Applet {
    DrawingCanvas canvas = new DrawingCanvas();
    
    public void init() {
        setLayout(new BorderLayout());
        add(canvas, BorderLayout.CENTER);

        Panel panel = new Panel();
        Button clearButton = new Button("Clear");
        Button blackButton = new Button("Black");
        Button redButton = new Button("Red");
        Button blueButton = new Button("Blue");

        panel.add(blackButton);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(clearButton);

        add(panel, BorderLayout.SOUTH);

        // Event Listeners
        blackButton.addActionListener(e -> canvas.setColor(Color.BLACK));
        redButton.addActionListener(e -> canvas.setColor(Color.RED));
        blueButton.addActionListener(e -> canvas.setColor(Color.BLUE));
        clearButton.addActionListener(e -> canvas.clearCanvas());
    }
}
