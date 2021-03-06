import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Add the number of rows!");
        int num = scanner.nextInt();*/
/*            System.out.println();
            double sideSize = 20;
            double height = sideSize*((Math.pow(3, 0.5))/2);
            double[] peak = {160, 0};
            double[] bottom = {160-sideSize/2, height, 160+sideSize/2, height };
            double[] x = {160, 160-sideSize/2, 160+sideSize/2,};
            double[] y = {0, height, height};
            graphics.drawPolygon(x, y, 3);*/

        int height = 30;
        int base = 30;
        int resolution = 30;
        int startPointX = WIDTH/2;

        for (int i = 0; i <= resolution; i++) {
            graphics.drawLine(startPointX - i * base / 2, i * height, startPointX + i * base / 2, i * height);
        }
        for (int i = 0; i < resolution; i++) {
            graphics.drawLine(startPointX + i * base / 2, i * height, startPointX-(resolution*base)/2+i*base, resolution*height);
        }

        for (int i = 0; i < resolution; i++) {
            graphics.drawLine(startPointX - i * base / 2, i*height , startPointX+(resolution*base)/2-i*base, resolution*height);
        }

    }

    // Don't touch the code below
    static int WIDTH = 1200;
    static int HEIGHT = 1200;

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
