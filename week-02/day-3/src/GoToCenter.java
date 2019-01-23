import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Give the coordinate x!");
            int x = scanner.nextInt();
            System.out.println("Give the coordinate y!");
            int y = scanner.nextInt();
            /*System.out.println("Give the color!");
            int g = scanner.nextInt();*/
            drawLines(x, y, graphics);
        }
    }
    public static void drawLines (int x, int y, Graphics graphics){

            graphics.drawLine(x,y,160,160);
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