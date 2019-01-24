import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStarV2 {
    public static void mainDraw(Graphics graphics) {

        int resolution= 20;
        int [] a = new int[resolution];
        for (int i = 0; i < resolution; i++) {
            a[i] = (320 / resolution)*i;
        }
        System.out.println(Arrays.toString(a));

        graphics.setColor(Color.magenta);
        for (int i = 0; i < (a.length)/2; i++) {
            graphics.drawLine(160, a[i], 160 + a[i], 160);

        }

        graphics.setColor(Color.magenta);
        for (int i = 0; i < (a.length)/2; i++) {
            graphics.drawLine(160, a[i], 160 - a[i], 160);

        }
        graphics.setColor(Color.magenta);
        for (int i = 1; i < (a.length)/2; i++) {
            graphics.drawLine( a[i], 160, 160, 160+a[i]);

        }
        graphics.setColor(Color.magenta);
        for (int i = 1; i <= (a.length)/2; i++) {
            graphics.drawLine( 160, 160+a[i],320 - a[i], 160);

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