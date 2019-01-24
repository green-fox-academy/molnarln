import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MultipleLinePlay {
    public static void mainDraw(Graphics graphics) {
        int multiplier = 2;
        int [] x = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320};
        int [] y = {20, 40, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 320};

        for (int i = 0; i < multiplier ; i++) {
            for (int k = 0; k < multiplier; k++) {

            graphics.setColor(Color.MAGENTA);
            for (int j = 0; j < x.length; j++) {
                graphics.drawLine((x[j]/multiplier)+i*320/multiplier, 0+k*320/multiplier, (320/multiplier)+i*320/multiplier, x[j]/multiplier+k*320/multiplier);

            }
            graphics.setColor(Color.cyan);
            for (int j = 0; j < y.length; j++) {
                graphics.drawLine(y[j]/multiplier+i*320/multiplier, 320/multiplier+k*320/multiplier, 0+i*320/multiplier, y[j]/multiplier+k*320/multiplier);

            }
            }


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