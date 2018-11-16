package comp.greenfox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Test {

  public static void main(String[] args) {
    new Test();
  }

  public Test() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }

        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TestPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }
    });
  }

  public class TestPane extends JPanel {

    private List<Shape> shapes;
    private int yPos = 0;

    public TestPane() {
      shapes = new ArrayList<>(25);

      Timer timer = new Timer(500, new ActionListener() {
          private void drawTree (Graphics g,int x1, int y1, double angle, int depth){
            if (depth == 0) return;
            int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
            int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
            g.setColor(new Color(randomRgbColor(), randomRgbColor(), randomRgbColor()));
            g.drawLine(x1, y1, x2, y2);
            drawTree(g, x2, y2, angle - 20, depth - 1);
            drawTree(g, x2, y2, angle + 20, depth - 1);
            repaint();

          }
      });
      timer.setInitialDelay(500);
      timer.start();
    }

    @Override
    public Dimension getPreferredSize() {
      return new Dimension(200, 200);
    }

    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g.create();
      for (Shape line : shapes) {
        g2d.draw(line);
      }
      g2d.dispose();
    }
    public int randomRgbColor () {
      int randomColor = 1 + (int) (Math.random() * 255);
      return randomColor;
    }

  }

}
