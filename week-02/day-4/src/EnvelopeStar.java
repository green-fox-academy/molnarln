import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int [] x = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320};
        int [] y = {0, 20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320};

        graphics.setColor(Color.magenta);
        for (int i = 0; i < (x.length)/2; i++) {
            graphics.drawLine(160, y[i], 160 + x[i], 160);
            graphics.drawLine(160, y[i], 160 - x[i], 160);
            graphics.drawLine( x[i], 160, 160, 160+x[i]);

        }

        graphics.setColor(Color.magenta);
        for (int i = 0; i < (x.length)/2; i++) {

        }
        graphics.setColor(Color.magenta);
        for (int i = 0; i < (x.length)/2; i++) {

        }
        graphics.setColor(Color.magenta);
        for (int i = 0; i <= (x.length)/2; i++) {
            graphics.drawLine( 160, 160+x[i],320 - x[i], 160);

        }

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