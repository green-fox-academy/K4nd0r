package comp.greenfox;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Spiral {
    public static void mainDraw(Graphics graphics) {
        int num = 30;


        for (int i = 0; i < num; i = i + 1) {
            int x = i * WIDTH / (num - 1);
            int y = i * HEIGHT / (num - 1);
            graphics.setColor(Color.RED);
            graphics.drawLine(0, y, x, HEIGHT);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(x, 0, WIDTH, y);
        }
    }

        // Don't touch the code below
        static int WIDTH = 400;
        static int HEIGHT = 400;

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



