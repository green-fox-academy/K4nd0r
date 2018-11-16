package comp.greenfox;

import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTree2own {
  public static void mainDraw(Graphics g) {

    drawTree(g, WIDTH/2, HEIGHT + 10, -90, 13);
  }
  private static void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
    if (depth == 0) return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
    g.setColor(new Color(randomRgbColor(), 250, randomRgbColor()));
    g.drawLine(x1, y1, x2, y2);
    drawTree(g, x2, y2, angle - 20, depth - 1);
    drawTree(g, x2, y2, angle + 20, depth - 1);
//    Thread.sleep(100);
  }

  // Don't touch the code below
  static int WIDTH = 1920;
  static int HEIGHT = 1080;

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
  public static int randomRgbColor () {
    int randomColor = 1 + (int) (Math.random() * 255);
    return randomColor;
  }
}
