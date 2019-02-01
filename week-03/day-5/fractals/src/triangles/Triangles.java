package triangles;
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void Triangles(Graphics graphics) {
        int startX = 300;
        int startY = 0;
        int height = 250;
        int width = 300;
        graphics.drawLine(startX-width, startY, startX + width, startY);
        graphics.drawLine(startX - width, startY, startX, startY + height * 2);
        graphics.drawLine(startX + width, startY, startX, startY + height * 2);

        drawTriangles(graphics, startX, startY, height, width);
    }
    public static void drawTriangles(Graphics graphics, int startX, int startY, int height, int width){
        if (height > 5  ) {

            drawTriangles(graphics, startX - width / 2, startY, height / 2, width / 2);
            drawTriangles(graphics, startX + width / 2 , startY, height / 2, width / 2);
            drawTriangles(graphics, startX, startY + height, height/2, width / 2);

            graphics.drawLine(startX, startY, startX + width / 2, startY + height);
            graphics.drawLine(startX, startY, startX - width / 2, startY + height);
            graphics.drawLine(startX - width / 2, startY + height, startX + width / 2, startY + height);
        }else
            return;

    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Triangles.ImagePanel panel = new Triangles.ImagePanel();
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
            Triangles(graphics);
        }
    }
}