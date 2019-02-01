package fractalyellow;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalYellowV2 {
    public static void FractalYellowV2(Graphics graphics) {
        int startX = 0;
        int startY = 0;
        int size = 729;
        graphics.setColor(Color.yellow);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
        graphics.setColor(Color.BLACK);
        drawYellowFractalV2(graphics, startX, startY, size);

    }
    public static void drawYellowFractalV2(Graphics graphics, int startX, int startY, int size){
        if (size > 0) {
            drawYellowFractalV2(graphics, startX + size / 3, startY, size/3);
            drawYellowFractalV2(graphics, startX + size * 2 / 3, startY+size/3, size/3);
            drawYellowFractalV2(graphics, startX, startY + size / 3, size/3);
            drawYellowFractalV2(graphics, startX+size/3, startY + size * 2 / 3, size/3);

            graphics.drawLine(startX + size / 3, startY, startX + size / 3, startY + size);
            graphics.drawLine(startX + size * 2 / 3, startY, startX + size * 2 / 3, startY + size);
            graphics.drawLine(startX, startY + size / 3, startX + size, startY + size / 3);
            graphics.drawLine(startX, startY + size * 2 / 3, startX + size, startY + size * 2 / 3);
        }else
            return;

    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        FractalYellowV2.ImagePanel panel = new FractalYellowV2.ImagePanel();
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
            FractalYellowV2(graphics);
        }
    }
}