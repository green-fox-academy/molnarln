import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesV2 {
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

        int resolution = 10;
        for (int i = 0; i < 20; i++) {
            graphics.drawLine(160-i*resolution, i*resolution, 160+i*resolution, i*resolution);
        }

        for (int i = 0; i < 20; i++) {
            graphics.drawLine(i*resolution, 160, 160+i*resolution, i*resolution);
        }

        for (int i = 0; i < 20; i++) {
            graphics.drawLine(160-i*resolution, i*resolution , 320-i*resolution, 160);
        }


        /*for (int i = 0; i < 10; i++) {
            graphics.drawLine(160-i*resolution, i*resolution, 160+i*resolution, i*resolution);
        }*/



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
