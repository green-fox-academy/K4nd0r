package comp.greenfox;

import javax.swing.*;

import java.awt.*;

import java.util.Timer;
import java.util.TimerTask;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalTree2own {

  static Timer timer = new Timer();
  static int seconds = 100;


  public static void mainDraw(Graphics g) {

    drawTree(g, WIDTH/2, HEIGHT - 80, -90, 9);

  }

  private static void drawTree(Graphics g, int x1, int y1, double angle, int depth) {


    TimerTask task;
    task = new TimerTask() {
      private final int MAX_SECONDS = 1000;

      @Override
      public void run() {
        if (seconds < MAX_SECONDS) {
          System.out.println("Seconds = " + seconds);
          seconds = seconds + seconds;
        } else {
          // stop the timer
          cancel();
        }
      }
    };
    if (depth == 0) return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
    g.setColor(new Color(randomRgbColor(), randomRgbColor(), randomRgbColor()));
    g.drawLine(x1, y1, x2, y2);
    drawTree(g, x2, y2, angle - 20, depth - 1);
    drawTree(g, x2, y2, angle + 20, depth - 1);
  }

  // Don't touch the code below
  static int WIDTH = 1280;
  static int HEIGHT = 720;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("FractalTree");
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
