package comp.greenfox;

import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
//        int xpoints[] = {10, 310, 310, 10};
//        int ypoints[] = {10, 10, 310, 310};
//        graphics.setColor(Color.CYAN);
//        graphics.drawPolygon(xpoints, ypoints, 4);
        // One color^^
        graphics.setColor(Color.CYAN);
        graphics.drawLine(10,10,310,10);
        graphics.setColor(Color.RED);
        graphics.drawLine(310,10,310,310);
        graphics.setColor(Color.DARK_GRAY);
        graphics.drawLine(310,310,10,310);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(10,10,10,310);




    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
