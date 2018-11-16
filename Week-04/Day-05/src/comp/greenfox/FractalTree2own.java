package comp.greenfox;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTree2own {
  public static void mainDraw(Graphics g) {
    drawTree(g, 400, 500, -90, 9);
  }
  private static void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
    if (depth == 0) return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
    g.drawLine(x1, y1, x2, y2);
    drawTree(g, x2, y2, angle - 20, depth - 1);
    drawTree(g, x2, y2, angle + 20, depth - 1);
  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 600;

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
